package com.redhat.mercury.${sdNameLowerCase}.services;

import io.smallrye.mutiny.Uni;

public abstract class ${sdName}NotificationService {

    private Uni<Void> noOpReply() {
        return Uni.createFrom()
                .voidItem();
    }

    //TODO: Implement events
}
