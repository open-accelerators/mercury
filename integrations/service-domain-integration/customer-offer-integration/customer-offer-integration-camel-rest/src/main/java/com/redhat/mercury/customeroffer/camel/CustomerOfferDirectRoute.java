package com.redhat.mercury.customeroffer.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.http.HttpStatus;

import com.redhat.mercury.utils.CloudEventUtils;

public class CustomerOfferDirectRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("direct:initiateCustomerOfferProcedure")
                .bean(CustomerOfferTransformer.class, "initiateCustomerOfferProcedure")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=command")
                .setBody(simple(""))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(HttpStatus.SC_ACCEPTED));

        from("direct:updateCustomerOfferProcedure")
                .bean(CustomerOfferTransformer.class, "updateCustomerOfferProcedure")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=command")
                .setBody(simple(""))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(HttpStatus.SC_ACCEPTED));

        from("direct:retrieveSDCustomerOffer")
                .bean(CustomerOfferTransformer.class, "retrieveSDCustomerOffer")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=query")
                .bean(CloudEventUtils.class, "toString");

        from("direct:retrieveCustomerOffer")
                .bean(CustomerOfferTransformer.class, "retrieveCustomerOffer")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=query")
                .bean(CloudEventUtils.class, "toString");
    }
}
