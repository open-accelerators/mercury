package com.redhat.mercury.customeroffer.services;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureUpdateInputModel;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferApi {

    Uni<Empty> initiateCustomerOfferProcedure(CRCustomerOfferProcedureInitiateInputModel procedure);

    Uni<Empty> updateCustomerOfferProcedure(CRCustomerOfferProcedureUpdateInputModel update);

    Uni<SDCustomerOfferRetrieveOutputModel> retrieveSDCustomerOffer(String sdRefId);

    Uni<CRCustomerOfferProcedureRetrieveOutputModel> retrieveCustomerOffer(String sdRefId, String crRefId);

    //TODO: Implement other queries and commands
}
