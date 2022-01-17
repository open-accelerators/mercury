package com.redhat.mercury.partyroutingprofile.services;

import java.util.Collection;

import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;
import com.redhat.mercury.partyroutingprofile.model.SDPartyRoutingProfileRetrieveOutputModel;

import io.smallrye.mutiny.Uni;

public interface PartyRoutingProfileService extends PartyRoutingProfileApi {

    default Uni<BQStatusRetrieveOutputModel> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().nullItem();
    }

    default Uni<Collection<String>> retrievePartyRoutingProfileReferenceIds(String sdRef) {
        return Uni.createFrom().nullItem();
    }
}
