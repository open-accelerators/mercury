package com.redhat.mercury.customeroffer.camel;

import org.apache.camel.builder.RouteBuilder;

import com.redhat.mercury.utils.CloudEventUtils;

public class CustomerOfferDirectRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("direct:initiateCustomerOfferProcedure")
                .bean(new CustomerOfferTransformer(), "initiateCustomerOfferProcedure")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=command");

        from("direct:updateCustomerOfferProcedure")
                .bean(new CustomerOfferTransformer(), "updateCustomerOfferProcedure")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=command");

        from("direct:retrieveSDCustomerOffer")
                .bean(new CustomerOfferTransformer(), "retrieveSDCustomerOffer")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=query")
                .bean(CloudEventUtils.class, "toString");

        from("direct:retrieveCustomerOffer")
                .bean(new CustomerOfferTransformer(), "retrieveCustomerOffer")
                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=query")
                .bean(CloudEventUtils.class, "toString");
    }
}
