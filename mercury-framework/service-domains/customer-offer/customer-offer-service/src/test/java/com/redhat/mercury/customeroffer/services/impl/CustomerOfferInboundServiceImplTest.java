package com.redhat.mercury.customeroffer.services.impl;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.BindingService;
import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.SDCustomerOffer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CustomerOfferInboundServiceImplTest {

    @GrpcClient
    BindingService inboundBindingService;

    @Inject
    CustomerOfferService customerOfferService;

    @Test
    void testQuerySDRetrieve() throws ExecutionException, InterruptedException, TimeoutException, InvalidProtocolBufferException {
        String sdRefId = "foo";
        SDCustomerOffer expected = SDCustomerOffer.newBuilder().build();
        Mockito.when(customerOfferService.retrieveSDCustomerOffer(sdRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<CloudEvent> response = inboundBindingService
                .query(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_RETRIEVE_TYPE)
                        .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .build());
        CompletableFuture<CloudEvent> message = new CompletableFuture<>();
        response.subscribe().with(ce -> message.complete(ce));
        CloudEvent ce = message.get(5, TimeUnit.SECONDS);
        assertThat(ce.getType()).isEqualTo(CUSTOMER_OFFER_RETRIEVE_TYPE);
        assertThat(ce.getId()).isNotBlank();
        assertThat(ce.getAttributesOrThrow(BianCloudEvent.CE_ACTION).getCeString()).isEqualTo(BianCloudEvent.CE_ACTION_RESPONSE);
        assertThat(ce.getProtoData()).isNotNull();
        SDCustomerOffer sdCustomerOffer = ce.getProtoData().unpack(SDCustomerOffer.class);
        assertThat(sdCustomerOffer).isEqualTo(expected);
    }

    @Test
    void testQueryProcedureRetrieve() throws ExecutionException, InterruptedException, TimeoutException, InvalidProtocolBufferException {
        String sdRefId = "foo";
        String crRefId = "bar";
        CustomerOfferProcedure expected = CustomerOfferProcedure.newBuilder().build();
        Mockito.when(customerOfferService.retrieveCustomerOffer(sdRefId, crRefId)).thenReturn(Uni.createFrom().item(expected));
        Uni<CloudEvent> response = inboundBindingService
                .query(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE)
                        .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(crRefId)
                                .build())
                        .build());
        CompletableFuture<CloudEvent> message = new CompletableFuture<>();
        response.subscribe().with(ce -> message.complete(ce));
        CloudEvent ce = message.get(5, TimeUnit.SECONDS);
        assertThat(ce.getType()).isEqualTo(CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE);
        assertThat(ce.getId()).isNotBlank();
        assertThat(ce.getAttributesOrThrow(BianCloudEvent.CE_ACTION).getCeString()).isEqualTo(BianCloudEvent.CE_ACTION_RESPONSE);
        assertThat(ce.getProtoData()).isNotNull();
        CustomerOfferProcedure customerOfferProcedure = ce.getProtoData().unpack(CustomerOfferProcedure.class);
        assertThat(customerOfferProcedure).isEqualTo(expected);
    }

    @Test
    void testMappingNotFound() throws ExecutionException, InterruptedException, TimeoutException {
        String sdRefId = "foo";
        String ceType = "org.bian.testservicedomain.replaceme";
        Uni<CloudEvent> response = inboundBindingService.query(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setType(ceType)
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(sdRefId)
                        .build())
                .build());
        // Testing the missing mapping for this CloudEvent
        CompletableFuture<CloudEvent> message = new CompletableFuture<>();
        response.subscribe().with(
                ce -> message.complete(ce),
                failure -> message.completeExceptionally(failure)
        );
        message.handle((ce, e) -> {
            assertThat(ce).isNull();
            assertThat(e).isInstanceOf(StatusRuntimeException.class);
            assertThat(((StatusRuntimeException) e).getStatus().getCode()).isEqualTo(Status.INVALID_ARGUMENT.getCode());
            assertThat(e.getMessage()).isEqualTo("INVALID_ARGUMENT: Mapping not found for CloudEvent type: %s", ceType);
            return null;
        }).get(10, TimeUnit.SECONDS);
    }
}
