package com.redhat.mercury.partyroutingprofile.services;

import java.util.Collection;

import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface PartyRoutingProfileApi {

    Uni<BQStatusRetrieveOutputModel> retrievePartyStateStatus(String sdRef, String crRef, String bqRef);

    Uni<Collection<String>> retrieveCustomerProfileReferenceIds(String sdRef);
}
