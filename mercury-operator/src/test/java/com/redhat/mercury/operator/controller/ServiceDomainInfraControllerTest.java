package com.redhat.mercury.operator.controller;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.operator.model.KafkaStorageBuilder;
import com.redhat.mercury.operator.model.ServiceDomainInfra;
import com.redhat.mercury.operator.model.ServiceDomainInfraBuilder;
import com.redhat.mercury.operator.model.ServiceDomainInfraSpecBuilder;
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
import io.strimzi.api.kafka.model.status.ConditionBuilder;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorage;
import io.strimzi.api.kafka.model.storage.Storage;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.ServiceDomainInfraStatus.CONDITION_KAFKA_BROKER_READY;
import static com.redhat.mercury.operator.model.ServiceDomainInfraStatus.MESSAGE_KAFKA_BROKER_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainInfraStatus.REASON_KAFKA_EXCEPTION;
import static com.redhat.mercury.operator.model.ServiceDomainInfraStatus.REASON_KAFKA_WAITING;
import static io.strimzi.api.kafka.model.authentication.KafkaClientAuthenticationPlain.TYPE_PLAIN;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainInfraControllerTest extends AbstractTest {

    @BeforeEach
    public void beforeEach() {
        mockServer.getKubernetesMockServer().clearExpectations();
    }

    @AfterEach
    public void afterEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();
        client.namespaces().withName(SERVICE_DOMAIN_INFRA_NAMESPACE).delete();
        client.resources(ServiceDomainInfra.class).inAnyNamespace().list()
                .getItems().forEach(sdi ->
                {
                    client.resources(ServiceDomainInfra.class)
                            .inNamespace(sdi.getMetadata().getNamespace())
                            .withName(sdi.getMetadata().getName())
                            .delete();
                    assertThat(client.resources(ServiceDomainInfra.class)
                            .inNamespace(sdi.getMetadata().getNamespace())
                            .withName(sdi.getMetadata().getName()).get()).isNull();
                });

        client.resources(Kafka.class).inAnyNamespace().list()
                .getItems().forEach(kafka ->
                        client.resources(Kafka.class)
                                .inNamespace(kafka.getMetadata().getNamespace())
                                .withName(kafka.getMetadata().getName())
                                .delete());
    }

    @Test
    void testCreateKafkaInvalidStorageType() {
        ServiceDomainInfra sdi = buildDefaultSDI();
        sdi.getSpec().getKafka()
                .setStorage(new KafkaStorageBuilder().withType("invalid type").build());
        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getScheduleDelay()).isEmpty();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_EXCEPTION);
        assertThat(condition.getMessage()).isEqualTo("Unsupported kafka storage type: invalid type supported values are 'ephemeral' and 'persistent-volume-claim'");
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertThat(kafka).isNull();
    }

    @Test
    void testCreateKafkaWithException() {
        ServiceDomainInfra sdi = buildDefaultSDI();
        String exceptionMessage = "Test exception";
        mockServer.expect().post()
                .withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas")
                .andReturn(500, new KubernetesClientException(exceptionMessage))
                .once();

        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_EXCEPTION);
        assertThat(condition.getMessage()).contains(exceptionMessage);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertThat(kafka).isNull();
    }

    @Test
    void testCreateDefaultKafka() {
        ServiceDomainInfra sdi = buildDefaultSDI();
        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);
    }

    @Test
    void testReplaceDefaultKafka() {
        ServiceDomainInfra sdi = buildDefaultSDI();
        Kafka current = new KafkaBuilder()
                .withNewMetadata()
                .withName(sdi.getMetadata().getName())
                .withNamespace(sdi.getMetadata().getNamespace()).endMetadata()
                .withNewSpec().withNewKafka().withReplicas(3).endKafka().endSpec()
                .build();
        mockServer.expect().get().withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas/my-sdi")
                .andReturn(200, current).once();

        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);
    }

    @Test
    void testWaitingForKafkaDeployment() {
        ServiceDomainInfra sdi = buildDefaultSDI();

        // Create Kafka
        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);
    }

    @Test
    void testKafkaDeploymentReady() {
        ServiceDomainInfra sdi = buildDefaultSDI();

        // Create Kafka
        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertEphemeralKafka(kafka);

        // Update Kafka
        kafka.setStatus(new KafkaStatusBuilder().withListeners(new ListenerStatusBuilder()
                        .withName(TYPE_PLAIN)
                        .withAddresses(new ListenerAddressBuilder()
                                .withHost("my-kafka.example.com")
                                .withPort(9092)
                                .build())
                        .build())
                .withConditions(new ConditionBuilder()
                        .withType(CONDITION_READY)
                        .withStatus(STATUS_TRUE)
                        .build())
                .build());
        mockServer.expect().get().withPath("/apis/kafka.strimzi.io/v1beta2/namespaces/test-service-domain/kafkas/my-sdi")
                .andReturn(200, kafka).always();
        update = serviceDomainInfraController.reconcile(sdi, null);
        assertThat(update.getResource().getStatus().isReady()).isTrue();
        assertThat(update.getResource().getStatus().getKafkaBroker()).isEqualTo("my-kafka.example.com:9092");

        condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(STATUS_TRUE);
        assertThat(condition.getLastTransitionTime()).isNotBlank();
        assertThat(condition.getReason()).isNull();
        assertThat(condition.getMessage()).isNull();

        assertThatIsReady(update);
    }

    @Test
    void testCreateProductionKafka() {
        ServiceDomainInfra sdi = new ServiceDomainInfraBuilder()
                .withMetadata(new ObjectMetaBuilder()
                        .withName("my-sdi")
                        .withNamespace(SERVICE_DOMAIN_INFRA_NAMESPACE)
                        .build())
                .withSpec(new ServiceDomainInfraSpecBuilder()
                        .withNewKafka()
                        .withReplicas(3)
                        .withNewStorage()
                        .withType(Storage.TYPE_PERSISTENT_CLAIM)
                        .withSize("1Gi")
                        .endStorage()
                        .endKafka()
                        .build())
                .build();
        UpdateControl<ServiceDomainInfra> update = serviceDomainInfraController.reconcile(sdi, null);

        assertThat(update.isUpdateStatus()).isTrue();
        assertThat(update.getResource().getStatus().isReady()).isFalse();
        assertThat(update.getResource().getStatus().getConditions()).hasSize(2);
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_KAFKA_BROKER_READY);
        assertThat(condition.getStatus()).isEqualTo(ResourceUtils.toStatus(Boolean.FALSE));
        assertThat(condition.getReason()).isEqualTo(REASON_KAFKA_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_KAFKA_BROKER_NOT_READY);
        assertThat(condition.getLastTransitionTime()).isNotNull();

        assertThatIsWaiting(update);

        Kafka kafka = mockServer.getClient().resources(Kafka.class).inNamespace(sdi.getMetadata().getNamespace()).withName(sdi.getMetadata().getName()).get();
        assertThat(kafka).isNotNull();
        // Kafka Config
        assertThat(kafka.getSpec().getKafka().getVersion()).isEqualTo("3.0.0");
        assertThat(kafka.getSpec().getKafka().getConfig())
                .containsEntry("offsets.topic.replication.factor", 3)
                .containsEntry("transaction.state.log.replication.factor", 3)
                .containsEntry("min.insync.replicas", 2)
                .containsEntry("default.replication.factor", 3)
                .containsEntry("transaction.state.log.min.isr", 2)
                .containsEntry("inter.broker.protocol.version", "3.0");
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
        assertThat(kafka.getSpec().getKafka().getReplicas()).isEqualTo(sdi.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getKafka().getStorage().getType()).isEqualTo(sdi.getSpec().getKafka().getStorage().getType());
        assertThat(kafka.getSpec().getKafka().getStorage()).isInstanceOf(PersistentClaimStorage.class);
        PersistentClaimStorage storage = (PersistentClaimStorage) kafka.getSpec().getKafka().getStorage();
        assertThat(storage.getSize()).isEqualTo(sdi.getSpec().getKafka().getStorage().getSize());

        // Zookeeper Config
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(sdi.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getZookeeper().getStorage().getType()).isEqualTo(sdi.getSpec().getKafka().getStorage().getType());
        storage = (PersistentClaimStorage) kafka.getSpec().getZookeeper().getStorage();
        assertThat(storage.getSize()).isEqualTo(sdi.getSpec().getKafka().getStorage().getSize());
        assertThat(kafka.getSpec().getZookeeper().getReplicas()).isEqualTo(sdi.getSpec().getKafka().getReplicas());
        assertThat(kafka.getSpec().getZookeeper().getStorage().getType()).isEqualTo(sdi.getSpec().getKafka().getStorage().getType());
    }

    private ServiceDomainInfra buildDefaultSDI() {
        return new ServiceDomainInfraBuilder()
                .withMetadata(new ObjectMetaBuilder()
                        .withName("my-sdi")
                        .withNamespace(SERVICE_DOMAIN_INFRA_NAMESPACE)
                        .build())
                .withSpec(new ServiceDomainInfraSpecBuilder().build())
                .build();
    }

    private void assertEphemeralKafka(Kafka kafka) {
        assertThat(kafka).isNotNull();
        // Kafka Config
        assertThat(kafka.getSpec().getKafka().getVersion()).isEqualTo("3.0.0");
        assertThat(kafka.getSpec().getKafka().getConfig())
                .containsEntry("offsets.topic.replication.factor", 1)
                .containsEntry("transaction.state.log.replication.factor", 1)
                .containsEntry("min.insync.replicas", 1)
                .containsEntry("default.replication.factor", 1)
                .containsEntry("transaction.state.log.min.isr", 1)
                .containsEntry("inter.broker.protocol.version", "3.0");
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
