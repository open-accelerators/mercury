package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.myco.model.CustomerOfferState;

import io.quarkus.test.junit.QuarkusTest;

import static com.redhat.mercury.myco.services.impl.CustomerOfferService.COMPLETED_STATUS;
import static com.redhat.mercury.myco.services.impl.CustomerOfferService.INITIATED_STATUS;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CustomerOfferServiceTest {

    private static final String CUSTOMER_REF = "some-ref";

    @Inject
    CustomerOfferService service;

    @Test
    void testInitiate() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferState> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferState state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(INITIATED_STATUS);

        service.clear();
    }

    @Test
    void testUpdate() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferState> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferState state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(INITIATED_STATUS);

        message = new CompletableFuture<>();
        service.updateProcedure(state.getId()).subscribe().with(message::complete);

        state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(COMPLETED_STATUS);

        service.clear();
    }

    @Test
    void testUpdateNull() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferState> message = new CompletableFuture<>();
        service.updateProcedure(99999).subscribe().with(message::complete);

        CustomerOfferState state = message.get(5, TimeUnit.SECONDS);
        assertThat(state).isNull();
    }

    @Test
    void testGetStates() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(service.getStates()).isEmpty();

        CompletableFuture<CustomerOfferState> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferState state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();

        assertThat(service.getStates()).allMatch(s -> state.getId().equals(s.getId()));

        service.clear();
        assertThat(service.getStates()).isEmpty();
    }
}
