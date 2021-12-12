package com.redhat.mercury.customeroffer.camel;

import java.util.UUID;

import org.apache.camel.Message;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.customeroffer.CustomerOffer;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;

public class CustomerOfferTransformer {

    private static final String EXTERNAL_SOURCE = "external";

    public static CloudEvent initiateCustomerOfferProcedure(Message message) throws InvalidProtocolBufferException {
        CustomerOfferProcedureInitiation.Builder builder = CustomerOfferProcedureInitiation.newBuilder();
        JsonFormat.parser().merge(message.getBody(String.class), builder);
        return buildEvent(message, CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                .setProtoData(Any.pack(builder.build()))
                .build();

    }

    public static CloudEvent updateCustomerOfferProcedure(Message message) throws InvalidProtocolBufferException {
        CustomerOfferProcedureInitiation.Builder builder = CustomerOfferProcedureInitiation.newBuilder();
        JsonFormat.parser().merge(message.getBody(String.class), builder);
        return buildEvent(message, CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                .setProtoData(Any.pack(builder.build()))
                .build();
    }

    public static CloudEvent retrieveSDCustomerOffer(Message message) {
        return buildEvent(message, CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE).build();
    }

    public static CloudEvent retrieveCustomerOffer(Message message) {
        return buildEvent(message, CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE).build();
    }

    private static CloudEvent.Builder buildEvent(Message message, String type) {
        Builder builder = CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(type)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build());
        if (message.getHeader("sdReferenceId") != null) {
            builder.putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                    .setCeString(message.getHeader("sdReferenceId", String.class))
                    .build());
        }
        if (message.getHeader("crReferenceId") != null) {
            builder.putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue.newBuilder()
                    .setCeString(message.getHeader("crReferenceId", String.class))
                    .build());
        }
        if (message.getHeader("bqReferenceId") != null) {
            builder.putAttributes(BianCloudEvent.CE_BQ_REF, CloudEventAttributeValue.newBuilder()
                    .setCeString(message.getHeader("bqReferenceId", String.class))
                    .build());
        }
        return builder;
    }

}
