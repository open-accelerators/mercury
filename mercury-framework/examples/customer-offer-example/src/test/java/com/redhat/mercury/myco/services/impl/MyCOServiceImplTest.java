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
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass;
import com.redhat.mercury.customeroffer.v10.ExecuteCustomerOfferProcedureResponseOuterClass.ExecuteCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestCustomerOfferProcedureOuterClass.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureRequestOuterClass.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.RequestCustomerOfferProcedureResponseOuterClass.RequestCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.ExecuteRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RequestRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RetrieveRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.customeroffer.v10.client.CustomerOfferClient;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.messaging.KafkaTestResourceLifecycleManager;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.smallrye.mutiny.Uni;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@QuarkusTest
@QuarkusTestResource(KafkaTestResourceLifecycleManager.class)
class MyCOServiceImplTest {

    private static final String CUSTOMER_REF = "foo";

    @Inject
    CustomerOfferClient client;

    @InjectMock
    CustomerOfferService mockSvc;

    @Test
    void testSerializeCustomerOfferInitiateRequest() throws Exception {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(ControlRecordState.INITIATED)
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
    }

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(ControlRecordState.INITIATED)
                .build();
        when(mockSvc.initiateProcedure(CUSTOMER_REF)).thenReturn(Uni.createFrom().item(expected));

        InitiateRequest procedure = InitiateRequest.newBuilder()
                .setInitiateCustomerOfferProcedureRequest(InitiateCustomerOfferProcedureRequest.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure.newBuilder()
                                .setCustomerReference(CUSTOMER_REF))
                        .build())
                .build();

        CompletableFuture<InitiateCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().initiate(procedure).subscribe().with(message::complete, message::completeExceptionally);
        InitiateCustomerOfferProcedureResponse response = message.get(5, TimeUnit.SECONDS);
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
    }

    @Test
    void testUpdateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(ControlRecordState.COMPLETED)
                .build();
        when(mockSvc.updateProcedure(any())).thenReturn(Uni.createFrom().item(expected));

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId(expected.getId().toString())
                .setCustomerOfferProcedure(com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .setCustomerOfferProcessingTaskResult(ControlRecordState.COMPLETED)
                        .build())
                .build();
        CompletableFuture<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(updatedProcedure).subscribe().with(updatedMessage::complete, updatedMessage::completeExceptionally);

        CustomerOfferProcedureOuterClass.CustomerOfferProcedure customerOfferProcedure = updatedMessage.get(5, TimeUnit.SECONDS);
        assertThat(customerOfferProcedure.getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(customerOfferProcedure.getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
    }

    @Test
    void testUpdateNullCustomerOfferProcedure() {
        when(mockSvc.updateProcedure(any(CustomerOfferProcedure.class))).thenReturn(Uni.createFrom().failure(new StatusRuntimeException(Status.NOT_FOUND)));

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId("2999")
                .setCustomerOfferProcedure(com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .build())
                .build();

        CompletableFuture<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService().update(updatedProcedure)
                .subscribe()
                .with(updatedMessage::complete, updatedMessage::completeExceptionally);

        assertThat(updatedMessage).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.NOT_FOUND));
    }

    @Test
    void testExecute() {
        CompletableFuture<ExecuteCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .execute(ExecuteRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Test
    void testRequest() {
        CompletableFuture<RequestCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .request(RequestRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Test
    void testRetrieve() {
        CompletableFuture<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .retrieve(RetrieveRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

}
