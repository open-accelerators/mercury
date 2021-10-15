package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferNotificationService {

    public Uni<Void> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        return noOpReply();
    }

    public Uni<Void> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        return noOpReply();
    }

    private Uni<Void> noOpReply() {
        return Uni.createFrom()
                .voidItem();
    }

    //TODO: Implement other events
}
