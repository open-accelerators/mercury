package com.redhat.mercury.myccr.services.impl;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.bian.protobuf.BindingService;
import org.bian.protobuf.customercreditrating.Rating;
import org.junit.jupiter.api.Test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

@QuarkusTest
class MyCCRServiceImplTest {

    @GrpcClient
    BindingService svc;

    @Test
    void testQuery() throws ExecutionException, InterruptedException, TimeoutException {
        assertThat(svc).isNotNull();
        CloudEvent ce = CloudEvent.newBuilder()
                .setType(CustomerCreditRating.STATE_RETRIEVE_TYPE)
                .putAttributes(CE_SD_REF, CloudEventAttributeValue.newBuilder().setCeString("some-sd").build())
                .putAttributes(CE_CR_REF, CloudEventAttributeValue.newBuilder().setCeString("some-cr").build())
                .setId(UUID.randomUUID().toString())
                .build();
        CompletableFuture<Rating> message = new CompletableFuture<>();
        svc.query(ce).subscribe().with(reply -> {
            try {
                message.complete(reply.getProtoData().unpack(Rating.class));
            } catch (InvalidProtocolBufferException e) {
                fail("Unexpected error", e);
            }
        });
        assertThat(message.get(5, TimeUnit.SECONDS).getRating())
                .isEqualTo(802);
    }

}
