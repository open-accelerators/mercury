package com.redhat.mercury.partyroutingprofile.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface PartyRoutingProfileService extends PartyRoutingProfileApi {

    default Uni<Message> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().nullItem();
    }
    default Uni<Message> retrievePartyStateStatuses() {
        return Uni.createFrom().nullItem();
    }
}
