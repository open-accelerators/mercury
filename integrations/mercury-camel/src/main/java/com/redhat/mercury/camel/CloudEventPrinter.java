package com.redhat.mercury.camel;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import io.cloudevents.v1.proto.CloudEvent;

public class CloudEventPrinter {

    private final JsonFormat.TypeRegistry typeRegistry;

    public CloudEventPrinter(JsonFormat.TypeRegistry typeRegistry) {
        this.typeRegistry = typeRegistry;
    }

    public String toString(CloudEvent event) throws InvalidProtocolBufferException {
        if (event == null) {
            return null;
        }
        return JsonFormat.printer()
                .usingTypeRegistry(typeRegistry)
                .print(event.getProtoData());
    }
}
