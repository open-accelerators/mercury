package com.redhat.mercury.partyroutingprofile.camel;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;

import com.google.protobuf.util.JsonFormat.TypeRegistry;
import com.redhat.mercury.camel.CloudEventPrinter;

import io.quarkus.runtime.annotations.RegisterForReflection;

//TODO: Try to use CloudEventPrinter only
@ApplicationScoped
@RegisterForReflection
public class PartyRoutingProfileResultPrinter extends CloudEventPrinter {

    private static final TypeRegistry TYPE_REGISTRY = TypeRegistry.newBuilder()
            .add(PartyRoutingStateList.getDescriptor())
            .build();

    public PartyRoutingProfileResultPrinter() {
        super(TYPE_REGISTRY);
    }

}
