package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.customercreditrating.Rating;
import org.junit.jupiter.api.Test;

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
        CompletableFuture<Rating> message = new CompletableFuture<>();
        client.retrieveCustomerCreditRatingState("some-sd", "some-cr").subscribe().with(reply -> {
            message.complete((Rating) reply);
        });
        assertThat(message.get(5, TimeUnit.SECONDS).getRating())
                .isEqualTo(802);
    }

}
