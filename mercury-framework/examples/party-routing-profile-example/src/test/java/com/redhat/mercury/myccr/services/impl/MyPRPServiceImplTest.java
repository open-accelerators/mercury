package com.redhat.mercury.myccr.services.impl;

import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.partyroutingprofile.PartyRoutingProfile;

import org.bian.protobuf.InboundBindingService;
import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.junit.jupiter.api.Test;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class MyPRPServiceImplTest {

    @GrpcClient
    InboundBindingService svc;

    @Test
    void testQuery() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CloudEvent> receiveMsg = new CompletableFuture<>();
        svc.receive(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setType(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE)
                .setProtoData(Any.pack(CustomerOfferNotification.newBuilder()
                        .setCustomerOfferReference(BasicReference.newBuilder().setId("kermit").build()).build()))
                .build()).subscribe().with(reply -> receiveMsg.complete(reply));
        assertThat(receiveMsg.get(5, TimeUnit.SECONDS)).isNotNull();

        CloudEvent ce = CloudEvent.newBuilder().setType(PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE)
                .putAttributes(CE_SD_REF, CloudEventAttributeValue.newBuilder().setCeString("some-sd").build())
                .putAttributes(CE_CR_REF, CloudEventAttributeValue.newBuilder().setCeString("kermit").build())
                .putAttributes(CE_BQ_REF, CloudEventAttributeValue.newBuilder().setCeString("some-bq").build())
                .setId(UUID.randomUUID().toString()).build();
        CompletableFuture<PartyRoutingStateList> message = new CompletableFuture<>();
        svc.query(ce).subscribe().with(reply -> {
            try {
                message.complete(reply.getProtoData().unpack(PartyRoutingStateList.class));
            } catch (InvalidProtocolBufferException e) {
                fail("Unexpected error", e);
            }
        });
        assertThat(message.get(5, TimeUnit.SECONDS).getPartyRoutingStatesCount()).isEqualTo(1);
    }

}
