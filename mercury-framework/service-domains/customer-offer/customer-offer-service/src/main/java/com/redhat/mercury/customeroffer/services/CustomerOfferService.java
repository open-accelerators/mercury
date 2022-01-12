package com.redhat.mercury.customeroffer.services;

import java.util.Collection;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureUpdateInputModel;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface CustomerOfferService extends CustomerOfferApi {

    default Uni<Empty> initiateCustomerOfferProcedure(CRCustomerOfferProcedureInitiateInputModel procedure) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Empty> updateCustomerOfferProcedure(CRCustomerOfferProcedureUpdateInputModel update) {
        return Uni.createFrom().nullItem();
    }

    default Uni<SDCustomerOfferRetrieveOutputModel> retrieveSDCustomerOffer(String sdRefId) {
        return Uni.createFrom().nullItem();
    }

    default Uni<CRCustomerOfferProcedureRetrieveOutputModel> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Collection<String>> retrieveCustomerOfferReferenceIds(String sdRefId) {
        return Uni.createFrom().nullItem();
    }

    //TODO: Implement other queries and commands
}
