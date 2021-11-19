package com.redhat.mercury.customercreditrating.services;

import org.bian.protobuf.customercreditrating.Rating;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingService {

    Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr);

    //TODO: Add other queries and commands
}
