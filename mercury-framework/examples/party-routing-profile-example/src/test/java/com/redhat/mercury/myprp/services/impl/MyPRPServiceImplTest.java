package com.redhat.mercury.myprp.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myprp.notification.CustomerOfferProcedureSink;
import com.redhat.mercury.partyroutingprofile.v10.RetrieveStatusResponseOuterClass.RetrieveStatusResponse;
import com.redhat.mercury.partyroutingprofile.v10.StatusOuterClass.Status;
import com.redhat.mercury.partyroutingprofile.v10.UpdateStatusRequestStatusOuterClass.UpdateStatusRequestStatus;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BqStatusService.RetrieveStatusRequest;
import com.redhat.mercury.partyroutingprofile.v10.client.PartyRoutingProfileClient;

import io.grpc.StatusRuntimeException;
import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MyPRPServiceImplTest {

    @Inject
    PartyRoutingProfileClient client;

    @Inject
    CustomerOfferProcedureSink sink;

    @Test
    void testRetrievePartyStateStatus_Processing() throws ExecutionException, InterruptedException, TimeoutException {

        String customerRef = "bob";

        sink.onReceive(CRStateNotification
                .builder(ServiceDomain.PARTY_ROUTING_PROFILE)
                .withReference(customerRef)
                .invocation()
                .workPerformance()
                .processing()
                .build());

        CompletableFuture<RetrieveStatusResponse> message = new CompletableFuture<>();
        client.getBQStatusService().retrieveStatus(
                RetrieveStatusRequest.newBuilder()
                        .setPartyroutingprofileId(customerRef)
                        .build()
        ).subscribe().with(message::complete, message::completeExceptionally);

        RetrieveStatusResponse expected = RetrieveStatusResponse.newBuilder()
                .setStatus(UpdateStatusRequestStatus.newBuilder()
                        .setCustomerRelationshipStatusNarrative(ControlRecordState.PROCESSING)
                        .build()).build();
        assertThat(message.get(5, TimeUnit.SECONDS)).isEqualTo(expected);
    }

    @Test
    void testRetrievePartyStateStatus_Initiated() throws ExecutionException, InterruptedException, TimeoutException {
        String customerRef = "jane";

        sink.onReceive(CRStateNotification
                .builder(ServiceDomain.PARTY_ROUTING_PROFILE)
                .withReference(customerRef)
                .invocation()
                .workPerformance()
                .initiated()
                .build());

        CompletableFuture<RetrieveStatusResponse> message = new CompletableFuture<>();
        client.getBQStatusService().retrieveStatus(
                RetrieveStatusRequest.newBuilder()
                        .setPartyroutingprofileId(customerRef)
                        .build()
        ).subscribe().with(message::complete, message::completeExceptionally);

        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(io.grpc.Status.NOT_FOUND));
    }


    @Test
    void testRetrievePartyStateStatus_Interrupted() throws ExecutionException, InterruptedException, TimeoutException {
        String customerRef = "neil";

        sink.onReceive(CRStateNotification
                .builder(ServiceDomain.PARTY_ROUTING_PROFILE)
                .withReference(customerRef)
                .invocation()
                .workPerformance()
                .processing()
                .build());

        CompletableFuture<RetrieveStatusResponse> message = new CompletableFuture<>();
        client.getBQStatusService().retrieveStatus(
                RetrieveStatusRequest.newBuilder()
                        .setPartyroutingprofileId(customerRef)
                        .build()
        ).subscribe().with(message::complete, message::completeExceptionally);

        RetrieveStatusResponse expected = RetrieveStatusResponse.newBuilder()
                .setStatus(UpdateStatusRequestStatus.newBuilder()
                        .setCustomerRelationshipStatusNarrative(ControlRecordState.PROCESSING)
                        .build()).build();
        
        assertThat(message.get(5, TimeUnit.SECONDS)).isEqualTo(expected);

        sink.onReceive(CRStateNotification
                .builder(ServiceDomain.PARTY_ROUTING_PROFILE)
                .withReference(customerRef)
                .invocation()
                .workPerformance()
                .interrupted()
                .build());

        message = new CompletableFuture<>();
        client.getBQStatusService().retrieveStatus(
                RetrieveStatusRequest.newBuilder()
                        .setPartyroutingprofileId(customerRef)
                        .build()
        ).subscribe().with(message::complete, message::completeExceptionally);

        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(io.grpc.Status.NOT_FOUND));
    }
}
