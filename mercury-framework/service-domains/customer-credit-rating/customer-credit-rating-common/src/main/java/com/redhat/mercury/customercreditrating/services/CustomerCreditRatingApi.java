package com.redhat.mercury.customercreditrating.services;

import com.redhat.mercury.customercreditrating.model.RetrieveCustomerCreditRatingStateResponse;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingApi {

    Uni<RetrieveCustomerCreditRatingStateResponse> retrieve(String cr);

    //TODO: Add other queries and commands
}
