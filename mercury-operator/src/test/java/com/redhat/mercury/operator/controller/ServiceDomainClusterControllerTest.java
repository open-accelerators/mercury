package com.redhat.mercury.operator.controller;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.operator.model.ServiceDomainCluster;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.smallrye.mutiny.Multi;
import io.strimzi.api.kafka.model.Kafka;

import static com.redhat.mercury.operator.model.ServiceDomainClusterStatus.CONDITION_KAFKA_BROKER_READY;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainClusterControllerTest extends AbstractControllerTest {

    @BeforeEach
    public void beforeEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();

        final Namespace namespace = client.namespaces().withName(SERVICE_DOMAIN_CLUSTER_NAMESPACE).get();
        if (namespace == null) {
            client.namespaces().create(new NamespaceBuilder().withNewMetadata().withName(SERVICE_DOMAIN_CLUSTER_NAMESPACE).endMetadata().build());
        }
    }

    @AfterEach
    public void afterEach() {
        final NamespacedKubernetesClient client = mockServer.getClient();

        client.resources(ServiceDomainCluster.class).inAnyNamespace().list()
                .getItems().forEach(sdc ->
                {client.resources(ServiceDomainCluster.class)
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
                {client.resources(Kafka.class)
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
    void createDefaultServiceDomainCluster() throws ExecutionException, InterruptedException, TimeoutException {
        ServiceDomainCluster sdc = new ServiceDomainCluster();
        sdc.setMetadata(new ObjectMetaBuilder().withName("my-sdc").build());

        ServiceDomainCluster serviceDomainCluster = mockServer.getClient().resources(ServiceDomainCluster.class)
                .inNamespace("test-ns")
                .create(sdc);

        CompletableFuture<Kafka> result = CompletableFuture.supplyAsync(() -> {
            Kafka kafka = null;
            while (kafka == null) {
                kafka = mockServer.getClient()
                        .resources(Kafka.class)
                        .inNamespace(serviceDomainCluster.getMetadata().getNamespace())
                        .withName(serviceDomainCluster.getMetadata().getName())
                        .get();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    fail("Interrupted thread");
                }
            }
            return kafka;
        });
        Multi.createFrom()
                .ticks()
                .every(Duration.ofMillis(500)).onItem().transform(e -> mockServer.getClient()
                        .resources(Kafka.class)
                        .inNamespace(serviceDomainCluster.getMetadata().getNamespace())
                        .withName(serviceDomainCluster.getMetadata().getName())
                        .get()).filter(Objects::nonNull).collect().first();
        Kafka kafka = result.get(1, MINUTES);
        assertEquals("my-sdc", kafka.getMetadata().getName());
    }

    @Test
    public void addServiceDomainClusterTest() {
        ServiceDomainCluster cluster = createServiceDomainCluster();
        final String sdcNamespace = cluster.getMetadata().getNamespace();

        final NamespacedKubernetesClient client = mockServer.getClient();

        Kafka expectedKafka = getExpectedKafKa(cluster);
        client.resources(Kafka.class).inNamespace(sdcNamespace).create(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).inNamespace(sdcNamespace).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        Kafka fetchedKafka = client.resources(Kafka.class).inNamespace(sdcNamespace).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(fetchedKafka);

        cluster = client.resources(ServiceDomainCluster.class).inNamespace(sdcNamespace).create(cluster);

        expectedKafka = getExpectedKafKa(cluster);
        client.resources(Kafka.class).inNamespace(sdcNamespace).replace(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class)
                .inNamespace(sdcNamespace)
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .get() != null);

        await().atMost(2, MINUTES).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class)
                .inNamespace(sdcNamespace)
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .get()
                .getStatus()
                .getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);

//        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class)
//                                                             .inNamespace(sdcNamespace)
//                                                             .withName(SERVICE_DOMAIN_CLUSTER_NAME)
//                                                             .get().getStatus().isReady());
//        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class)
//                                                             .inNamespace(sdcNamespace)
//                                                             .withName(SERVICE_DOMAIN_CLUSTER_NAME)
//                                                             .get().getStatus().isSpecificConditionReady(CONDITION_KAFKA_BROKER_READY));
    }

    @Test
    public void addMultipleServiceDomainClusterTest() {
        for (int i = 0; i < 3; i++) {
            final ServiceDomainCluster cluster = createServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME + i);
            final NamespacedKubernetesClient client = mockServer.getClient();
            client.resources(ServiceDomainCluster.class)
                    .inNamespace(cluster.getMetadata().getNamespace())
                    .create(cluster);

            ServiceDomainCluster current = client.resources(ServiceDomainCluster.class)
                    .inNamespace(cluster.getMetadata().getNamespace())
                    .withName(cluster.getMetadata().getName())
                    .get();

            assertNotNull(current);
            assertTrue(client.resources(ServiceDomainCluster.class)
                    .inNamespace(cluster.getMetadata().getNamespace())
                    .withName(cluster.getMetadata().getName())
                    .delete());

            await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class)
                    .inNamespace(cluster.getMetadata().getNamespace())
                    .withName(cluster.getMetadata().getName())
                    .get() == null);

            assertNull(client.resources(ServiceDomainCluster.class)
                    .inNamespace(cluster.getMetadata().getNamespace())
                    .withName(cluster.getMetadata().getName())
                    .get());
        }
    }

    @Test
    public void watchDeletedObjectsTest() {
        ServiceDomainCluster cluster = createServiceDomainCluster();
        final String sdcNamespace = cluster.getMetadata().getNamespace();

        final NamespacedKubernetesClient client = mockServer.getClient();

        Kafka expectedKafka = getExpectedKafKa(cluster);
        client.resources(Kafka.class).inNamespace(sdcNamespace).create(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).inNamespace(sdcNamespace).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        Kafka fetchedKafka = client.resources(Kafka.class).inNamespace(sdcNamespace).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(fetchedKafka);

        cluster = client.resources(ServiceDomainCluster.class).inNamespace(sdcNamespace).create(cluster);

        expectedKafka = getExpectedKafKa(cluster);
        client.resources(Kafka.class).inNamespace(sdcNamespace).replace(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class)
                .inNamespace(sdcNamespace)
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .get() != null);

        final Boolean deleted = client.resources(Kafka.class).inNamespace(sdcNamespace).withName(SERVICE_DOMAIN_CLUSTER_NAME).delete();
        assertTrue(deleted);

        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class)
                .inNamespace(sdcNamespace)
                .withName(SERVICE_DOMAIN_CLUSTER_NAME)
                .get() != null);
    }
}
