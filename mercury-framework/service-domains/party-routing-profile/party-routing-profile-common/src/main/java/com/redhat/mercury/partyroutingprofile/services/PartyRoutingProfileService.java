package com.redhat.mercury.partyroutingprofile.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class PartyRoutingProfileService {

    public Uni<Message> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().nullItem();
    }

}
