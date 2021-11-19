package com.redhat.mercury.customercreditrating.services.impl;

import com.google.protobuf.Message;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.smallrye.mutiny.Uni;

public abstract class NoOpCustomerCreditRatingService implements CustomerCreditRatingService {

    @Override
    public Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr) {
        return Uni.createFrom().nullItem();
    }
}
