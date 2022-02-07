package com.redhat.mercury.operator.controller;

import java.util.Optional;

import javax.inject.Inject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.operator.model.KafkaStorageBuilder;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterBuilder;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpecBuilder;
import com.redhat.mercury.operator.utils.ResourceUtils;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListener;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorage;
import io.strimzi.api.kafka.model.storage.Storage;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.KAFKA_LISTENER_TYPE_PLAIN;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.CONDITION_KAFKA_BROKER_READY;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.MESSAGE_KAFKA_BROKER_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.REASON_KAFKA_EXCEPTION;
import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.REASON_KAFKA_WAITING;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainClusterControllerTest extends AbstractControllerTest {

    @Inject
    ServiceDomainClusterController controller;

    @AfterEach
    public void afterEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();
        client.namespaces().withName(SERVICE_DOMAIN_CLUSTER_NAMESPACE).delete();
        client.resources(ServiceDomainCluster.class).inAnyNamespace().list()
                .getItems().forEach(sdc ->
                {
                    client.resources(ServiceDomainCluster.class)
                            .inNamespace(sdc.getMetadata().getNamespace())
                            .withName(sdc.getMetadata().getName())
                            .delete();
                    await().atMost(2, MINUTES)
                            .until(() -> client.resources(ServiceDomainCluster.class)
                                    .inNamespace(sdc.getMetadata().getNamespace())
                                    .withName(sdc.getMetadata().getName()).get() == null);
                });

        client.resources(Kafka.class).inAnyNamespace().list()
                .getItems().forEach(kafka ->
                {
                    client.resources(Kafka.class)
                            .inNamespace(kafka.getMetadata().getNamespace())
                            .withName(kafka.getMetadata().getName())
                            .delete();
                    await().atMost(2, MINUTES)
                            .until(() -> client.resources(Kafka.class)
                                    .inNamespace(kafka.getMetadata().getNamespace())
                                    .withName(kafka.getMetadata().getName()).get() == null);
                });
    }

    @Test
    void testCreateKafkaInvalidStorageType() {
        ServiceDomainCluster sdc = buildDefaultSDC();
        sdc.getSpec().getKafka()
                .setStorage(new KafkaStorageBuilder().withType("invalid type").build());
        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getScheduleDelay()).isEmpty();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_EXCEPTION);
        assertThat(condition.getMessage()).isEqualTo("Unsupported kafka storage type: invalid type supported values are 'ephemeral' and 'persistent-volume-claim'");
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertThat(kafka).isNull();
    }

    @Test
    void testCreateKafkaWithException() {
        ServiceDomainCluster sdc = buildDefaultSDC();
        String exceptionMessage = "Test exception";
        mockServer.expect().post()
                .withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas")
                .andReturn(500, new KubernetesClientException(exceptionMessage))
                .once();

        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_EXCEPTION);
        assertThat(condition.getMessage()).contains(exceptionMessage);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertThat(kafka).isNull();
    }

    @Test
    void testCreateDefaultKafka() {
        ServiceDomainCluster sdc = buildDefaultSDC();
        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);
    }

    @Test
    void testReplaceDefaultKafka() {
        ServiceDomainCluster sdc = buildDefaultSDC();
        Kafka current = new KafkaBuilder()
                .withNewMetadata()
                .withName(sdc.getMetadata().getName())
                .withNamespace(sdc.getMetadata().getNamespace()).endMetadata()
                .withNewSpec().withNewKafka().withReplicas(3).endKafka().endSpec()
                .build();
        mockServer.expect().get().withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas/my-sdc")
                .andReturn(200, current).once();

        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);
    }

    @Test
    void testWaitingForKafkaDeployment() {
        ServiceDomainCluster sdc = buildDefaultSDC();

        // Create Kafka
        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);

        // Update Kafka
        update = controller.reconcile(sdc, null);
        assertThat(update.isNoUpdate()).isTrue();
    }

    @Test
    void testKafkaDeploymentReady() {
        ServiceDomainCluster sdc = buildDefaultSDC();

        // Create Kafka
        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);

        // Update Kafka
        kafka.setStatus(new KafkaStatusBuilder().withListeners(new ListenerStatusBuilder()
                        .withType(KAFKA_LISTENER_TYPE_PLAIN)
                        .withAddresses(new ListenerAddressBuilder()
                                .withHost("my-kafka.example.com")
                                .withPort(9092)
                                .build())
                        .build())
                .build());
        mockServer.expect().get().withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas/my-sdc")
                .andReturn(200, kafka).times(2);
        update = controller.reconcile(sdc, null);
        assertThat(update.getResource().getStatus().isReady()).isTrue();
        assertThat(update.getResource().getStatus().getKafkaBroker()).isEqualTo("my-kafka.example.com:9092");

        condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(STATUS_TRUE);
        assertThat(condition.getLastTransitionTime()).isNotBlank();
        assertThat(condition.getReason()).isNull();
        assertThat(condition.getMessage()).isNull();
    }

    @Test
    void testCreateProductionKafka() {
        ServiceDomainCluster sdc = new ServiceDomainClusterBuilder()
                .withMetadata(new ObjectMetaBuilder()
                        .withName("my-sdc")
                        .withNamespace(SERVICE_DOMAIN_CLUSTER_NAMESPACE)
                        .build())
                .withSpec(new ServiceDomainClusterSpecBuilder()
                        .withNewKafka()
                        .withReplicas(3)
                        .withNewStorage()
                        .withType(Storage.TYPE_PERSISTENT_CLAIM)
                        .withSize("1Gi")
                        .endStorage()
                        .endKafka()
                        .build())
                .build();
        UpdateControl<ServiceDomainCluster> update = controller.reconcile(sdc, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsNotReady(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdc.getMetadata().getNamespace()).withName(sdc.getMetadata().getName()).get();
        assertThat(kafka).isNotNull();
        // Kafka Config
        assertThat(kafka.getSpec().getKafka().getConfig())
                .containsEntry("offsets.topic.replication.factor", 3)
                .containsEntry("transaction.state.log.replication.factor", 3)
                .containsEntry("transaction.state.log.min.isr", 2);
        // Kafka Listeners
        // PLAIN
        assertThat(kafka.getSpec().getKafka().getListeners()).hasSize(2);
        Optional<GenericKafkaListener> listener = kafka.getSpec().getKafka().getListeners().stream().filter(l -> l.getName().equals("plain")).findFirst();
        assertThat(listener).isPresent();
        assertThat(listener.get().getType()).isEqualTo(KafkaListenerType.INTERNAL);
        assertThat(listener.get().getPort()).isEqualTo(9092);
        assertThat(listener.get().isTls()).isFalse();
        assertThat(listener.get().getAuth()).isNull();
        // TLS
        listener = kafka.getSpec().getKafka().getListeners().stream().filter(l -> l.getName().equals("tls")).findFirst();
        assertThat(listener).isPresent();
        assertThat(listener.get().getType()).isEqualTo(KafkaListenerType.INTERNAL);
        assertThat(listener.get().getPort()).isEqualTo(9093);
        assertThat(listener.get().isTls()).isTrue();
        assertThat(listener.get().getAuth()).isNull();
        // Kafka Storage
        assertThat(kafka.getSpec().getKafka().getReplicas()).isEqualTo(sdc.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getKafka().getStorage().getType()).isEqualTo(sdc.getSpec().getKafka().getStorage().getType());
        assertThat(kafka.getSpec().getKafka().getStorage()).isInstanceOf(PersistentClaimStorage.class);
        PersistentClaimStorage storage = (PersistentClaimStorage) kafka.getSpec().getKafka().getStorage();
        assertThat(storage.getSize()).isEqualTo(sdc.getSpec().getKafka().getStorage().getSize());

        // Zookeeper Config
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(sdc.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getZookeeper().getStorage().getType()).isEqualTo(sdc.getSpec().getKafka().getStorage().getType());
        storage = (PersistentClaimStorage) kafka.getSpec().getZookeeper().getStorage();
        assertThat(storage.getSize()).isEqualTo(sdc.getSpec().getKafka().getStorage().getSize());
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(sdc.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getZookeeper().getStorage().getType()).isEqualTo(sdc.getSpec().getKafka().getStorage().getType());
    }

    private ServiceDomainCluster buildDefaultSDC() {
        return new ServiceDomainClusterBuilder()
                .withMetadata(new ObjectMetaBuilder()
                        .withName("my-sdc")
                        .withNamespace(SERVICE_DOMAIN_CLUSTER_NAMESPACE)
                        .build())
                .withSpec(new ServiceDomainClusterSpecBuilder().build())
                .build();
    }

    private void assertThatIsNotReady(UpdateControl<ServiceDomainCluster> update) {
        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isNull();
        assertThat(condition.getMessage()).isNull();
        assertThat(condition.getLastTransitionTime()).isNotNull();
    }

    private void assertEphemeralKafka(Kafka kafka) {
        assertThat(kafka).isNotNull();
        // Kafka Config
        assertThat(kafka.getSpec().getKafka().getConfig())
                .containsEntry("offsets.topic.replication.factor", 1)
                .containsEntry("transaction.state.log.replication.factor", 1)
                .containsEntry("transaction.state.log.min.isr", 1);
        // Kafka Listeners
        // PLAIN
        assertThat(kafka.getSpec().getKafka().getListeners()).hasSize(2);
        Optional<GenericKafkaListener> listener = kafka.getSpec().getKafka().getListeners().stream().filter(l -> l.getName().equals("plain")).findFirst();
        assertThat(listener).isPresent();
        assertThat(listener.get().getType()).isEqualTo(KafkaListenerType.INTERNAL);
        assertThat(listener.get().getPort()).isEqualTo(9092);
        assertThat(listener.get().isTls()).isFalse();
        assertThat(listener.get().getAuth()).isNull();
        // TLS
        listener = kafka.getSpec().getKafka().getListeners().stream().filter(l -> l.getName().equals("tls")).findFirst();
        assertThat(listener).isPresent();
        assertThat(listener.get().getType()).isEqualTo(KafkaListenerType.INTERNAL);
        assertThat(listener.get().getPort()).isEqualTo(9093);
        assertThat(listener.get().isTls()).isTrue();
        assertThat(listener.get().getAuth()).isNull();
        // Kafka Storage
        assertThat(kafka.getSpec().getKafka().getReplicas()).isEqualTo(1);
        assertThat(kafka.getSpec().getKafka().getStorage().getType()).isEqualTo(Storage.TYPE_EPHEMERAL);

        // Zookeeper Config
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(1);
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(1);
        assertThat(kafka.getSpec().getZookeeper().getStorage().getType()).isEqualTo(Storage.TYPE_EPHEMERAL);
    }
}
