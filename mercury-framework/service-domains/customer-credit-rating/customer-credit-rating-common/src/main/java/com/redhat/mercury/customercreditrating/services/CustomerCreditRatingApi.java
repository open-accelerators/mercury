package com.redhat.mercury.customercreditrating.services;

import com.redhat.mercury.customercreditrating.model.CRCustomerCreditRatingStateRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingApi {

    Uni<CRCustomerCreditRatingStateRetrieveOutputModel> retrieveCustomerCreditRating(String sd, String cr);

    //TODO: Add other queries and commands
}
