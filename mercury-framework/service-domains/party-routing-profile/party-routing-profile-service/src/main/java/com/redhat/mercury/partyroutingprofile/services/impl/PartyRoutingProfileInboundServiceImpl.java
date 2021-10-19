package com.redhat.mercury.partyroutingprofile.services.impl;

import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.google.protobuf.Message.Builder;
import com.redhat.mercury.common.services.impl.BaseInboundService;
import com.redhat.mercury.partyroutingprofile.PartyRoutingProfile;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.DOMAIN_NAME;

@GrpcService
public class PartyRoutingProfileInboundServiceImpl extends BaseInboundService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileInboundServiceImpl.class);

    private static final Pattern PARTY_ROUTING_PROFILE_PARTY_STATE_STATUS_RETRIEVE_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/party-state/([a-zA-Z0-9\\-]+)/status/([a-zA-Z0-9\\-]+)");

    private static final Map<Pattern, String> QUERY_PATH_MAPPINGS = Map.of(
            PARTY_ROUTING_PROFILE_PARTY_STATE_STATUS_RETRIEVE_PATH, PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE
    );
    private static final Map<Pattern, String> COMMAND_PATH_MAPPINGS = Map.of(
            //TODO: Implement
    );
    private static final Map<String, Supplier<Message.Builder>> IN_TYPE_MAPPINGS = Map.of(
            //TODO: Add mappings
    );

    @Inject
    PartyRoutingProfileService service;

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

    protected Uni<? extends Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE:
                return service.retrievePartyStateStatus(getRef(cloudEvent, CE_SD_REF), getRef(cloudEvent, CE_CR_REF), getRef(cloudEvent, CE_BQ_REF));
            //TODO: Add more mappings
        }
        return null;
    }

    @Override
    protected Uni<Void> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return null;
    }

    @Override
    protected Map<Pattern, String> getQueryPathMappings() {
        return QUERY_PATH_MAPPINGS;
    }

    @Override
    protected Map<Pattern, String> getCommandPathMappings() {
        return COMMAND_PATH_MAPPINGS;
    }

    @Override
    protected Map<String, Supplier<Builder>> getInTypeMappings() {
        return IN_TYPE_MAPPINGS;
    }

}
