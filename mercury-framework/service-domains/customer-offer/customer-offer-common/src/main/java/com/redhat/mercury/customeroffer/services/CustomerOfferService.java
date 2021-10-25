package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.SDCustomerOffer;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferService {

    public Uni<Void> initiateCustomerOfferProcedure(CustomerOfferProcedure procedure) {
        return Uni.createFrom().voidItem();
    }

    public Uni<Void> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return Uni.createFrom().voidItem();
    }

    public Uni<SDCustomerOffer> retrieveSDCustomerOffer(String sdRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(SDCustomerOffer.class);
    }

    //TODO: Implement other queries and commands
}
