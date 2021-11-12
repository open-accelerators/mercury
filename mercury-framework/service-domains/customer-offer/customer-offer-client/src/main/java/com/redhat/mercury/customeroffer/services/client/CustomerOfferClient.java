package com.redhat.mercury.customeroffer.services.client;

import java.util.UUID;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.SDCustomerOffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;


public class CustomerOfferClient extends CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferClient.class);

    @GrpcClient
    OutboundBindingService outboundBindingService;

    @Override
    public Uni<Message> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure) {
        return outboundBindingService.command(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                        .setProtoData(Any.pack(procedure))
                        .build())
                .onItem()
                .transform(e -> null);
    }

    @Override
    public Uni<Message> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return outboundBindingService.command(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                        .setProtoData(Any.pack(update))
                        .build())
                .onItem()
                .transform(e -> null);
    }

    @Override
    public Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return outboundBindingService.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .build())
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(SDCustomerOffer.class)));
    }

    @Override
    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return outboundBindingService.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .putAttributes(CE_CR_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(crRefId)
                                .build())
                        .build())
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(CustomerOfferProcedure.class)));
    }
}
