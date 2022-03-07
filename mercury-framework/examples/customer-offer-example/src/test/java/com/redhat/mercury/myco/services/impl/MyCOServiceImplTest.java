package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestCustomerOfferProcedureOuterClass.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestOuterClass.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.customeroffer.v10.client.CustomerOfferClient;
import com.redhat.mercury.myco.model.CustomerOfferState;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.myco.services.impl.CustomerOfferService.COMPLETED_STATUS;
import static com.redhat.mercury.myco.services.impl.CustomerOfferService.INITIATED_STATUS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@QuarkusTest
class MyCOServiceImplTest {

    private static final String CUSTOMER_REF = "foo";

    @Inject
    CustomerOfferClient client;

    @InjectMock
    CustomerOfferService mockSvc;

    @InjectMock
    CustomerOfferNotificationService notificationService;

    @Test
    void testSerializeCustomerOfferInitiateRequest() throws Exception {
        CustomerOfferState expected = CustomerOfferState.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(INITIATED_STATUS)
                .build();
        when(mockSvc.initiateProcedure(CUSTOMER_REF)).thenReturn(Uni.createFrom().item(expected));


        String jsonReq = "{\n" +
                "  \"initiateCustomerOfferProcedureRequest\": {\n" +
                "    \"CustomerOfferProcedure\": {\n" +
                "      \"CustomerReference\": \"" + CUSTOMER_REF + "\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        InitiateRequest.Builder builder = InitiateRequest.newBuilder();
        JsonFormat.parser().merge(jsonReq, builder);
        CompletableFuture<InitiateCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .initiate(builder.build())
                .subscribe().with(message::complete);
        InitiateCustomerOfferProcedureResponse response = message.get(5, TimeUnit.SECONDS);
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
        verify(notificationService, times(1)).onCustomerOfferInitiated(expected.getId().toString());

    }

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferState expected = CustomerOfferState.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(INITIATED_STATUS)
                .build();
        when(mockSvc.initiateProcedure(CUSTOMER_REF)).thenReturn(Uni.createFrom().item(expected));

        InitiateRequest procedure = InitiateRequest.newBuilder()
                .setInitiateCustomerOfferProcedureRequest(InitiateCustomerOfferProcedureRequest.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure.newBuilder()
                                .setCustomerReference(CUSTOMER_REF))
                        .build())
                .build();

        CompletableFuture<InitiateCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().initiate(procedure).subscribe().with(message::complete);
        InitiateCustomerOfferProcedureResponse response = message.get(5, TimeUnit.SECONDS);
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
        verify(notificationService, times(1)).onCustomerOfferInitiated(expected.getId().toString());
    }

    @Test
    void testUpdateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferState expected = CustomerOfferState.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(COMPLETED_STATUS)
                .build();
        when(mockSvc.updateProcedure(expected.getId())).thenReturn(Uni.createFrom().item(expected));

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId(expected.getId().toString())
                .setCustomerOfferProcedure(CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .build())
                .build();
        CompletableFuture<CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(updatedProcedure).subscribe().with(updatedMessage::complete);
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
        verify(notificationService, times(1)).onCustomerOfferCompleted(expected.getId().toString());
    }

    @Test
    void testUpdateNullCustomerOfferProcedure() {
        when(mockSvc.updateProcedure(anyInt())).thenReturn(Uni.createFrom().failure(new StatusRuntimeException(Status.NOT_FOUND)));

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId("x")
                .setCustomerOfferProcedure(CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .build())
                .build();

        CompletableFuture<CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(updatedProcedure)
                .subscribe()
                .with(updatedMessage::complete, updatedMessage::completeExceptionally);
        try {
            updatedMessage.get(5, TimeUnit.SECONDS);
            fail("Exception expected");
        } catch (Exception e) {
            assertThat(updatedMessage.isCompletedExceptionally()).isTrue();
        }
    }

}
