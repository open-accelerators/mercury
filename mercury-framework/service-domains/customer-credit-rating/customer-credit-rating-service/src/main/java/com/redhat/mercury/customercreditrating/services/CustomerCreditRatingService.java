package com.redhat.mercury.customercreditrating.services;

import com.redhat.mercury.customercreditrating.model.CRCustomerCreditRatingStateRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingService extends CustomerCreditRatingApi {

    default Uni<CRCustomerCreditRatingStateRetrieveOutputModel> retrieveCustomerCreditRating(String sd, String cr) {
        return Uni.createFrom().nullItem();
    }
}
