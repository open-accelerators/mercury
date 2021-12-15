package com.redhat.mercury.myprp.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.partyroutingprofile.PartyRoutingState;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyPRPServiceImpl implements PartyRoutingProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyPRPServiceImpl.class);

    @Inject
    PartyRoutingService svc;

    @Override
    public Uni<Message> retrievePartyStateStatuses() {
        return Uni.createFrom().item(() -> svc.getAll());
    }

    @Override
    public Uni<Message> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().item(() -> {
            LOGGER.info("Retrieving party state status for {}/{}/{}", sdRef, crRef, bqRef);
            if (crRef != null) {
                PartyRoutingState state = svc.getState(crRef);
                if (state != null) {
                    return state;
                }
            }
            return Empty.getDefaultInstance();
        });
    }

}
