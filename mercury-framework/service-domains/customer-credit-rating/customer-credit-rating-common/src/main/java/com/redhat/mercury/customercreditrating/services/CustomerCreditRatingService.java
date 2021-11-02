package com.redhat.mercury.customercreditrating.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class CustomerCreditRatingService {

    public Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr) {
        // No-op
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other queries and commands
}
