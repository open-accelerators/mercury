package com.redhat.mercury.myco.services.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Message;
import org.eclipse.microprofile.reactive.messaging.spi.Connector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.customeroffer.CustomerOffer;
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
import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.messaging.KafkaTestResourceLifecycleManager;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.providers.connectors.InMemoryConnector;
import io.smallrye.reactive.messaging.providers.connectors.InMemorySink;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.fail;
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

    @Inject
    @Connector(InMemoryConnector.CONNECTOR)
    InMemoryConnector connector;

    @BeforeEach
    void clear() {
        connector.sink(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE).clear();
    }

    @Test
    void testSerializeCustomerOfferInitiateRequest() throws Exception {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(ControlRecordState.INITIATED)
                .build();
        when(mockSvc.initiateProcedure(CUSTOMER_REF)).thenReturn(Uni.createFrom().item(expected));
        CRStateNotification expectedNotification = CRStateNotification.builder(ServiceDomain.CUSTOMER_OFFER)
                .withReference(expected.getId().toString())
                .invocation()
                .workPerformance()
                .initiated()
                .build();
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

        InMemorySink<CRStateNotification> sink = connector.sink(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE);
        await().atMost(5, TimeUnit.SECONDS)
                .<List<? extends Message<CRStateNotification>>>until(sink::received, t -> t.size() == 1);
        assertThat(sink.received().get(0).getPayload()).isEqualTo(expectedNotification);
    }

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder().id(1)
                .customerReference(CUSTOMER_REF)
                .status(ControlRecordState.INITIATED)
                .build();
        when(mockSvc.initiateProcedure(CUSTOMER_REF)).thenReturn(Uni.createFrom().item(expected));
        CRStateNotification expectedNotification = CRStateNotification.builder(ServiceDomain.CUSTOMER_OFFER)
                .withReference(expected.getId().toString())
                .invocation()
                .workPerformance()
                .initiated()
                .build();

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

        InMemorySink<CRStateNotification> sink = connector.sink(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE);
        await().atMost(5, TimeUnit.SECONDS)
                .<List<? extends Message<CRStateNotification>>>until(sink::received, t -> t.size() == 1);
        assertThat(sink.received().get(0).getPayload()).isEqualTo(expectedNotification);
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
        client.getCrCustomerOfferProcedureService().update(updatedProcedure).subscribe().with(updatedMessage::complete);
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTask()).isEqualTo(expected.getId().toString());
        assertThat(updatedMessage.get(5, TimeUnit.SECONDS).getCustomerOfferProcessingTaskResult()).isEqualTo(expected.getStatus());
    }

    @Test
    void testUpdateNullCustomerOfferProcedure() {
        when(mockSvc.updateProcedure(any(CustomerOfferProcedure.class))).thenReturn(Uni.createFrom().failure(new StatusRuntimeException(Status.NOT_FOUND)));

        UpdateRequest updatedProcedure = UpdateRequest.newBuilder().setCustomerofferId("x")
                .setCustomerOfferProcedure(com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure.newBuilder()
                        .setCustomerReference(Any.newBuilder().setValue(ByteString.copyFromUtf8(CUSTOMER_REF)).build())
                        .build())
                .build();

        CompletableFuture<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> updatedMessage = new CompletableFuture<>();
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

    @Test
    void testExecute() {
        CompletableFuture<ExecuteCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .execute(ExecuteRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        try {
            message.get(5, TimeUnit.SECONDS);
            fail("Expected exception");
        } catch (Exception e) {
            assertThat(message).isCompletedExceptionally();
        }
    }

    @Test
    void testRequest() {
        CompletableFuture<RequestCustomerOfferProcedureResponse> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .request(RequestRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        try {
            message.get(5, TimeUnit.SECONDS);
            fail("Expected exception");
        } catch (Exception e) {
            assertThat(message).isCompletedExceptionally();
        }
    }

    @Test
    void testRetrieve() {
        CompletableFuture<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> message = new CompletableFuture<>();
        client.getCrCustomerOfferProcedureService()
                .retrieve(RetrieveRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        try {
            message.get(5, TimeUnit.SECONDS);
            fail("Expected exception");
        } catch (Exception e) {
            assertThat(message).isCompletedExceptionally();
        }
    }

}
