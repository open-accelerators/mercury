package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.event.KafkaEventSource;
import com.redhat.mercury.operator.model.KafkaConfig;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatus;

import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.Controller;
import io.javaoperatorsdk.operator.api.DeleteControl;
import io.javaoperatorsdk.operator.api.ResourceController;
import io.javaoperatorsdk.operator.api.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaBuilder;
import io.strimzi.api.kafka.model.KafkaClusterSpecBuilder;
import io.strimzi.api.kafka.model.ZookeeperClusterSpecBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListenerBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.status.ListenerStatus;
import io.strimzi.api.kafka.model.storage.EphemeralStorage;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorageBuilder;
import io.strimzi.api.kafka.model.storage.SingleVolumeStorage;
import io.strimzi.api.kafka.model.storage.Storage;

import static com.redhat.mercury.operator.event.KafkaEventSource.MANAGED_BY_LABEL;
import static com.redhat.mercury.operator.event.KafkaEventSource.OPERATOR_NAME;

@Controller
public class ServiceDomainClusterController implements ResourceController<ServiceDomainCluster> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainClusterController.class);
    public static final String SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND = "ServiceDomainCluster";
    public static final String SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION = "mercury.redhat.io/v1alpha1";
    public static final String KAFKA_LISTENER_TYPE_PLAIN = "plain";
    private static final String DEFAULT_PERSISTENT_STORAGE = "10Gi";

    @Inject
    KubernetesClient client;

    @Override
    public void init(EventSourceManager eventSourceManager) {
        eventSourceManager.registerEventSource("kafka-event-source", KafkaEventSource.createAndRegisterWatch(client));
    }

    @Override
    public DeleteControl deleteResource(ServiceDomainCluster sdc, Context<ServiceDomainCluster> context) {
        String sdName = sdc.getMetadata().getName();
        LOGGER.debug("{} service domain cluster deleted successfully", sdName);
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomainCluster> createOrUpdateResource(ServiceDomainCluster sdc, Context<ServiceDomainCluster> context) {
        ServiceDomainClusterStatus status = new ServiceDomainClusterStatus();
        try {
            createOrUpdateKafkaBroker(sdc);
            updateStatusWithKafkaBrokerUrl(sdc, status);
        } catch (Exception e) {
            LOGGER.error("{} service domain cluster failed to be created/updated", sdc.getMetadata().getName(), e);
            status.setError(e.getMessage());
        }

        return UpdateControl.updateStatusSubResource(sdc);
    }

    private void updateStatusWithKafkaBrokerUrl(ServiceDomainCluster sdc, ServiceDomainClusterStatus status) {
        Kafka kafka;

        try {
            kafka = client.resources(Kafka.class)
                    .inNamespace(sdc.getMetadata().getNamespace())
                    .withName(sdc.getMetadata().getName())
                    .get();
        } catch (KubernetesClientException e) {
            LOGGER.error("Unable to retrieve Kafka {}", sdc.getMetadata().getName(), e);
            return;
        }

        if (isKafkaBrokerReady(kafka)) {
            final List<ListenerStatus> listeners = kafka.getStatus().getListeners();

            final ListenerStatus listenerStatus = listeners.stream()
                    .filter(x -> KAFKA_LISTENER_TYPE_PLAIN.equals(x.getType()))
                    .findFirst().orElse(null);

            if (listenerStatus != null) {
                status.setKafkaBroker(listenerStatus.getBootstrapServers());
                sdc.setStatus(status);
            }
        }
    }

    private boolean isKafkaBrokerReady(Kafka kafka) {
        return kafka != null && kafka.getStatus() != null && kafka.getStatus().getListeners() != null;
    }

    private void createOrUpdateKafkaBroker(ServiceDomainCluster sdc) {
        final String sdcName = sdc.getMetadata().getName();
        final String sdcNamespace = sdc.getMetadata().getNamespace();

        Kafka desiredKafka = createKafkaObj(sdc);

        Kafka currentKafka = null;
        try {
            currentKafka = client.resources(Kafka.class)
                    .inNamespace(sdcNamespace)
                    .withName(sdcName)
                    .get();
        } catch (KubernetesClientException e) {
            LOGGER.debug("Unable to retrieve Kafka resource with name: {}", sdcName);
        }

        if (currentKafka == null || !Objects.equals(currentKafka.getSpec(), desiredKafka.getSpec())) {
            client.resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).createOrReplace(desiredKafka);
            LOGGER.debug("Kafka {} was created or updated", sdcName);
        }
    }

    Kafka createKafkaObj(ServiceDomainCluster sdc) {
        Kafka desiredKafka = new KafkaBuilder()
                .withNewMetadata()
                .withName(sdc.getMetadata().getName())
                .withNamespace(sdc.getMetadata().getNamespace())
                .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
                .endMetadata()
                .withNewSpec()
                .withKafka(new KafkaClusterSpecBuilder()
                        .withReplicas(sdc.getSpec().getKafka().getReplicas())
                        .withListeners(new GenericKafkaListenerBuilder()
                                        .withName("plain")
                                        .withPort(9092)
                                        .withType(KafkaListenerType.INTERNAL)
                                        .withTls(false).build(),
                                new GenericKafkaListenerBuilder()
                                        .withName("tls")
                                        .withPort(9093)
                                        .withType(KafkaListenerType.INTERNAL)
                                        .withTls(true).build())
                        .withConfig(Map.of("offsets.topic.replication.factor", sdc.getSpec().getKafka().getReplicas(),
                                "transaction.state.log.replication.factor", sdc.getSpec().getKafka().getReplicas(),
                                "transaction.state.log.min.isr", getMinIsr(sdc.getSpec().getKafka().getReplicas())))
                        .withStorage(buildKafkaStorage(sdc.getSpec().getKafka()))
                        .build())
                .withZookeeper(new ZookeeperClusterSpecBuilder()
                        .withReplicas(sdc.getSpec().getKafka().getReplicas())
                        .withStorage(buildKafkaStorage(sdc.getSpec().getKafka()))
                        .build())
                .endSpec()
                .build();

        desiredKafka.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sdc.getMetadata().getName())
                .withUid(sdc.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION)
                .build()));
        return desiredKafka;
    }

    private int getMinIsr(Integer replicas) {
        return replicas / 2 + 1;
    }

    private SingleVolumeStorage buildKafkaStorage(KafkaConfig config) {
        switch (config.getStorage().getType()) {
            case Storage.TYPE_EPHEMERAL:
                return new EphemeralStorage();
            case Storage.TYPE_PERSISTENT_CLAIM:
                Optional<String> size = Optional.of(config.getStorage().getSize());
                return new PersistentClaimStorageBuilder()
                        .withSize(size.orElse(DEFAULT_PERSISTENT_STORAGE))
                        .build();
            default:
                throw new IllegalArgumentException("Unsupported kafka storage type: "
                        + config.getStorage().getType()
                        + " supported values are 'ephemeral' and 'persistent-volume-claim'");
        }
    }
}
