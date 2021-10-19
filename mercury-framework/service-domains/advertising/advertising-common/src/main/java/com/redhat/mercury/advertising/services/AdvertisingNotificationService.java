package com.redhat.mercury.advertising.services;

import io.smallrye.mutiny.Uni;

public abstract class AdvertisingNotificationService {

    private Uni<Void> noOpReply() {
        return Uni.createFrom()
                .voidItem();
    }

    //TODO: Implement events
}
