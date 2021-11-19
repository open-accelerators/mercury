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
        from("grpc://{{mercury.binding.service.host}}:{{mercury.binding.service.port}}/org.bian.protobuf.BindingService")
                .recipientList(method(configSvc, "getBusinessBindingEndpoint"));
    }

}
