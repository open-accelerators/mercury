package com.redhat.mercury.partyroutingprofile.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class PartyRoutingProfileNotificationService {

    //TODO: Add PartyRoutingProfile event handler methods
    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }
}
