package com.redhat.mercury.partyroutingprofile.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface PartyRoutingProfileApi {

    Uni<Message> retrievePartyStateStatus(String sdRef, String crRef, String bqRef);
    Uni<Message> retrievePartyStateStatuses();
}
