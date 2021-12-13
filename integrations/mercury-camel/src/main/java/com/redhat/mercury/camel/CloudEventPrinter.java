package com.redhat.mercury.camel;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import io.cloudevents.v1.proto.CloudEvent;

public abstract class CloudEventPrinter {

    public abstract String toJson(CloudEvent event) throws InvalidProtocolBufferException;

    protected String print(CloudEvent event, Class<? extends Message> clazz) throws InvalidProtocolBufferException {
        return JsonFormat.printer()
            .print(event.getProtoData().unpack(clazz));
    }

}
