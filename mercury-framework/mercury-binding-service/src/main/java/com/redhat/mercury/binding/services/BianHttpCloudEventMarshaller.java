package com.redhat.mercury.binding.services;

import org.apache.camel.Exchange;
import org.bian.protobuf.ExternalRequest;
import org.bian.protobuf.ExternalResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class BianHttpCloudEventMarshaller {

    private static final Logger LOGGER = LoggerFactory.getLogger(BianHttpCloudEventMarshaller.class);

    public ExternalRequest toExternalRequest(Exchange exchange) {
        ExternalRequest.Builder reqBuilder = ExternalRequest.newBuilder()
                .setPath(exchange.getMessage().getHeader(Exchange.HTTP_URI, String.class))
                .setVerb(exchange.getMessage().getHeader(Exchange.HTTP_METHOD, String.class));
        if (exchange.getMessage().getBody() != null) {
            reqBuilder.setPayload(ByteString.copyFrom(exchange.getMessage(String.class).getBytes()));
        }
        return reqBuilder.build();
    }

    public void toHttp(Exchange exchange, ExternalResponse response) {
        exchange.getMessage().setHeader(Exchange.HTTP_RESPONSE_CODE, response.getResponseCode());
        if (response.getPayload() != null && !response.getPayload().isEmpty()) {
            exchange.getMessage().setBody(response.getPayload().toStringUtf8());
        }
    }


}
