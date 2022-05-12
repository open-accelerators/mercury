package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CustomerOfferServiceTest {

    private static final String CUSTOMER_REF = "some-ref";

    @Inject
    CustomerOfferService service;

    @Test
    void testInitiate() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(ControlRecordState.INITIATED);
    }

    @Test
    void testUpdate() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(ControlRecordState.INITIATED);

        message = new CompletableFuture<>();
        service.updateProcedure(state).subscribe().with(message::complete);

        state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(ControlRecordState.COMPLETED);

    }

    @Test
    void testUpdateNull() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.updateProcedure(CustomerOfferProcedure.builder().id(99999).build()).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state).isNull();
    }

}
