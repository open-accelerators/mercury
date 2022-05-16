package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import com.redhat.mercury.operator.model.AbstractResourceStatus;
import com.redhat.mercury.operator.model.ExposeSpecBuilder;
import com.redhat.mercury.operator.model.HttpExposeTypeBuilder;
import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainInfra;
import com.redhat.mercury.operator.model.ServiceDomainInfraSpecBuilder;
import com.redhat.mercury.operator.model.ServiceDomainInfraStatusBuilder;
import com.redhat.mercury.operator.model.ServiceDomainSpecBuilder;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.status.ConditionBuilder;
import io.strimzi.api.kafka.model.status.KafkaStatus;
import io.strimzi.api.kafka.model.status.KafkaStatusBuilder;
import io.strimzi.api.kafka.model.status.ListenerAddressBuilder;
import io.strimzi.api.kafka.model.status.ListenerStatusBuilder;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.MESSAGE_WAITING;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.REASON_WAITING;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_FALSE;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_SERVICE_DOMAIN_INFRA_READY;
import static io.strimzi.api.kafka.model.authentication.KafkaClientAuthenticationPlain.TYPE_PLAIN;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractTest {

    protected static final String SERVICE_DOMAIN_INFRA_NAME = "service-domain-infra";
    protected static final String SERVICE_DOMAIN_NAME = "customer-offer";
    protected static final String SERVICE_DOMAIN_INFRA_NAMESPACE = "test-service-domain";

    @KubernetesTestServer
    protected KubernetesServer mockServer;

    @Inject
    protected ServiceDomainInfraController serviceDomainInfraController;

    @Inject
    protected ServiceDomainController serviceDomainController;

    public Kafka getExpectedKafKa(ServiceDomainInfra sdi) {
        final Kafka kafka = serviceDomainInfraController.createKafkaObj(sdi);

        final KafkaStatus status = new KafkaStatusBuilder().withListeners(new ListenerStatusBuilder()
                        .withName(TYPE_PLAIN)
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

    protected ServiceDomainInfra createReadySDI(String sdiName) {
        final ServiceDomainInfra sdi = new ServiceDomainInfra();
        sdi.setMetadata(new ObjectMetaBuilder().withName(sdiName).withNamespace(SERVICE_DOMAIN_INFRA_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());
        sdi.setSpec(new ServiceDomainInfraSpecBuilder().build());
        sdi.setStatus(new ServiceDomainInfraStatusBuilder()
                .withConditions(new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                .withType(CONDITION_READY)
                                .withStatus(STATUS_TRUE).build(),
                        new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                .withType(CONDITION_SERVICE_DOMAIN_INFRA_READY)
                                .withStatus(STATUS_TRUE).build())
                .withKafkaBroker("www.test").build());
        return sdi;
    }

    protected ServiceDomainInfra createNotReadySDI(String sdiName) {
        final ServiceDomainInfra sdi = new ServiceDomainInfra();
        sdi.setMetadata(new ObjectMetaBuilder().withName(sdiName).withNamespace(SERVICE_DOMAIN_INFRA_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());
        sdi.setSpec(new ServiceDomainInfraSpecBuilder().build());
        sdi.setStatus(new ServiceDomainInfraStatusBuilder()
                .withConditions(new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                .withType(CONDITION_READY)
                                .withStatus(STATUS_FALSE).build(),
                        new io.fabric8.kubernetes.api.model.ConditionBuilder()
                                .withType(CONDITION_SERVICE_DOMAIN_INFRA_READY)
                                .withStatus(STATUS_FALSE).build())
                .withKafkaBroker("www.test").build());
        return sdi;
    }

    protected ServiceDomainInfra createReadySDI() {
        return createReadySDI(SERVICE_DOMAIN_INFRA_NAME);
    }

    protected ServiceDomainInfra createNotReadySDI() {
        return createNotReadySDI(SERVICE_DOMAIN_INFRA_NAME);
    }

    protected ServiceDomain createServiceDomain() {
        return createServiceDomain(SERVICE_DOMAIN_NAME, true);
    }

    protected ServiceDomain createServiceDomain(String sdName) {
        return createServiceDomain(sdName, true);
    }

    protected ServiceDomain createServiceDomain(String sdName, boolean withHttpExpose) {
        final ServiceDomain sd = new ServiceDomain();
        sd.setMetadata(new ObjectMetaBuilder().withName(sdName).withNamespace(SERVICE_DOMAIN_INFRA_NAMESPACE).withUid(String.valueOf(UUID.randomUUID())).build());

        if (withHttpExpose) {
            sd.setSpec(new ServiceDomainSpecBuilder()
                    .withBusinessImage("testImage")
                    .withServiceDomainInfra(SERVICE_DOMAIN_INFRA_NAME)
                    .withType(com.redhat.mercury.model.ServiceDomain.CUSTOMER_OFFER)
                    .withExpose(new ExposeSpecBuilder().withHttp(new HttpExposeTypeBuilder()
                                    .withApiVersion("v1")
                                    .build())
                            .build())
                    .build());
        } else {
            sd.setSpec(new ServiceDomainSpecBuilder()
                    .withBusinessImage("testImage")
                    .withServiceDomainInfra(SERVICE_DOMAIN_INFRA_NAME)
                    .withType(com.redhat.mercury.model.ServiceDomain.CUSTOMER_OFFER)
                    .build());
        }
        return sd;
    }

    protected <T extends CustomResource<?, ? extends AbstractResourceStatus>> void assertThatIsReady(UpdateControl<T> update) {
        assertThat(update.isUpdateStatus()).isTrue();
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_READY);
        assertThat(condition.getStatus()).isEqualTo(STATUS_TRUE);
        assertThat(condition.getReason()).isNull();
        assertThat(condition.getMessage()).isNull();
        assertThat(condition.getLastTransitionTime()).isNotNull();
    }

    protected <T extends CustomResource<?, ? extends AbstractResourceStatus>> void assertThatIsWaiting(UpdateControl<T> update) {
        assertThat(update.isUpdateStatus()).isTrue();
        Condition condition = update.getResource().getStatus().getCondition(CONDITION_READY);
        assertThat(condition.getStatus()).isEqualTo(STATUS_FALSE);
        assertThat(condition.getReason()).isEqualTo(REASON_WAITING);
        assertThat(condition.getMessage()).isEqualTo(MESSAGE_WAITING);
        assertThat(condition.getLastTransitionTime()).isNotNull();
    }
}
