package com.redhat.mercury.customeroffer.camel;

import java.util.UUID;

import org.apache.camel.Message;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.customeroffer.CustomerOffer;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CustomerOfferTransformer {

    private static final String EXTERNAL_SOURCE = "external";

    public static CloudEvent initiateCustomerOfferProcedure(Message message) throws InvalidProtocolBufferException {
        CustomerOfferProcedureInitiation.Builder builder = CustomerOfferProcedureInitiation.newBuilder();
        JsonFormat.parser().merge(message.getBody(String.class), builder);
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("sdReferenceId", String.class))
                        .build())
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build())
                .setProtoData(Any.pack(builder.build()))
                .build();
    }

    public static CloudEvent updateCustomerOfferProcedure(Message message) throws InvalidProtocolBufferException {
        CustomerOfferProcedureUpdate.Builder builder = CustomerOfferProcedureUpdate.newBuilder();
        JsonFormat.parser().merge(message.getBody(String.class), builder);
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build())
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("sdReferenceId", String.class))
                        .build())
                .putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("crReferenceId", String.class))
                        .build())
                .setProtoData(Any.pack(builder.build()))
                .build();
    }

    public static CloudEvent retrieveSDCustomerOffer(Message message) {
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build())
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("sdReferenceId", String.class))
                        .build())
                .build();
    }

    public static CloudEvent retrieveCustomerOffer(Message message) {
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build())
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("sdReferenceId", String.class))
                        .build())
                .putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("crReferenceId", String.class))
                        .build())
                .build();
    }
}
