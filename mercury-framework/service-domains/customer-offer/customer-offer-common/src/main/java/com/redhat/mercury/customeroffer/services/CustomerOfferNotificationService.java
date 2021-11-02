package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferNotificationService {

    public Uni<Message> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        return noOpReply();
    }

    public Uni<Message> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        return noOpReply();
    }

    private Uni<Message> noOpReply() {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other events
}
