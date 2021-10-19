package com.redhat.mercury.partyroutingprofile.services;

import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;

import io.smallrye.mutiny.Uni;

public abstract class PartyRoutingProfileService {

    public Uni<PartyRoutingStateList> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().nullItem();
    }

}
