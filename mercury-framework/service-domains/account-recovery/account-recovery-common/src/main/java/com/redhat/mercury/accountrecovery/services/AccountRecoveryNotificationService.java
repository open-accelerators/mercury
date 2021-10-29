package com.redhat.mercury.accountrecovery.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class AccountRecoveryNotificationService {

    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }

    //TODO: Implement events
}
