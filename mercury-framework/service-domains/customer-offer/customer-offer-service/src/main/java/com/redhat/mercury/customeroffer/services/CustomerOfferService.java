package com.redhat.mercury.customeroffer.services;

import java.util.Collection;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.model.CustomerOfferProcedure;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferService extends CustomerOfferApi {

    default Uni<Empty> initiate(InitiateCustomerOfferProcedureRequest procedure) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Empty> update(CustomerOfferProcedure update) {
        return Uni.createFrom().nullItem();
    }

    default Uni<CustomerOfferProcedure> retrieve(String crRefId) {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other queries and commands
}
