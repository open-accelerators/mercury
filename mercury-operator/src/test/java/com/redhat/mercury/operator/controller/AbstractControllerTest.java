package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpecBuilder;
import com.redhat.mercury.operator.model.ServiceDomainSpecBuilder;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.status.KafkaStatus;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;

import javax.inject.Inject;
import java.util.List;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.*;

public abstract class AbstractControllerTest {

    protected static final String SERVICE_DOMAIN_CLUSTER_NAME = "service-domain-cluster";
    protected static final String SERVICE_DOMAIN_NAME = "service-domain";

    @KubernetesTestServer
    protected KubernetesServer mockServer;

    @Inject
    protected ServiceDomainClusterController serviceDomainClusterController;

    public Kafka getExpectedKafKa(String sdcUid, String sdcName){
        final Kafka kafka = serviceDomainClusterController.createKafkaObj(sdcUid,sdcName);

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

    protected ServiceDomainCluster createServiceDomainCluster(String sdcName) {
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName(sdcName).withNamespace(mockServer.getClient().getNamespace()).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());
        return cluster;
    }

    protected ServiceDomainCluster createServiceDomainCluster() {
        return createServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME);
    }

    protected ServiceDomain createServiceDomain() {
        return createServiceDomain(SERVICE_DOMAIN_NAME);
    }

    protected ServiceDomain createServiceDomain(String sdName) {
        final ServiceDomain sd = new ServiceDomain();
        sd.setMetadata(new ObjectMetaBuilder().withName(sdName).withNamespace(mockServer.getClient().getNamespace()).build());
        sd.setSpec(new ServiceDomainSpecBuilder()
                        .withBusinessImage("testImage")
                        .withServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME)
//                        .withBindingServiceImage("testBindingServiceImage")
                        .build());
        return sd;
    }

    protected boolean isServiceDomainClusterStatusUpdatedWithKafkaBrokerUrl(String sdcName) {
        return mockServer.getClient().resources(ServiceDomainCluster.class).withName(sdcName).get() != null
                && mockServer.getClient().resources(ServiceDomainCluster.class).withName(sdcName).get().getStatus() != null
                && mockServer.getClient().resources(ServiceDomainCluster.class).withName(sdcName).get().getStatus().getKafkaBroker() != null;
    }
}
