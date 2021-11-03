package com.redhat.mercury.customeroffer.services.client;

import java.util.UUID;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.SDCustomerOffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_CUSTOMER_OFFER_TYPE;



public class CustomerOfferClient extends CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferClient.class);

    @GrpcClient
    OutboundBindingService outbound;

    @Override
    public Uni<Message> initiateCustomerOfferProcedure(CustomerOfferProcedure procedure) {
        return outbound.command(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                        .setProtoData(Any.pack(procedure))
                        .build())
                .onItem()
                .transform(e -> null);
    }

    @Override
    public Uni<Message> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return outbound.command(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                        .setProtoData(Any.pack(update))
                        .build())
                .onItem()
                .transform(e -> null);
    }

    @Override
    public Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return outbound.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .build())
                .onItem()
                .transform(ce -> {
                    try {
                        return ce.getProtoData().unpack(SDCustomerOffer.class);
                    } catch (InvalidProtocolBufferException e) {
                        LOGGER.error("Unable to unpack response", e);
                        return null;
                    }
                });
    }

    @Override
    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return outbound.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(CUSTOMER_OFFER_RETRIEVE_CUSTOMER_OFFER_TYPE)
                        .putAttributes(CE_SD_REF, CE_CR_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId, crRefId)
                                .build())
                        .build())
                .onItem()
                .transform(ce -> {
                    try {
                        return ce.getProtoData().unpack(retrieveCustomerOffer.class);
                    } catch (InvalidProtocolBufferException e) {
                        LOGGER.error("Unable to unpack response", e);
                        return null;
                    }
                });

    }

}
