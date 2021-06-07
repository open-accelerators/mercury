package com.redhat.mercury.common.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public final class BaseRouteBuilder extends RouteBuilder {
    
    public void configure() {
        restConfiguration().bindingMode(RestBindingMode.json);
    }
}
