package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.customercreditrating.v10.ExecuteCustomerCreditRatingStateResponseOuterClass.ExecuteCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.InitiateCustomerCreditRatingStateResponseOuterClass.InitiateCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.RequestCustomerCreditRatingStateResponseOuterClass.RequestCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseOuterClass.RetrieveCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.ExecuteRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.InitiateRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RequestRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RetrieveRequest;
import com.redhat.mercury.customercreditrating.v10.client.CustomerCreditRatingClient;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MyCCRServiceImplTest {

    @Inject
    CustomerCreditRatingClient client;

    @Test
    void testRetrieveCustomerCreditRatingState() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(client).isNotNull();
        CompletableFuture<RetrieveCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCRCustomerCreditRatingStateService().retrieve(
                RetrieveRequest.newBuilder().setCustomercreditratingId("jane").build()
        ).subscribe().with(message::complete);

        assertThat(message.get(5, TimeUnit.SECONDS)
                .getCustomerCreditRatingState()
                .getCreditRatingAssessmentResult())
                .isEqualTo("802");
    }

    @Test
    void testRetrieveCustomerCreditRatingStateNotFound() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(client).isNotNull();
        CompletableFuture<RetrieveCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCRCustomerCreditRatingStateService().retrieve(
                RetrieveRequest.newBuilder().setCustomercreditratingId("not-found").build()
        ).subscribe().with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.NOT_FOUND));
    }

    @Test
    void testExecute() {
        CompletableFuture<ExecuteCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCRCustomerCreditRatingStateService()
                .execute(ExecuteRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Test
    void testRequest() {
        CompletableFuture<RequestCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCRCustomerCreditRatingStateService()
                .request(RequestRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Test
    void testInitiate() {
        CompletableFuture<InitiateCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCRCustomerCreditRatingStateService()
                .initiate(InitiateRequest.getDefaultInstance())
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        assertThat(message).failsWithin(5, TimeUnit.SECONDS)
                .withThrowableOfType(ExecutionException.class)
                .withCause(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }
}
