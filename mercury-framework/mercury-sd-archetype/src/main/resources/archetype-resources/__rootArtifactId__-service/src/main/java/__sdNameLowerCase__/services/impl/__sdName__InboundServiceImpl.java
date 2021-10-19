package com.redhat.mercury.${sdNameLowerCase}.services.impl;

import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.google.protobuf.Message.Builder;
import com.redhat.mercury.common.services.impl.BaseInboundService;
import com.redhat.mercury.${sdNameLowerCase}.services.${sdName}Service;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.${sdNameLowerCase}.${sdName}.DOMAIN_NAME;

@GrpcService
public class ${sdName}InboundServiceImpl extends BaseInboundService {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}InboundServiceImpl.class);

    //TODO: Add Patterns for REST endpoints

    private static final Map<Pattern, String> QUERY_PATH_MAPPINGS = Map.of(
            //TODO: Implement
    );
    private static final Map<Pattern, String> COMMAND_PATH_MAPPINGS = Map.of(
            //TODO: Implement
    );
    private static final Map<String, Supplier<Message.Builder>> IN_TYPE_MAPPINGS = Map.of(
            //TODO: Add mappings
    );

    @Inject
    ${sdName}Service service;

    protected Uni<? extends Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return null;
    }

    protected Uni<Void> mapCommandMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return null;
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

    @Override
    protected Map<String, Supplier<Builder>> getInTypeMappings() {
        return IN_TYPE_MAPPINGS;
    }

    @Override
    protected Map<Pattern, String> getQueryPathMappings() {
        return QUERY_PATH_MAPPINGS;
    }

    @Override
    protected Map<Pattern, String> getCommandPathMappings() {
        return COMMAND_PATH_MAPPINGS;
    }
}
