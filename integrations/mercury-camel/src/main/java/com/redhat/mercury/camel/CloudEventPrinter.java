package com.redhat.mercury.camel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import io.cloudevents.v1.proto.CloudEvent;

public abstract class CloudEventPrinter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CloudEventPrinter.class);

    public abstract String toJson(CloudEvent event) throws InvalidProtocolBufferException;

    protected String print(CloudEvent event, Class<? extends Message> clazz) throws InvalidProtocolBufferException {
        if (event.getProtoData().getSerializedSize() == 0) {
            return null;
        }
        if (event.getProtoData().is(clazz)) {
            return JsonFormat.printer()
                    .print(event.getProtoData().unpack(clazz));
        }
        LOGGER.error("Unable to deserialize proto data. Expected: {}", clazz.getName());
        throw new IllegalStateException("Unable to deserialize proto data. Expected: " + clazz.getName());
    }
}
