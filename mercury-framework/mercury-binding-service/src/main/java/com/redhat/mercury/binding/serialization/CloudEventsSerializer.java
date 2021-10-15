package com.redhat.mercury.binding.serialization;

import org.apache.kafka.common.serialization.Serializer;

import io.cloudevents.v1.proto.CloudEvent;

public class CloudEventsSerializer implements Serializer<CloudEvent> {

    @Override
    public byte[] serialize(String topic, CloudEvent cloudEvent) {
        return cloudEvent.toByteArray();
    }
}
