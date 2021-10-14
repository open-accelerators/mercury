package com.redhat.mercury.binding.routes;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.camel.builder.RouteBuilder;

import com.redhat.mercury.binding.services.ConfigurationService;

@ApplicationScoped
public class BindingRoutes extends RouteBuilder {

    @Inject
    ConfigurationService configSvc;

    @Override
    public void configure() {

        from("grpc://{{route.grpc.outboundBindingService}}/org.bian.protobuf.OutboundBindingService")
                .log("routing from outboundBinding")
                .recipientList(method(configSvc, "getBinding"));

        from("grpc://{{route.grpc.internalBindingService}}/org.bian.protobuf.InternalBindingService")
                .to("grpc://{{route.grpc.hostService}}/org.bian.protobuf.InboundBindingService?method=" + simple("query"));
    }

}
