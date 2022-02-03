package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.customercreditrating.v10.client.CustomerCreditRatingClient;
import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseOuterClass.RetrieveCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RetrieveRequest;

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
        client.getCrCustomerCreditRatingStateService().retrieve(
                RetrieveRequest.newBuilder().setCustomercreditratingId("some-ccr").build()
        ).subscribe().with(message::complete);

        assertThat(message.get(5, TimeUnit.SECONDS)
                .getCustomerCreditRatingState()
                .getCreditRatingAssessmentResult())
                .isEqualTo("802");
    }
}
