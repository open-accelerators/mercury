package ${package}.${sdNameLowerCase}.services.impl;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.InboundBindingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.exceptions.MappingNotFoundException;
import ${package}.${sdNameLowerCase}.services.${sdName}Service;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ${sdName}InboundServiceImplTest {

    @GrpcClient
    InboundBindingService inboundBindingService;

    @Inject
    ${sdName}Service service;

    @Test
    void testQuery() throws InterruptedException, ExecutionException, TimeoutException {
        String sdRefId = "foo";
        // Use constant from com.redhat.mercury.${sdNameLowerCase}.${sdName}
        String ceType = "org.bian.${sdNameLowerCase}.replaceme";
        // SomeType expected = SomeType.newBuilder()....build();
        Uni<CloudEvent> response = inboundBindingService.query(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setType(ceType)
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(sdRefId)
                        .build())
                .build());
        CompletableFuture<CloudEvent> message = new CompletableFuture<>();
        // Testing the missing mapping for this CloudEvent
        response.onFailure(MappingNotFoundException.class).call(e -> assertThat(e.getMessage()).isEqualTo("Mapping not found for CloudEvent type: " + ceType));

        // assertThat(ce.getType()).isEqualTo(ceType);
        // assertThat(ce.getId()).isNotBlank();
        // assertThat(ce.getAttributesOrThrow(BianCloudEvent.CE_ACTION).getCeString()).isEqualTo(BianCloudEvent.CE_ACTION_RESPONSE);
        // assertThat(ce.getProtoData()).isNotNull();
        // SomeType response = ce.getProtoData().unpack(SomeType.class);
        // assertThat(response).isEqualTo(expected);
    }
}
