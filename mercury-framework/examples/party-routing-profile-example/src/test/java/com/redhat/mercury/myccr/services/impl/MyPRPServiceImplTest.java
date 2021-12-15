package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.partyroutingprofile.PartyRoutingState;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.junit.jupiter.api.Test;

import com.redhat.mercury.myprp.services.impl.CustomerOfferEventHandler;
import com.redhat.mercury.myprp.services.impl.PartyRoutingService;
import com.redhat.mercury.partyroutingprofile.services.client.PartyRoutingProfileClient;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MyPRPServiceImplTest {

    @Inject
    PartyRoutingProfileClient client;

    @Inject
    CustomerOfferEventHandler eventHandler;

    @Test
    void testRetrievePartyStateStatus() throws ExecutionException, InterruptedException, TimeoutException {
        String crRefId = "kermit";
        eventHandler.onCustomerOfferCompleted(CustomerOfferNotification.newBuilder()
                .setCustomerOfferReference(BasicReference.newBuilder()
                        .setId(crRefId)
                        .build()).setStatus(PartyRoutingService.COMPLETED_STATUS)
                .build()).await().indefinitely();
        CompletableFuture<PartyRoutingState> message = new CompletableFuture<>();
        client.retrievePartyStateStatus("some-sd", crRefId, "some-bq").subscribe().with(reply -> {
            message.complete((PartyRoutingState) reply);
        });
        assertThat(message.get(5, TimeUnit.SECONDS))
                .isEqualTo(PartyRoutingState.newBuilder()
                        .setProcessId("kermit")
                        .setCustomerOfferStatus("1")
                        .build());
    }

}
