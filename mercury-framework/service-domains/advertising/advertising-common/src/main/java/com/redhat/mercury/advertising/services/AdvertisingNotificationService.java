package com.redhat.mercury.advertising.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class AdvertisingNotificationService {

    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }

    //TODO: Implement events
}
