package com.redhat.mercury.accountrecovery.services;

import io.smallrye.mutiny.Uni;

public abstract class AccountRecoveryNotificationService {

    private Uni<Void> noOpReply() {
        return Uni.createFrom()
                .voidItem();
    }

    //TODO: Implement events
}
