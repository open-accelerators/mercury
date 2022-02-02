package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestCustomerOfferProcedureOuterClass.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestOuterClass.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.customeroffer.v10.client.CustomerOfferClient;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@QuarkusTest
class MyCOServiceImplTest {

    private static final String COMPLETED = "COMPLETED";
    private static final String INITIATED = "INITIATED";
    private static final String CUSTOMER_REF = "foo";

    @Inject
    CustomerOfferClient client;

    @InjectMock
    CustomerOfferNotificationService notificationService;

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        InitiateRequest procedure = InitiateRequest.newBuilder()
                .setInitiateCustomerOfferProcedureRequest(InitiateCustomerOfferProcedureRequest.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure.newBuilder()
                                .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                                .build())
                        .build())
                .build();
        CompletableFuture<InitiateCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().initiate(procedure).subscribe().with(reply -> message.complete(reply));
        InitiateCustomerOfferProcedureResponse response = message.get(5, TimeUnit.SECONDS);
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTask()).isNotBlank();
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo(INITIATED);
        String id = response.getCustomerOfferProcedure().getCustomerOfferProcessingTask();
        verify(notificationService, times(1)).onCustomerOfferInitiated(id);
    }

    @Test
    void testUpdateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        InitiateRequest procedure = InitiateRequest.newBuilder()
                .setInitiateCustomerOfferProcedureRequest(InitiateCustomerOfferProcedureRequest.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure.newBuilder()
                                .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                                .build())
                        .build())
                .build();
        CompletableFuture<InitiateCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().initiate(procedure).subscribe().with(reply -> message.complete(reply));
        InitiateCustomerOfferProcedureResponse response = message.get(5, TimeUnit.SECONDS);
        String resultId = response.getCustomerOfferProcedure().getCustomerOfferProcessingTask();
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo(INITIATED);
        verify(notificationService, times(1)).onCustomerOfferInitiated(resultId);

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId(resultId)
                .setCustomerOfferProcedure(CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .build())
                .build();
        CompletableFuture<CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(updatedProcedure).subscribe().with(reply -> updatedMessage.complete(reply));
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTask()).isEqualTo(resultId);
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTaskResult()).isEqualTo(COMPLETED);
        verify(notificationService, times(1)).onCustomerOfferCompleted(resultId);
    }
}
