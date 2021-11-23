package ${package}.camel;

import org.apache.camel.builder.RouteBuilder;

import com.redhat.mercury.utils.CloudEventUtils;

public class ${sdName}DirectRoute extends RouteBuilder {

    @Override
    public void configure() {
//        from("direct:initiateCustomerOfferProcedure")
//                .bean(new CustomerOfferTransformer(), "initiateCustomerOfferProcedure")
//                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=command");

//        from("direct:retrieveSDCustomerOffer")
//                .bean(new CustomerOfferTransformer(), "retrieveSDCustomerOffer")
//                .to("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService?synchronous=true&method=query")
//                .bean(CloudEventUtils.class, "toString");

    }
}
