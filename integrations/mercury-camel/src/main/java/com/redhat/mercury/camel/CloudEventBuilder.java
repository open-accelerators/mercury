package com.redhat.mercury.camel;

import java.util.UUID;

import org.apache.camel.Message;

import com.google.protobuf.ByteString;
import com.redhat.mercury.constants.BianCloudEvent;

import io.cloudevents.SpecVersion;
import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;

public class CloudEventBuilder {

    private static final String EXTERNAL_SOURCE = "external";

    private static final String CR_REFERENCE_ID = "crReferenceId";
    private static final String BQ_REFERENCE_ID = "bqReferenceId";
    private static final String CLOUD_EVENT_TYPE = "cloudEventType";
    private static final String SERVICE_DOMAIN_NAME = "serviceDomainName";

    public static CloudEvent build(Message message) {
        Builder builder = CloudEvent.newBuilder()
                .setSpecVersion(SpecVersion.V1.toString())
                .setId(UUID.randomUUID().toString())
                .setSource(EXTERNAL_SOURCE)
                .setType(message.getHeader(CLOUD_EVENT_TYPE, String.class))
                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
                        .setCeString(message.getHeader(SERVICE_DOMAIN_NAME, String.class))
                        .build());
        if (message.getHeader(CR_REFERENCE_ID) != null) {
            builder.putAttributes(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue.newBuilder()
                    .setCeString(message.getHeader(CR_REFERENCE_ID, String.class))
                    .build());
        }
        if (message.getHeader(BQ_REFERENCE_ID) != null) {
            builder.putAttributes(BianCloudEvent.CE_BQ_REF, CloudEventAttributeValue.newBuilder()
                    .setCeString(message.getHeader(BQ_REFERENCE_ID, String.class))
                    .build());
        }
        if (message.getBody(String.class) != null) {
            builder.setBinaryData(ByteString.copyFromUtf8(message.getBody(String.class)));
        }
        return builder.build();
    }
}
