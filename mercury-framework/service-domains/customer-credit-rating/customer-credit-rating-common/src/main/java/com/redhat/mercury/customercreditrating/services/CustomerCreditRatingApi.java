package com.redhat.mercury.customercreditrating.services;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingApi {

    Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr);

    //TODO: Add other queries and commands
}
