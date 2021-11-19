package com.redhat.mercury.utils;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import io.cloudevents.v1.proto.CloudEvent;

public class CloudEventUtils {

    public static String toString(CloudEvent event) throws InvalidProtocolBufferException {
        if (event == null || event.getProtoData() == null) {
            return null;
        }
        return JsonFormat.printer().print(event.getProtoData());
    }
}
