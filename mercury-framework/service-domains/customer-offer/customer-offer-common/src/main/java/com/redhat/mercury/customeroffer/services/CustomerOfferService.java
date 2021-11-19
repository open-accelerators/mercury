package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferService {

    Uni<Empty> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure);

    Uni<Empty> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update);

    Uni<Message> retrieveSDCustomerOffer(String sdRefId);

    Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId);

    //TODO: Implement other queries and commands
}
