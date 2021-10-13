package com.redhat.mercury.myprp.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.inject.Inject;

import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyPRPServiceImpl extends PartyRoutingProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyPRPServiceImpl.class);

    @Inject
    PartyRoutingService svc;

    @Override
    public Uni<PartyRoutingStateList> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().item(() -> {
            LOGGER.debug("Retrieving party state status for {}/{}/{}", sdRef, crRef, bqRef);
            PartyRoutingStateList.Builder resultBuilder = PartyRoutingStateList.newBuilder();
            if (crRef != null) {
                resultBuilder.addAllPartyRoutingStates(svc.getState(crRef));
            }
            return resultBuilder.build();
        });
    }

}
