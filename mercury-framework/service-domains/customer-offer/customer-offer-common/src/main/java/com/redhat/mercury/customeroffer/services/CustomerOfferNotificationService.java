package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.google.protobuf.Empty;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferNotificationService {

    public Uni<Empty> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        return noOpReply();
    }

    public Uni<Empty> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        return noOpReply();
    }

    private Uni<Empty> noOpReply() {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other events
}
