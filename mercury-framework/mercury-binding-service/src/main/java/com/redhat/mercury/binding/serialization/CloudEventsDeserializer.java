package com.redhat.mercury.binding.serialization;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;

import io.cloudevents.v1.proto.CloudEvent;

public class CloudEventsDeserializer implements Deserializer<CloudEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CloudEventsDeserializer.class);

    @Override
    public CloudEvent deserialize(String topic, byte[] bytes) {
        try {
            return CloudEvent.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            LOGGER.error("Unable to parse from byte[] to CloudEvent", e);
            throw new SerializationException("Unable to parse from byte[] to CloudEvent");
        }
    }
}
