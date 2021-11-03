package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.SDCustomerOffer;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferService {

    public Uni<Message> initiateCustomerOfferProcedure(CustomerOfferProcedure procedure) {
        return Uni.createFrom().item(() -> null);
    }

    public Uni<Message> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return Uni.createFrom().item(() -> null);
    }

    public Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    //TODO: Implement other queries and commands
}
