package com.redhat.mercury.customeroffer.services.impl;

import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

public abstract class NoOpCustomerOfferService implements CustomerOfferService {

    public Uni<Empty> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure) {
        return Uni.createFrom().nullItem();
    }

    public Uni<Empty> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return Uni.createFrom().nullItem();
    }

    public Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    //TODO: Implement other queries and commands
}
