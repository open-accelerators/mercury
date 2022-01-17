package com.redhat.mercury.partyroutingprofile.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.exceptions.MappingNotFoundException;
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
public class PartyRoutingProfileBindingServiceImpl extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileBindingServiceImpl.class);

    @Inject
    PartyRoutingProfileService service;

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

    protected Uni<? extends Object> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE:
                return service.retrievePartyStateStatus(getRef(cloudEvent, CE_SD_REF), getRef(cloudEvent, CE_CR_REF), getRef(cloudEvent, CE_BQ_REF));
            case PartyRoutingProfile.PARTY_REFERENCE_IDS_RETRIEVE_TYPE:
                return service.retrievePartyRoutingProfileReferenceIds(getRef(cloudEvent, CE_SD_REF));
            //TODO: Add more mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    @Override
    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

}
