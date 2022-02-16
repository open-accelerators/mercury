package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterSpecBuilder;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatusBuilder;
import com.redhat.mercury.operator.model.ServiceDomainSpec;
import com.redhat.mercury.operator.model.ServiceDomainSpecBuilder;

import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.status.ConditionBuilder;
import io.strimzi.api.kafka.model.status.KafkaStatus;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;

import static com.redhat.mercury.operator.controller.ServiceDomainClusterController.KAFKA_LISTENER_TYPE_PLAIN;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_FALSE;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_SERVICE_DOMAIN_CLUSTER_READY;

public abstract class AbstractControllerTest {

    protected static final String SERVICE_DOMAIN_CLUSTER_NAME = "service-domain-cluster";
    protected static final String SERVICE_DOMAIN_NAME = "customer-offer";
    protected static final String SERVICE_DOMAIN_CLUSTER_NAMESPACE = "test-service-domain";

    @KubernetesTestServer
    protected KubernetesServer mockServer;

    @Inject
    protected ServiceDomainClusterController serviceDomainClusterController;

    @Inject
    protected ServiceDomainController serviceDomainController;

    public Kafka getExpectedKafKa(ServiceDomainCluster sdc) {
        final Kafka kafka = serviceDomainClusterController.createKafkaObj(sdc);

        final KafkaStatus status = new KafkaStatusBuilder().withListeners(new ListenerStatusBuilder()
                        .withType(KAFKA_LISTENER_TYPE_PLAIN)
                        .withAddresses(List.of(new ListenerAddressBuilder()
                                .withHost("www.test.com")
                                .build()))
                        .build())
                .withConditions(new ConditionBuilder()
                                        .withType(CONDITION_READY)
                                        .withStatus(STATUS_TRUE)
                                        .build())
                .build();
        kafka.setStatus(status);

        return kafka;
    }

    protected ServiceDomainCluster createReadySDC(String sdcName) {
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName(sdcName).withNamespace(SERVICE_DOMAIN_CLUSTER_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());
        cluster.setStatus(new ServiceDomainClusterStatusBuilder()
                                .withConditions(new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                                        .withType(CONDITION_READY)
                                                        .withStatus(STATUS_TRUE).build(),
                                                new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                                        .withType(CONDITION_SERVICE_DOMAIN_CLUSTER_READY)
                                                        .withStatus(STATUS_TRUE).build())
                                .withKafkaBroker("www.test").build());
        return cluster;
    }

    protected ServiceDomainCluster createNotReadySDC(String sdcName) {
        final ServiceDomainCluster cluster = new ServiceDomainCluster();
        cluster.setMetadata(new ObjectMetaBuilder().withName(sdcName).withNamespace(SERVICE_DOMAIN_CLUSTER_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());
        cluster.setSpec(new ServiceDomainClusterSpecBuilder().build());
        cluster.setStatus(new ServiceDomainClusterStatusBuilder()
                                .withConditions(new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                                        .withType(CONDITION_READY)
                                                        .withStatus(STATUS_FALSE).build(),
                                                new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                                        .withType(CONDITION_SERVICE_DOMAIN_CLUSTER_READY)
                                                        .withStatus(STATUS_FALSE).build())
                                .withKafkaBroker("www.test").build());
        return cluster;
    }

    protected ServiceDomainCluster createReadySDC() {
        return createReadySDC(SERVICE_DOMAIN_CLUSTER_NAME);
    }

    protected ServiceDomainCluster createNotReadySDC() {
        return createNotReadySDC(SERVICE_DOMAIN_CLUSTER_NAME);
    }

    protected ServiceDomain createServiceDomain() {
        return createServiceDomain(SERVICE_DOMAIN_NAME, true);
    }

    protected ServiceDomain createServiceDomain(String sdName) {
        return createServiceDomain(sdName, true);
    }

    protected ServiceDomain createServiceDomain(String sdName, boolean withHttpExpose) {
        final ServiceDomain sd = new ServiceDomain();
        sd.setMetadata(new ObjectMetaBuilder().withName(sdName).withNamespace(SERVICE_DOMAIN_CLUSTER_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());

        if (withHttpExpose) {
            sd.setSpec(new ServiceDomainSpecBuilder()
                    .withBusinessImage("testImage")
                    .withServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME)
                    .withType(ServiceDomainSpec.Type.CustomerOffer)
                    .withExpose(ServiceDomainSpec.ExposeType.http)
                    .build());
        } else {
            sd.setSpec(new ServiceDomainSpecBuilder()
                    .withBusinessImage("testImage")
                    .withServiceDomainCluster(SERVICE_DOMAIN_CLUSTER_NAME)
                    .withType(ServiceDomainSpec.Type.CustomerOffer)
                    .build());
        }
        return sd;
    }
}
