package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.model.KafkaConfig;
import com.redhat.mercury.operator.model.MercuryConstants;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpec;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatus;

import io.fabric8.kubernetes.api.model.ConditionBuilder;
import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.client.informers.SharedIndexInformer;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceContext;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceInitializer;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
import io.strimzi.api.kafka.model.EntityOperatorSpecBuilder;
import io.strimzi.api.kafka.model.EntityTopicOperatorSpecBuilder;
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

import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_FALSE;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.CONDITION_KAFKA_BROKER_READY;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.MESSAGE_KAFKA_BROKER_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.REASON_KAFKA_EXCEPTION;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.REASON_KAFKA_WAITING;

@ControllerConfiguration
public class ServiceDomainClusterController extends AbstractController<ServiceDomainClusterSpec, ServiceDomainClusterStatus, ServiceDomainCluster> implements Reconciler<ServiceDomainCluster>, EventSourceInitializer<ServiceDomainCluster> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainClusterController.class);

    private static final String DEFAULT_PERSISTENT_STORAGE = "100Gi";
    public static final String KAFKA_LISTENER_TYPE_PLAIN = "plain";
    private static final String KAFKA_VERSION = "3.0.0";
    private static final String BROKER_PROTOCOL_VERSION = "3.0";

    @Override
    public List<EventSource> prepareEventSources(EventSourceContext<ServiceDomainCluster> context) {
        SharedIndexInformer<Kafka> kafkaInformer = client.resources(Kafka.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        return List.of(getInformerEventSource(kafkaInformer));
    }

    @Override
    public UpdateControl<ServiceDomainCluster> reconcile(ServiceDomainCluster sdc, Context context) {
        try {
            UpdateControl<ServiceDomainCluster> control = createOrUpdateKafkaBroker(sdc);
            if (control.isUpdateStatus()) {
                return control;
            }
            return updateStatusWithKafkaBrokerUrl(sdc);
        } catch (Exception e) {
            LOGGER.error("{} service domain cluster failed to be created/updated", sdc.getMetadata().getName(), e);
            return updateStatusWithCondition(sdc, new ConditionBuilder()
                    .withType(CONDITION_KAFKA_BROKER_READY)
                    .withStatus(STATUS_FALSE)
                    .withReason(REASON_KAFKA_EXCEPTION)
                    .withMessage(e.getMessage())
                    .build());
        }
    }

    private UpdateControl<ServiceDomainCluster> updateStatusWithKafkaBrokerUrl(ServiceDomainCluster sdc) {
        Kafka kafka = client.resources(Kafka.class)
                .inNamespace(sdc.getMetadata().getNamespace())
                .withName(sdc.getMetadata().getName())
                .get();

        if (isKafkaBrokerReady(kafka)) {
            LOGGER.debug("KafkaBroker for {} is Ready", sdc.getMetadata().getName());
            List<ListenerStatus> listeners = kafka.getStatus().getListeners();
            Optional<ListenerStatus> listenerStatus = listeners.stream()
                    .filter(x -> KAFKA_LISTENER_TYPE_PLAIN.equals(x.getType()))
                    .findFirst();
            if (listenerStatus.isPresent()) {
                LOGGER.debug("Assigning Kafka bootstrapServer with value {} to {}",
                        listenerStatus.get().getBootstrapServers(), sdc.getMetadata().getName());
                sdc.getStatus().setKafkaBroker(listenerStatus.get().getBootstrapServers());
            }
            return updateStatusWithReadyCondition(sdc, CONDITION_KAFKA_BROKER_READY);
        }
        LOGGER.debug("KafkaBroker for {} is not yet Ready", sdc.getMetadata().getName());
        return updateStatusWithCondition(sdc, new ConditionBuilder()
                .withType(CONDITION_KAFKA_BROKER_READY)
                .withStatus(STATUS_FALSE)
                .withReason(REASON_KAFKA_WAITING)
                .withMessage(MESSAGE_KAFKA_BROKER_NOT_READY)
                .build());
    }

    private boolean isKafkaBrokerReady(Kafka kafka) {
        if (kafka == null || kafka.getStatus() == null) {
            return false;
        }
        Optional<io.strimzi.api.kafka.model.status.Condition> condition = kafka.getStatus()
                .getConditions()
                .stream()
                .filter(c -> c.getType().equals(CONDITION_READY))
                .findFirst();
        return condition.isPresent() && condition.get().getStatus().equals(STATUS_TRUE);
    }

    private UpdateControl<ServiceDomainCluster> createOrUpdateKafkaBroker(ServiceDomainCluster sdc) {
        final String sdcName = sdc.getMetadata().getName();
        Kafka desiredKafka = createKafkaObj(sdc);
        Kafka currentKafka = client.resources(Kafka.class)
                .inNamespace(sdc.getMetadata().getNamespace())
                .withName(sdcName)
                .get();

        if (currentKafka == null || !Objects.equals(currentKafka.getSpec(), desiredKafka.getSpec())) {
            LOGGER.debug("Creating or replacing Kafka {}", desiredKafka);
            currentKafka = client.resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).createOrReplace(desiredKafka);
            LOGGER.debug("Created or replaced Kafka {}", currentKafka);
            return updateStatusWithCondition(sdc, new ConditionBuilder()
                    .withType(CONDITION_KAFKA_BROKER_READY)
                    .withStatus(STATUS_FALSE)
                    .withReason(REASON_KAFKA_WAITING)
                    .withMessage(MESSAGE_KAFKA_BROKER_NOT_READY)
                    .build());
        }
        LOGGER.debug("Kafka {} was not updated", sdcName);
        return UpdateControl.noUpdate();
    }

    private UpdateControl<ServiceDomainCluster> updateStatusWithReadyCondition(ServiceDomainCluster resource, String condition) {
        return updateStatusWithCondition(resource, new ConditionBuilder()
                .withType(condition)
                .withStatus(STATUS_TRUE)
                .build());
    }

    protected Kafka createKafkaObj(ServiceDomainCluster sdc) {
        Kafka desiredKafka = new KafkaBuilder()
                .withNewMetadata()
                .withName(sdc.getMetadata().getName())
                .withNamespace(sdc.getMetadata().getNamespace())
                .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
                .endMetadata()
                .withNewSpec()
                .withEntityOperator(new EntityOperatorSpecBuilder()
                        .withTopicOperator(new EntityTopicOperatorSpecBuilder().build())
                        .build())
                .withKafka(new KafkaClusterSpecBuilder()
                        .withReplicas(sdc.getSpec().getKafka().getReplicas())
                        .withListeners(new GenericKafkaListenerBuilder()
                                        .withName("plain")
                                        .withPort(9092)
                                        .withType(KafkaListenerType.INTERNAL)
                                        .withTls(false)
                                        .build(),
                                new GenericKafkaListenerBuilder()
                                        .withName("tls")
                                        .withPort(9093)
                                        .withType(KafkaListenerType.INTERNAL)
                                        .withTls(true)
                                        .build())
                        .withVersion(KAFKA_VERSION)
                        .withConfig(Map.of(
                                "inter.broker.protocol.version", BROKER_PROTOCOL_VERSION,
                                "default.replication.factor", sdc.getSpec().getKafka().getReplicas(),
                                "offsets.topic.replication.factor", sdc.getSpec().getKafka().getReplicas(),
                                "transaction.state.log.replication.factor", sdc.getSpec().getKafka().getReplicas(),
                                "transaction.state.log.min.isr", getMinIsr(sdc.getSpec().getKafka().getReplicas()),
                                "min.insync.replicas", getMinIsr(sdc.getSpec().getKafka().getReplicas())))
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
                .withKind(ServiceDomainCluster.class.getSimpleName())
                .withApiVersion(MercuryConstants.API_VERSION)
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
