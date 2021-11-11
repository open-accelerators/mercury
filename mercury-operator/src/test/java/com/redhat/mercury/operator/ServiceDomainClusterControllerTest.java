package com.redhat.mercury.operator;

import com.redhat.mercury.operator.controller.ServiceDomainClusterController;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpec;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpecBuilder;

import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionVersionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsBuilder;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.KubernetesServerTestResource;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@WithKubernetesTestServer
public class ServiceDomainClusterControllerTest {

    @KubernetesTestServer
    KubernetesServer mockServer;

    @Test
    public void test(){
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName("my-sdc").withNamespace(mockServer.getClient().getNamespace()).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());

        final ServiceDomainCluster current = mockServer.getClient()
                .resources(ServiceDomainCluster.class)
                .inNamespace(mockServer.getClient().getNamespace())
                .createOrReplace(cluster);

        final Role role = mockServer.getClient().rbac().roles().withName(ServiceDomainClusterController.SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_ROLE, role.getMetadata().getName());

        final List<OwnerReference> ownerReferences = role.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        final OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(current.getMetadata().getName(), ownerReference.getName());
        assertEquals(current.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
    }
}

