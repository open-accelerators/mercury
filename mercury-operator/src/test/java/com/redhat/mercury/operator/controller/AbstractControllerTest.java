package com.redhat.mercury.operator.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainInfra;

import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
@WithKubernetesTestServer
public class AbstractControllerTest extends AbstractTest{

    @BeforeEach
    public void beforeEach() {
        mockServer.getKubernetesMockServer().clearExpectations();
    }

    @Test
    public void testUpdateStatusWithConditionStateChanged(){
        ServiceDomainInfra sdi = createReadySDI();
        ServiceDomain sd = createServiceDomain();

        mockServer.expect().get()
                .withPath("/apis/mercury.redhat.io/v1alpha1/namespaces/test-service-domain/servicedomaininfras/service-domain-infra")
                .andReturn(200, sdi)
                .always();

        UpdateControl<ServiceDomain> update = serviceDomainController.reconcile(sd, null);

        mockServer.expect().get()
                .withPath("/apis/mercury.redhat.io/v1alpha1/namespaces/test-service-domain/servicedomains/customer-offer")
                .andReturn(200, sd)
                .always();

        update = serviceDomainController.updateStatusWithReadyCondition(update.getResource(), CONDITION_READY);

        update = serviceDomainController.updateStatus(update.getResource());
        assertThat(update.isUpdateStatus()).isTrue();
    }

    @Test
    public void testUpdateStatusWithConditionTypeRemoved(){
        ServiceDomainInfra sdi = createReadySDI();
        ServiceDomain sd = createServiceDomain();

        mockServer.expect().get()
                .withPath("/apis/mercury.redhat.io/v1alpha1/namespaces/test-service-domain/servicedomaininfras/service-domain-infra")
                .andReturn(200, sdi)
                .always();

        serviceDomainController.reconcile(sd, null);

        mockServer.expect().get()
                .withPath("/apis/mercury.redhat.io/v1alpha1/namespaces/test-service-domain/servicedomains/customer-offer")
                .andReturn(200, sd)
                .always();

        UpdateControl<ServiceDomain> update = serviceDomainController.updateStatus(createServiceDomain());
        assertThat(update.isUpdateStatus()).isTrue();
    }
}
