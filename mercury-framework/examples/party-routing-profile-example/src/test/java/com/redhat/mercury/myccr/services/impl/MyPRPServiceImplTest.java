package com.redhat.mercury.myccr.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.myprp.services.impl.CustomerOfferEventHandler;
import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;
import com.redhat.mercury.partyroutingprofile.model.PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord;
import com.redhat.mercury.partyroutingprofile.services.client.PartyRoutingProfileClient;

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
        eventHandler.onCustomerOfferCompleted(crRefId).await().indefinitely();
        CompletableFuture<BQStatusRetrieveOutputModel> message = new CompletableFuture<>();
        client.retrievePartyStateStatus("some-sd", crRefId, "some-bq").subscribe().with(reply -> {
            message.complete(reply);
        });
        BQStatusRetrieveOutputModel expected = new BQStatusRetrieveOutputModel();
        expected.setStatusRetrieveActionTaskReference("kermit");
        PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord record = new PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord();
        record.setCustomerRelationshipStatus("1");
        expected.setStatusInstanceRecord(record);
        assertThat(message.get(5, TimeUnit.SECONDS)).isEqualTo(expected);
    }

}
