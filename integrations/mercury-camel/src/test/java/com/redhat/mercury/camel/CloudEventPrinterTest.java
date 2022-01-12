package com.redhat.mercury.camel;

import org.junit.jupiter.api.Test;

import com.google.protobuf.ByteString;

import io.cloudevents.v1.proto.CloudEvent;

import static org.assertj.core.api.Assertions.assertThat;

class CloudEventPrinterTest {

    @Test
    void testPrint() {
        String payload = "{ \"customerOfferProcedureInstanceRecord\" : { \"customerReference\" : \"foo\" } }";
        CloudEvent event = CloudEvent.newBuilder().setBinaryData(ByteString.copyFromUtf8(payload)).build();
        String result = CloudEventPrinter.print(event);
        assertThat(result).isEqualTo(payload);
    }

    @Test
    void testPrintEmpty() {
        CloudEvent event = CloudEvent.newBuilder().build();
        String result = CloudEventPrinter.print(event);
        assertThat(result).isBlank();
    }
}
