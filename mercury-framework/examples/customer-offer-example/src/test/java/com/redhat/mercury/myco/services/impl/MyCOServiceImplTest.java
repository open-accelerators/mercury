package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.redhat.mercury.customeroffer.v10.client.CustomerOfferClient;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestCustomerOfferProcedureOuterClass.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestOuterClass.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@QuarkusTest
class MyCOServiceImplTest {

    @Inject
    CustomerOfferClient client;

    @InjectMock
    CustomerOfferNotificationService notificationService;

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        InitiateRequest procedure = InitiateRequest.newBuilder()
                .setInitiateCustomerOfferProcedureRequest(InitiateCustomerOfferProcedureRequest.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure.newBuilder()
                                .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8("foo")).build())
                                .build())
                        .build())
                .build();
        CompletableFuture<Void> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().initiate(procedure).subscribe().with(reply -> message.complete(null));
        message.get(5, TimeUnit.SECONDS);
        verify(notificationService, times(1)).onCustomerOfferInitiated("foo");
    }

    @Test
    void testUpdateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        UpdateRequest procedure = UpdateRequest.newBuilder()
                .setCustomerOfferProcedure(CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8("foo")).build())
                        .build())
                .build();
        CompletableFuture<Void> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(procedure).subscribe().with(reply -> message.complete(null));
        message.get(5, TimeUnit.SECONDS);
        verify(notificationService, times(1)).onCustomerOfferCompleted("foo");
    }
}
