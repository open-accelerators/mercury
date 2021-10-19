package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;

import io.smallrye.mutiny.Uni;

public abstract class CustomerOfferService {

    public abstract Uni<Void> initiateCustomerOfferProcedure(CustomerOfferProcedure procedure);

    public abstract Uni<Void> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update);

    //TODO: Implement other queries and commands
}
