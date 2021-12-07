package com.redhat.mercury.operator.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.GenericKubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.fabric8.kubernetes.client.dsl.base.ResourceDefinitionContext;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaTopic;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_BINDING;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SERVICE_DOMAIN_ROLE;
import static com.redhat.mercury.operator.controller.ServiceDomainController.BINDING_SERVICE_SA;
import static com.redhat.mercury.operator.controller.ServiceDomainController.INTEGRATION_SUFFIX;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainControllerTest extends AbstractControllerTest{

    @BeforeEach
    public void beforeEach() throws IOException {
        final NamespacedKubernetesClient client = mockServer.getClient();

        final String sdConfigMapName = "integration-" + SERVICE_DOMAIN_NAME + "-http";
        ConfigMap configMap = client.configMaps().inNamespace(client.getNamespace()).withName(sdConfigMapName).get();
        if(configMap == null) {
            try (final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sdConfigMap.yaml")) {
                if (inputStream != null) {
                    client.configMaps().inNamespace(client.getNamespace()).load(inputStream).create();
                    await().atMost(2, MINUTES).until(() -> client.configMaps().inNamespace(client.getNamespace()).withName(sdConfigMapName).get() != null);
                    configMap = client.configMaps().inNamespace(client.getNamespace()).withName(sdConfigMapName).get();
                    assertNotNull(configMap);
                }
            }
        }

        //Hack so that the cluster will already have a kafka broker
        Kafka expectedKafka = getExpectedKafKa("", SERVICE_DOMAIN_CLUSTER_NAME);
        Kafka fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(fetchedKafka == null) {
            client.resources(Kafka.class).inNamespace(client.getNamespace()).create(expectedKafka);
            await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
            fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
            assertNotNull(fetchedKafka);
        }

        ServiceDomainCluster fetchedCluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(fetchedCluster == null) {
            ServiceDomainCluster desiredCluster = createServiceDomainCluster();
            fetchedCluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).create(desiredCluster);
            await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        }

        //update the kafka broker owner with the cluster uid
        expectedKafka = getExpectedKafKa(fetchedCluster.getMetadata().getUid(), SERVICE_DOMAIN_CLUSTER_NAME);
        fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(fetchedKafka != null) {
            client.resources(Kafka.class).inNamespace(client.getNamespace()).replace(expectedKafka);
            await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
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

        ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        if(serviceAccount != null){
            client.resources(ServiceAccount.class).delete(serviceAccount);
        }

        Deployment sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        if(sdDeployment != null){
            client.resources(Deployment.class).delete(sdDeployment);
        }

        Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        if(service != null){
            client.resources(Service.class).delete(service);
        }

        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get();
        if(kafkaTopic != null){
            client.resources(KafkaTopic.class).delete(kafkaTopic);
        }

        final String sdConfigMapName = "integration-" + SERVICE_DOMAIN_NAME + "-http";
        final ConfigMap configMap = client.configMaps().inNamespace(client.getNamespace()).withName(sdConfigMapName).get();
        if(configMap != null){
            client.configMaps().delete(configMap);
        }

        final String integrationName = SERVICE_DOMAIN_NAME + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        if(integration != null){
            client.genericKubernetesResources(resourceDefinitionContext).delete(integration);
        }

        final KubernetesResourceList<ServiceDomain> sdList = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).list();
        if(sdList != null && sdList.getItems() != null && !sdList.getItems().isEmpty()){
            for (ServiceDomain sd : sdList.getItems()) {
                client.resources(ServiceDomain.class).delete(sd);
                await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).withName(sd.getMetadata().getName()).get() == null);
            }
        }

        ServiceDomainCluster fetchedCluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(fetchedCluster != null){
            client.resources(ServiceDomainCluster.class).delete(fetchedCluster);
        }

        final Kafka kafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(kafka != null){
            client.resources(Kafka.class).delete(kafka);
        }
    }

    @Test
    public void addServiceDomainTest(){
        ServiceDomain sd = createServiceDomain();

        final NamespacedKubernetesClient client = mockServer.getClient();

        sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

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
        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
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

        //Test Kafka Broker data
        await().atMost(20, SECONDS).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);

        //Test Integration data
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        await().atMost(2, MINUTES).until(() -> client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get() != null);
        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNotNull(integration);

        ownerReferences = integration.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
    }

    @Test
    public void updateServiceDomainNoExposeTest(){
        ServiceDomain sd = createServiceDomain();

        final NamespacedKubernetesClient client = mockServer.getClient();

        sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

//        final OwnerReference ownerReference = new OwnerReferenceBuilder().withUid(sd.getMetadata().getUid())
//                                                                   .withName(sd.getMetadata().getName())
//                                                                   .withKind(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
//                                                                   .withApiVersion(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
//                                                                   .build();

        //Test service account data
        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null/*
                                                        && client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get().getMetadata().getOwnerReferences().get(0).equals(ownerReference)*/);
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
        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null/*
                                                        && client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get().getMetadata().getOwnerReferences().get(0).equals(ownerReference)*/);
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
        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null/*
                                                        && client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get().getMetadata().getOwnerReferences().get(0).equals(ownerReference)*/);
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
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

        //Test Kafka Broker data
        await().atMost(20, SECONDS).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);

        //Test Integration data
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        await().atMost(2, MINUTES).until(() -> client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get() != null/*
                                                        && client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get().getMetadata().getOwnerReferences().get(0).equals(ownerReference)*/);
        GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNotNull(integration);

        ownerReferences = integration.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());

        sd.getSpec().setExpose(null);
        client.resources(ServiceDomain.class).replace(sd);

        await().atMost(2, MINUTES).until(() -> client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get() == null);
        integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNull(integration);
    }

    @Test
    public void addServiceDomainWithNoClusterTest(){
        final NamespacedKubernetesClient client = mockServer.getClient();

        client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).delete();
        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() == null);

        ServiceDomain sd = createServiceDomain();

        sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

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
        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
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

        //Test Integration data
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        await().atMost(2, MINUTES).until(() -> client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get() != null);
        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNotNull(integration);

        ownerReferences = integration.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(sd.getMetadata().getName(), ownerReference.getName());
        assertEquals(sd.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainController.SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
    }

    @Test
    public void addServiceDomainWithNoClusterConfigMapTest(){
        final NamespacedKubernetesClient client = mockServer.getClient();

        client.configMaps().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).delete();
        await().atMost(2, MINUTES).until(() -> client.configMaps().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() == null);

        ServiceDomain sd = createServiceDomain();

        sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

        //Test service account data
        final ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNull(serviceAccount);

        //Test deployment data
        final Deployment deployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNull(deployment);

        //Test Service data
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNull(service);

        //Test Integration data
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNull(integration);
    }

    @Test
    public void addServiceDomainWithoutExposeHttpTest(){
        ServiceDomain sd = createServiceDomain(SERVICE_DOMAIN_NAME, false);

        final NamespacedKubernetesClient client = mockServer.getClient();

        sd = client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

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
        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        final Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
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

        //Test Kafka Broker data
        await().atMost(20, SECONDS).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);

        //Test Integration data
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).get();
        assertNull(integration);
    }

    @Test
    public void addMultipleServiceDomainTest(){
        ServiceDomain sd = createServiceDomain();

        final NamespacedKubernetesClient client = mockServer.getClient();

        client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null);
        ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNotNull(serviceAccount);

        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        Deployment sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNotNull(sdDeployment);

        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get() != null);
        Service service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME).get();
        assertNotNull(service);

        await().atMost(2, MINUTES).until(() -> client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get() != null);
        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + "-topic").get();
        assertNotNull(kafkaTopic);

        sd = createServiceDomain(SERVICE_DOMAIN_NAME + 2);

        client.resources(ServiceDomain.class).inNamespace(client.getNamespace()).create(sd);

        await().atMost(2, MINUTES).until(() -> client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get() != null);
        serviceAccount = client.serviceAccounts().inNamespace(client.getNamespace()).withName(BINDING_SERVICE_SA).get();
        assertNotNull(serviceAccount);

        await().atMost(2, MINUTES).until(() -> client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get() != null);
        sdDeployment = client.apps().deployments().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get();
        assertNotNull(sdDeployment);

        await().atMost(2, MINUTES).until(() -> client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get() != null);
        service = client.services().inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_NAME + 2).get();
        assertNotNull(service);

        await().atMost(2, MINUTES).until(() -> client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + 2 + "-topic").get() != null);
        kafkaTopic = client.resources(KafkaTopic.class).withName(SERVICE_DOMAIN_NAME + 2 + "-topic").get();
        assertNotNull(kafkaTopic);
    }
}
