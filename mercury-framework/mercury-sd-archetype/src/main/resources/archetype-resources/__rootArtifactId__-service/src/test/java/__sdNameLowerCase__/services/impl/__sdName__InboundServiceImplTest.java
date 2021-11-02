package ${package}.${sdNameLowerCase}.services.impl;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.InboundBindingService;
import org.junit.jupiter.api.Test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.constants.BianCloudEvent;
import ${package}.${sdNameLowerCase}.services.${sdName}Service;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ${sdName}InboundServiceImplTest {

    @GrpcClient
    InboundBindingService inboundBindingService;

    @Inject
    ${sdName}Service service;

    @Test
    void testQuery() throws InterruptedException, ExecutionException, TimeoutException, InvalidProtocolBufferException {
        String sdRefId = "foo";
        // Use constant from com.redhat.mercury.testservicedomain.TestServiceDomain
        String ceType = "org.bian.testservicedomain.replaceme";
        // SomeType expected = SomeType.newBuilder()....build();
        CompletableFuture<CloudEvent> message = new CompletableFuture<>();
        inboundBindingService.query(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setType(ceType)
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(sdRefId)
                        .build())
                .build()).subscribe().with(ce -> message.complete(ce), failure -> {
                    message.completeExceptionally(failure);
                }
        );

        // Testing the missing mapping for this CloudEvent
        message.handle((ce, e) -> {
            assertThat(ce).isNull();
            assertThat(e).isInstanceOf(StatusRuntimeException.class);
            assertThat(((StatusRuntimeException) e).getStatus().getCode()).isEqualTo(Status.INVALID_ARGUMENT.getCode());
            assertThat(e.getMessage()).isEqualTo("INVALID_ARGUMENT: Mapping not found for CloudEvent type: %s", ceType);
            return null;
        }).get(10, TimeUnit.SECONDS);
        assertThat(message.isCompletedExceptionally()).isTrue();

        // assertThat(ce.getType()).isEqualTo(ceType);
        // assertThat(ce.getId()).isNotBlank();
        // assertThat(ce.getAttributesOrThrow(BianCloudEvent.CE_ACTION).getCeString()).isEqualTo(BianCloudEvent.CE_ACTION_RESPONSE);
        // assertThat(ce.getProtoData()).isNotNull();
        // SomeType response = ce.getProtoData().unpack(SomeType.class);
        // assertThat(response).isEqualTo(expected);
    }
}
