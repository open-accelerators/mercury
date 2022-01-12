package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.customercreditrating.model.CRCustomerCreditRatingStateRetrieveOutputModel;
import com.redhat.mercury.customercreditrating.services.client.CustomerCreditRatingClient;

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MyCCRServiceImplTest {

    @Inject
    CustomerCreditRatingClient client;

    @Test
    void testRetrieveCustomerCreditRatingState() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(client).isNotNull();
        CompletableFuture<CRCustomerCreditRatingStateRetrieveOutputModel> message = new CompletableFuture<>();
        client.retrieveCustomerCreditRating("some-sd", "some-cr").subscribe().with(reply -> {
            message.complete(reply);
        });
        assertThat(message.get(5, TimeUnit.SECONDS)
                .getCustomerCreditRatingStateInstanceRecord()
                .getCustomerCreditRatingAssessmentRecord()
                .getCreditRatingAssessmentResult())
                .isEqualTo("802");
    }

}
