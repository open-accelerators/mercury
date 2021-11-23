package com.redhat.mercury.customeroffer.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.SDCustomerOffer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.customeroffer.services.client.CustomerOfferClient;

import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CustomerOfferBindingServiceImplTest {

    @Inject
    CustomerOfferClient client;

    @Inject
    CustomerOfferService service;

    @Test
    void testQuerySDRetrieve() throws ExecutionException, InterruptedException, TimeoutException {
        String sdRefId = "foo";
        SDCustomerOffer expected = SDCustomerOffer.newBuilder().build();
        Mockito.when(service.retrieveSDCustomerOffer(sdRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<Message> response = client.retrieveSDCustomerOffer(sdRefId);
        CompletableFuture<SDCustomerOffer> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete((SDCustomerOffer) m));
        SDCustomerOffer sdCustomerOffer = message.get(5, TimeUnit.SECONDS);
        assertThat(sdCustomerOffer).isEqualTo(expected);
    }

    @Test
    void testQueryProcedureRetrieve() throws ExecutionException, InterruptedException, TimeoutException {
        String sdRefId = "foo";
        String crRefId = "bar";
        CustomerOfferProcedure expected = CustomerOfferProcedure.newBuilder().build();
        Mockito.when(service.retrieveCustomerOffer(sdRefId, crRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<Message> response = client.retrieveCustomerOffer(sdRefId, crRefId);
        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete((CustomerOfferProcedure) m));
        CustomerOfferProcedure procedure = message.get(5, TimeUnit.SECONDS);
        assertThat(procedure).isEqualTo(expected);
    }

}
