package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaTopic;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.*;
import static com.redhat.mercury.operator.controller.ServiceDomainController.BINDING_SERVICE_SA;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainControllerTest extends AbstractControllerTest{

    @BeforeEach
    public void beforeEach(){
        final NamespacedKubernetesClient client = mockServer.getClient();

        ServiceDomainCluster cluster = createServiceDomainCluster();
        client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).createOrReplace(cluster);
        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        cluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();

        Kafka expectedKafka = getExpectedKafKa(cluster.getMetadata().getUid(), SERVICE_DOMAIN_CLUSTER_NAME);
        Kafka fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(fetchedKafka == null) {
            client.resources(Kafka.class).inNamespace(client.getNamespace()).createOrReplace(expectedKafka);
            await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
            fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
            assertNotNull(fetchedKafka);
        }

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        Role role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);

        await().atMost(2, MINUTES).until(() -> client.rbac().roleBindings().withName(ROLE_BINDING).get() != null);
        RoleBinding roleBinding = client.rbac().roleBindings().withName(ROLE_BINDING).get();
        assertNotNull(roleBinding);
    }

    @AfterEach
    public void afterEach(){
        final NamespacedKubernetesClient client = mockServer.getClient();

        final ServiceDomain sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        if(sd != null){
            client.resources(ServiceDomain.class).withName(SERVICE_DOMAIN_NAME).delete();
        }

        ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        if(serviceAccount != null){
            client.resources(ServiceAccount.class).withName(BINDING_SERVICE_SA).delete();
        }

        Deployment sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        if(sdDeployment != null){
            client.resources(Deployment.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).delete();
        }

        Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + "-binding").get();
        if(service != null){
            client.resources(Service.class).withName(SERVICE_DOMAIN_NAME + "-binding").delete();
        }

        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get();
        if(kafkaTopic != null){
            client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").delete();
        }
    }

    @Test
    public void addServiceDomainTest(){
        ServiceDomain sd = createServiceDomain();

        final NamespacedKubernetesClient client = mockServer.getClient();

        sd = client.resources(ServiceDomain.class).createOrReplace(sd);

        //Test service account data
        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null);
        final ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNotNull(serviceAccount);

        List<OwnerReference> ownerReferences = serviceAccount.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        //Test deployment data
        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        final Deployment deployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNotNull(deployment);

        ownerReferences = deployment.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        //Test Service data
        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + "-binding").get() != null);
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + "-binding").get();
        assertNotNull(service);

        ownerReferences = service.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        await().atMost(20, SECONDS).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);
    }

    @Test
    public void addMultipleServiceDomainTest(){
        ServiceDomain sd = createServiceDomain();

        final NamespacedKubernetesClient client = mockServer.getClient();

        client.resources(ServiceDomain.class).createOrReplace(sd);

        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null);
        ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNotNull(serviceAccount);

        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        Deployment sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNotNull(sdDeployment);

        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + "-binding").get() != null);
        Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + "-binding").get();
        assertNotNull(service);

        await().atMost(2, MINUTES).until(() -> client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get() != null);
        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get();
        assertNotNull(kafkaTopic);

        sd = createServiceDomain(SERVICE_DOMAIN_NAME + 2);

        client.resources(ServiceDomain.class).createOrReplace(sd);

        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null);
        serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNotNull(serviceAccount);

        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get() != null);
        sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get();
        assertNotNull(sdDeployment);

        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2 + "-binding").get() != null);
        service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2 + "-binding").get();
        assertNotNull(service);

        await().atMost(2, MINUTES).until(() -> client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + 2 + "-topic").get() != null);
        kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + 2 + "-topic").get();
        assertNotNull(kafkaTopic);
    }
}
