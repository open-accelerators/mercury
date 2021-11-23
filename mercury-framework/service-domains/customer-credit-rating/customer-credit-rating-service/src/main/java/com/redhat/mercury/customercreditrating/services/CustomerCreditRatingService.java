package com.redhat.mercury.customercreditrating.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingService {

    default Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr) {
        return Uni.createFrom().nullItem();
    }
}
