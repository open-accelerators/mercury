package com.redhat.mercury.operator;

import com.redhat.mercury.operator.controller.ServiceDomainClusterController;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpec;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionVersionBuilder;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsBuilder;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@WithKubernetesTestServer
@QuarkusTest
public class ServiceDomainClusterControllerTest {

    @KubernetesTestServer
    KubernetesServer mockServer;

    @BeforeEach
    void setupCrd() throws IOException {
        CustomResourceDefinition customResourceDefinition = mockServer.getClient().apiextensions().v1().customResourceDefinitions().withName("service-domain-cluster").get();

        if(customResourceDefinition == null) {
            customResourceDefinition = new CustomResourceDefinitionBuilder()
                    .withApiVersion("apiextensions.k8s.io/v1")
                    .withNewMetadata().withName("service-domain-cluster")
                    .endMetadata()
                    .withNewSpec()
                    .withNewNames()
                    .withKind("ServiceDomainCluster")
                    .withPlural("servicedomainclusters")
                    .withShortNames("sdc")
                    .withSingular("servicedomaincluster")
                    .endNames()
                    .withGroup("mercury.redhat.io")
                    .withScope("Namespaced")
                    .withVersions(new CustomResourceDefinitionVersionBuilder()
                            .withName("v1alpha1")
                            .withNewSchema()
                            .withNewOpenAPIV3Schema()
                            .withProperties(Map.of("spec", new JSONSchemaPropsBuilder().withType("object").build(),
                                    "status", new JSONSchemaPropsBuilder()
                                            .withProperties(Map.of("kafkaBroker", new JSONSchemaPropsBuilder()
                                                    .withType("string").build()))
                                            .withType("object")
                                            .build()))
                            .withType("object")
                            .endOpenAPIV3Schema()
                            .endSchema()
                            .withServed(true)
                            .withStorage(true)
                            .withNewSubresources()
                            .withNewStatus()
                            .endStatus()
                            .endSubresources()
                            .build())
                    .endSpec()
                    .build();

//        server.expect().post().withPath("/apis/apiextensions.k8s.io/v1/customresourcedefinitions").andReturn(200, customResourceDefinition);
            mockServer.getClient().apiextensions().v1().customResourceDefinitions().createOrReplace(customResourceDefinition);
        }
    }

    @Test
    public void test(){
//        final NamespacedKubernetesClient client = server.createClient();
//        server.expect().post().withPath("/apis/mercury.redhat.io/v1alpha1/namespaces/" + client.getNamespace() + "/servicedomainclusters").andReturn(200,"test");

        final ServiceDomainCluster sdc = new ServiceDomainCluster();
        sdc.getMetadata().setName("service-domain-cluster");
        final ServiceDomainClusterSpec sdcs = new ServiceDomainClusterSpec();
        sdc.setSpec(sdcs);

        final ServiceDomainCluster serviceDomainCluster = mockServer.getClient().resources(ServiceDomainCluster.class).create(sdc);

        final Role role = mockServer.getClient().rbac().roles().withName(ServiceDomainClusterController.SERVICE_DOMAIN_ROLE).get();
        assertNotNull(role);
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_ROLE, role.getMetadata().getName());

        final List<OwnerReference> ownerReferences = role.getMetadata().getOwnerReferences();
        assertNotNull(ownerReferences);
        assertFalse(ownerReferences.isEmpty());

        final OwnerReference ownerReference = ownerReferences.get(0);
        assertNotNull(ownerReference);
        assertEquals(serviceDomainCluster.getMetadata().getName(), ownerReference.getName());
        assertEquals(serviceDomainCluster.getMetadata().getUid(), ownerReference.getUid());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND, ownerReference.getKind());
        assertEquals(ServiceDomainClusterController.SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION, ownerReference.getApiVersion());
    }
}
