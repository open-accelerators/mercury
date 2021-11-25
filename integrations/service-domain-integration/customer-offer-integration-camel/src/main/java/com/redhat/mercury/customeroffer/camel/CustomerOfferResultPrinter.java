package com.redhat.mercury.customeroffer.camel;

import javax.enterprise.context.ApplicationScoped;

import com.google.protobuf.util.JsonFormat.TypeRegistry;
import com.redhat.mercury.camel.CloudEventPrinter;

import io.quarkus.runtime.annotations.RegisterForReflection;

@ApplicationScoped
@RegisterForReflection
public class CustomerOfferResultPrinter extends CloudEventPrinter {

    private static final TypeRegistry TYPE_REGISTRY = TypeRegistry.newBuilder().build();

    public CustomerOfferResultPrinter() {
        super(TYPE_REGISTRY);
    }

}
