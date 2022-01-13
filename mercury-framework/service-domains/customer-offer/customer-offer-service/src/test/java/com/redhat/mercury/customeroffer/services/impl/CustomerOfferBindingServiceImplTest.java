package com.redhat.mercury.customeroffer.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModel;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModel;
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
        SDCustomerOfferRetrieveOutputModel expected = new SDCustomerOfferRetrieveOutputModel();
        Mockito.when(service.retrieveSDCustomerOffer(sdRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<SDCustomerOfferRetrieveOutputModel> response = client.retrieveSDCustomerOffer(sdRefId);
        CompletableFuture<SDCustomerOfferRetrieveOutputModel> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete(m));
        SDCustomerOfferRetrieveOutputModel sdCustomerOffer = message.get(5, TimeUnit.SECONDS);
        assertThat(sdCustomerOffer).isEqualTo(expected);
    }

    @Test
    void testQueryProcedureRetrieve() throws ExecutionException, InterruptedException, TimeoutException {
        String sdRefId = "foo";
        String crRefId = "bar";
        CRCustomerOfferProcedureRetrieveOutputModel expected = new CRCustomerOfferProcedureRetrieveOutputModel();
        Mockito.when(service.retrieveCustomerOffer(sdRefId, crRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<CRCustomerOfferProcedureRetrieveOutputModel> response = client.retrieveCustomerOffer(sdRefId, crRefId);
        CompletableFuture<CRCustomerOfferProcedureRetrieveOutputModel> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete(m));
        CRCustomerOfferProcedureRetrieveOutputModel procedure = message.get(5, TimeUnit.SECONDS);
        assertThat(procedure).isEqualTo(expected);
    }

}
