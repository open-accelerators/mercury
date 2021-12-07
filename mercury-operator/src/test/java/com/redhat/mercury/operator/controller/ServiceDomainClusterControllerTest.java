package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainCluster;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.client.NamespacedKubernetesClient;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_BINDING;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF_API_GROUP;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.ROLE_REF_KIND;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SERVICE_DOMAIN_ROLE;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SUBJECT_KIND;
import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.SUBJECT_NAME;
import static com.redhat.mercury.operator.controller.ServiceDomainController.KAFKA_BOOTSTRAP_SERVERS_CONFIG_MAP_PROPERTY;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainClusterControllerTest extends AbstractControllerTest{

    @BeforeEach
    public void beforeEach(){
    }

    @AfterEach
    public void afterEach(){
        final NamespacedKubernetesClient client = mockServer.getClient();

        final KubernetesResourceList<ServiceDomainCluster> sdcList = client.resources(ServiceDomainCluster.class).list();
        if(sdcList != null && sdcList.getItems() != null && !sdcList.getItems().isEmpty()){
            sdcList.getItems().forEach(sdc -> client.resources(ServiceDomainCluster.class).delete(sdc));
        }

        final Kafka kafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(kafka != null){
            client.resources(Kafka.class).delete(kafka);
        }

        final Role role = client.resources(Role.class).withName(SERVICE_DOMAIN_ROLE).get();
        if(role != null){
            client.resources(Role.class).delete(role);
        }

        final RoleBinding roleBinding = client.resources(RoleBinding.class).withName(ROLE_BINDING).get();
        if(roleBinding != null){
            client.resources(RoleBinding.class).delete(roleBinding);
        }

        final ConfigMap configMap = client.configMaps().withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        if(configMap != null){
            client.configMaps().delete(configMap);
        }
    }

    @Test
    public void addServiceDomainClusterTest(){
        ServiceDomainCluster cluster = createServiceDomainCluster();

        final NamespacedKubernetesClient client = mockServer.getClient();

        Kafka expectedKafka = getExpectedKafKa("", SERVICE_DOMAIN_CLUSTER_NAME);
        client.resources(Kafka.class).inNamespace(client.getNamespace()).create(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        Kafka fetchedKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(fetchedKafka);

        cluster = client.resources(ServiceDomainCluster.class).inNamespace(client.getNamespace()).create(cluster);

        expectedKafka = getExpectedKafKa(cluster.getMetadata().getUid(), SERVICE_DOMAIN_CLUSTER_NAME);
        client.resources(Kafka.class).inNamespace(client.getNamespace()).replace(expectedKafka);
        await().atMost(2, MINUTES).until(() -> client.resources(Kafka.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        final Role role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertEquals(SERVICE_DOMAIN_ROLE, role.getMetadata().getName());

        List<OwnerReference> ownerReferences = role.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(cluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(cluster.getMetadata().getUid(), ownerReference.getUid());
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
        assertEquals(cluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(cluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
        assertEquals(ROLE_REF, roleBinding.getRoleRef().getName());
        assertEquals(ROLE_REF_API_GROUP, roleBinding.getRoleRef().getApiGroup());
        assertEquals(ROLE_REF_KIND, roleBinding.getRoleRef().getKind());
        assertEquals(SUBJECT_NAME, roleBinding.getSubjects().get(0).getName());
        assertEquals(SUBJECT_KIND, roleBinding.getSubjects().get(0).getKind());

        await().atMost(20, SECONDS).until(() -> isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(SERVICE_DOMAIN_CLUSTER_NAME));
        final String kafkaBrokerUrl = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get().getStatus().getKafkaBroker();
        assertNotNull(kafkaBrokerUrl);

        await().atMost(2, MINUTES).until(() -> client.configMaps().withName(SERVICE_DOMAIN_CLUSTER_NAME).get() != null);
        final ConfigMap configMap = client.configMaps().withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNotNull(configMap);
        assertNotNull(configMap.getData());
        final String configMapValue = configMap.getData().get(KAFKA_BOOTSTRAP_SERVERS_CONFIG_MAP_PROPERTY);
        assertNotNull(configMapValue);
    }

    @Test
    public void addMultipleServiceDomainClusterTest(){
        ServiceDomainCluster cluster = createServiceDomainCluster();

        final NamespacedKubernetesClient client = mockServer.getClient();

        client.resources(ServiceDomainCluster.class).inNamespace(client.getNamespace()).create(cluster);

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        Role role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);

        await().atMost(2, MINUTES).until(() -> client.rbac().roleBindings().withName(ROLE_BINDING).get() != null);
        RoleBinding roleBinding = client.rbac().roleBindings().withName(ROLE_BINDING).get();
        assertNotNull(roleBinding);

        cluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        Boolean deleted = client.resources(ServiceDomainCluster.class).delete(cluster);
        assertTrue(deleted);

        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get() == null);
        cluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME).get();
        assertNull(cluster);

        cluster = createServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME + 2);
        client.resources(ServiceDomainCluster.class).inNamespace(client.getNamespace()).create(cluster);

        await().atMost(2, MINUTES).until(() -> client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get() != null);
        role = client.rbac().roles().withName(SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);

        await().atMost(2, MINUTES).until(() -> client.rbac().roleBindings().withName(ROLE_BINDING).get() != null);
        roleBinding = client.rbac().roleBindings().withName(ROLE_BINDING).get();
        assertNotNull(roleBinding);

        cluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME+ 2).get();
        deleted = client.resources(ServiceDomainCluster.class).delete(cluster);
        assertTrue(deleted);

        await().atMost(2, MINUTES).until(() -> client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME+ 2).get() == null);
        cluster = client.resources(ServiceDomainCluster.class).withName(SERVICE_DOMAIN_CLUSTER_NAME+ 2).get();
        assertNull(cluster);
    }
}
