package com.redhat.mercury.customercreditrating.services;

import org.bian.protobuf.customercreditrating.Rating;

import io.smallrye.mutiny.Uni;

public abstract class CustomerCreditRatingService {

    public Uni<Rating> retrieveCustomerCreditRatingState(String sd, String cr) {
        // No-op
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other queries and commands
}
