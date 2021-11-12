package com.redhat.mercury.operator;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.api.model.ServiceDomainCluster;
import com.redhat.mercury.api.model.ServiceDomainClusterSpecBuilder;
import com.redhat.mercury.operator.controller.ServiceDomainClusterController;

import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaBuilder;
import io.strimzi.api.kafka.model.KafkaClusterSpecBuilder;
import io.strimzi.api.kafka.model.ZookeeperClusterSpecBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListenerBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.status.KafkaStatus;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;
import io.strimzi.api.kafka.model.storage.JbodStorageBuilder;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorageBuilder;

import static com.redhat.mercury.operator.KafkaServiceEventSource.MANAGED_BY_LABEL;
import static com.redhat.mercury.operator.KafkaServiceEventSource.OPERATOR_NAME;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.KAFKA_LISTENER_TYPE_PLAIN;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_BINDING;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF_API_GROUP;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF_KIND;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SERVICE_DOMAIN_ROLE;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SUBJECT_KIND;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SUBJECT_NAME;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainClusterControllerTest {

    private static final String SERVICE_DOMAIN_CLUSTER_NAME = "service-domain-cluster";

    @KubernetesTestServer
    private KubernetesServer mockServer;
    private Kafka expectedKafka;

    @BeforeEach
    public void beforeEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();
        expectedKafka = getExpectedKafKa();

        final Kafka kafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if (kafka == null) {
            client.resources(Kafka.class).inNamespace(client.getNamespace()).create(expectedKafka);
        }
    }

    @AfterEach
    public void afterEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();

        final ServiceDomainCluster sdc = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if (sdc != null) {
            client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).delete();
        }

        final Kafka kafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if (kafka != null) {
            client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).delete();
        }

        final Role role = client.resources(Role.class).withName(SERVICE_DOMAIN_ROLE).get();
        if (role != null) {
            client.resources(Role.class).withName(SERVICE_DOMAIN_ROLE).delete();
        }

        final RoleBinding roleBinding = client.resources(RoleBinding.class).withName(ROLE_BINDING).get();
        if (roleBinding != null) {
            client.resources(RoleBinding.class).withName(ROLE_BINDING).delete();
        }
    }

    @Test
    public void test() {
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName(SERVICE_DOMAIN_CLUSTER_NAME).withNamespace(mockServer.getClient().getNamespace()).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());

        final NamespacedKubernetesClient client = mockServer.getClient();

        final ServiceDomainCluster serviceDomainCluster = client.resources(ServiceDomainCluster.class).createOrReplace(cluster);

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        final Role role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);
        assertEquals(SERVICE_DOMAIN_ROLE, role.getMetadata().getName());

        List<OwnerReference> ownerReferences = role.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(serviceDomainCluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(serviceDomainCluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        await().atMost(2, MINUTES).until(() -> client.rbac().roleBindings().withName(ROLE_BINDING).get() != null);
        final RoleBinding roleBinding = client.rbac().roleBindings().withName(ROLE_BINDING).get();
        assertNotNull(roleBinding);
        assertEquals(ROLE_BINDING, roleBinding.getMetadata().getName());

        ownerReferences = roleBinding.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(serviceDomainCluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(serviceDomainCluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
        assertEquals(ROLE_REF, roleBinding.getRoleRef().getName());
        assertEquals(ROLE_REF_API_GROUP, roleBinding.getRoleRef().getApiGroup());
        assertEquals(ROLE_REF_KIND, roleBinding.getRoleRef().getKind());
        assertEquals(SUBJECT_NAME, roleBinding.getSubjects().get(0).getName());
        assertEquals(SUBJECT_KIND, roleBinding.getSubjects().get(0).getKind());

        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        Kafka kafka = client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(kafka);
        assertEquals(expectedKafka.getSpec(), kafka.getSpec());

        await().atMost(20, SECONDS).until(this::isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl);
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafka);
        assertNotNull(kafkaBrokerUrl);
    }

    @Test
    public void updateTest() {
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName(SERVICE_DOMAIN_CLUSTER_NAME).withNamespace(mockServer.getClient().getNamespace()).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());

        final NamespacedKubernetesClient client = mockServer.getClient();

        final ServiceDomainCluster serviceDomainCluster = client.resources(ServiceDomainCluster.class).createOrReplace(cluster);

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        final Role role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);
        assertEquals(SERVICE_DOMAIN_ROLE, role.getMetadata().getName());

        List<OwnerReference> ownerReferences = role.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(serviceDomainCluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(serviceDomainCluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        await().atMost(2, MINUTES).until(() -> client.rbac().roleBindings().withName(ROLE_BINDING).get() != null);
        final RoleBinding roleBinding = client.rbac().roleBindings().withName(ROLE_BINDING).get();
        assertNotNull(roleBinding);
        assertEquals(ROLE_BINDING, roleBinding.getMetadata().getName());

        ownerReferences = roleBinding.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(serviceDomainCluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(serviceDomainCluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
        assertEquals(ROLE_REF, roleBinding.getRoleRef().getName());
        assertEquals(ROLE_REF_API_GROUP, roleBinding.getRoleRef().getApiGroup());
        assertEquals(ROLE_REF_KIND, roleBinding.getRoleRef().getKind());
        assertEquals(SUBJECT_NAME, roleBinding.getSubjects().get(0).getName());
        assertEquals(SUBJECT_KIND, roleBinding.getSubjects().get(0).getKind());

        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        Kafka kafka = client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(kafka);
        assertEquals(expectedKafka.getSpec(), kafka.getSpec());

        await().atMost(20, SECONDS).until(this::isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl);
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafka);
        assertNotNull(kafkaBrokerUrl);
    }

    private boolean isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl() {
        return mockServer.getClient().resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null
                && mockServer.getClient().resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus() != null
                && mockServer.getClient().resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker() != null;
    }

    public Kafka getExpectedKafKa() {
        final Kafka kafka = new KafkaBuilder()
                .withNewMetadata()
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .withNamespace(mockServer.getClient().getNamespace())
                .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
                .endMetadata()
                .withNewSpec()
                .withKafka(new KafkaClusterSpecBuilder()
                        .withVersion("3.0.0")
                        .withReplicas(3)
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
                        .withConfig(Map.of("offsets.topic.replication.factor", 3,
                                "transaction.state.log.replication.factor", 3,
                                "transaction.state.log.min.isr", 2,
                                "log.message.format.version", "3.0",
                                "inter.broker.protocol.version", "3.0"))
                        .withStorage(new JbodStorageBuilder()
                                .withVolumes(new PersistentClaimStorageBuilder()
                                        .withId(0)
                                        .withSize("100Gi")
                                        .withDeleteClaim(false)
                                        .build())
                                .build())
                        .build())
                .withZookeeper(new ZookeeperClusterSpecBuilder()
                        .withReplicas(3)
                        .withStorage(new PersistentClaimStorageBuilder()
                                .withSize("100Gi")
                                .withDeleteClaim(false)
                                .build())
                        .build())
                .endSpec()
                .build();

        kafka.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .withUid(UUID.randomUUID().toString())
                .withKind(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION)
                .build()));

        final KafkaStatus status = new KafkaStatusBuilder().withListeners(new ListenerStatusBuilder()
                        .withType(KAFKA_LISTENER_TYPE_PLAIN)
                        .withAddresses(List.of(new ListenerAddressBuilder()
                                .withHost("www.test.com")
                                .build()))
                        .build())
                .build();
        kafka.setStatus(status);

        return kafka;
    }
}
