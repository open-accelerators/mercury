package com.redhat.mercury.partyroutingprofile.camel;

import java.util.UUID;

import org.apache.camel.Message;

import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.partyroutingprofile.PartyRoutingProfile;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;

public class PartyRoutingProfileTransformer {

    private static final String EXTERNAL_SOURCE = "external";

    public static CloudEvent retrievePartyStateStatus(Message message) {
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(PartyRoutingProfile.DOMAIN_NAME)
                        .build())
                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("sdReferenceId", String.class))
                        .build())
                .putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("crReferenceId", String.class))
                        .build())
                .putAttributes(BianCloudEvent.CE_BQ_REF, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader("bqReferenceId", String.class))
                        .build())
                .build();
    }
    public static CloudEvent retrievePartyStateStatuses(Message message) {
        return CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(PartyRoutingProfile.PARTY_STATE_ALL_RETRIEVE_TYPE)
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(PartyRoutingProfile.DOMAIN_NAME)
                        .build())

                .build();
    }
}
