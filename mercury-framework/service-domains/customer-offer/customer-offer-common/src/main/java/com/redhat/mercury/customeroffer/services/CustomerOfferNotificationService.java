package com.redhat.mercury.customeroffer.services;

import com.google.protobuf.Empty;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferNotificationService {

    default Uni<Empty> onCustomerOfferInitiated(String referenceId) {
        return noOpReply();
    }

    default Uni<Empty> onCustomerOfferCompleted(String referenceId) {
        return noOpReply();
    }

    private Uni<Empty> noOpReply() {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other events
}
