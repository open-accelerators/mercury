package com.redhat.mercury.customercreditrating.services;

import com.redhat.mercury.customercreditrating.model.RetrieveCustomerCreditRatingStateResponse;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingService extends CustomerCreditRatingApi {

    default Uni<RetrieveCustomerCreditRatingStateResponse> retrieve(String cr) {
        return Uni.createFrom().nullItem();
    }
}
