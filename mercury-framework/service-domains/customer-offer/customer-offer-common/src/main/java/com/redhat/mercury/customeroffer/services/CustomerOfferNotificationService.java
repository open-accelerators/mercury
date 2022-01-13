package com.redhat.mercury.customeroffer.services;

import com.google.protobuf.Empty;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferNotificationService {

    public Uni<Empty> onCustomerOfferInitiated(String referenceId) {
        return noOpReply();
    }

    public Uni<Empty> onCustomerOfferCompleted(String referenceId) {
        return noOpReply();
    }

    private Uni<Empty> noOpReply() {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other events
}
