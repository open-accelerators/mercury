package com.redhat.mercury.common.events;

import org.apache.kafka.common.header.Headers;

import com.google.protobuf.Message;

import io.quarkus.kafka.client.serialization.ObjectMapperSerializer;

public class MessageSerializer extends ObjectMapperSerializer<Message> {

    @Override
    public byte[] serialize(String topic, Headers headers, Message data) {
        return data.toByteArray();
    }
}