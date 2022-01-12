package com.redhat.mercury.camel;

import io.cloudevents.v1.proto.CloudEvent;

public class CloudEventPrinter {

    public static String print(CloudEvent event) {
        return event.getBinaryData().toStringUtf8();
    }
}
