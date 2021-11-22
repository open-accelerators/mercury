package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferService extends CustomerOfferApi {

    default Uni<Empty> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Empty> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    default Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return Uni.createFrom().nullItem().onItem().castTo(Message.class);
    }

    //TODO: Implement other queries and commands
}
