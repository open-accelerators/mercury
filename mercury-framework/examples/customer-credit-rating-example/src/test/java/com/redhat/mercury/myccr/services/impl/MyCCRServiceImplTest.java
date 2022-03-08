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

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

@QuarkusTest
class MyCCRServiceImplTest {

    @Inject
    CustomerCreditRatingClient client;

    @Test
    void testRetrieveCustomerCreditRatingState() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(client).isNotNull();
        CompletableFuture<RetrieveCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCrCustomerCreditRatingStateService().retrieve(
                RetrieveRequest.newBuilder().setCustomercreditratingId("some-ccr").build()
        ).subscribe().with(message::complete);

        assertThat(message.get(5, TimeUnit.SECONDS)
                .getCustomerCreditRatingState()
                .getCreditRatingAssessmentResult())
                .isEqualTo("802");
    }

    @Test
    void testExecute() {
        CompletableFuture<ExecuteCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCrCustomerCreditRatingStateService()
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
        CompletableFuture<RequestCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCrCustomerCreditRatingStateService()
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
    void testInitiate() {
        CompletableFuture<InitiateCustomerCreditRatingStateResponse> message = new CompletableFuture<>();
        client.getCrCustomerCreditRatingStateService()
                .initiate(InitiateRequest.getDefaultInstance())
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
