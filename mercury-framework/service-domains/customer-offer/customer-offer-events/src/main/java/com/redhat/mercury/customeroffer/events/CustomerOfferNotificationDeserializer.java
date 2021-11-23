package com.redhat.mercury.customeroffer.events;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.exceptions.DataTransformationException;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CustomerOfferNotificationDeserializer extends ObjectMapperDeserializer<CustomerOfferNotification> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferNotificationDeserializer.class);

    public CustomerOfferNotificationDeserializer() {
        super(CustomerOfferNotification.class);
    }

    @Override
    public CustomerOfferNotification deserialize(String topic, byte[] data) {
        try {
            return CustomerOfferNotification.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            LOGGER.error("Unable to deserialize CustomerOfferNotification event", e);
            throw new DataTransformationException(e);
        }
    }
}

