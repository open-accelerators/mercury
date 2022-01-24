package com.redhat.mercury.customeroffer.services;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.model.InitiateCustomerOfferProcedureRequest;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferApi {

    Uni<Empty> initiate(InitiateCustomerOfferProcedureRequest procedure);

    Uni<Empty> update(CustomerOfferProcedure update);

    Uni<CustomerOfferProcedure> retrieve(String crRefId);

    //TODO: Implement other queries and commands
}
