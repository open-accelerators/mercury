package com.redhat.mercury.myprp.services.impl;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.myprp.model.PartyRoutingState;
import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;
import com.redhat.mercury.partyroutingprofile.model.PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyPRPServiceImpl implements PartyRoutingProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyPRPServiceImpl.class);

    @Inject
    PartyRoutingService svc;

    @Override
    public Uni<Collection<String>> retrievePartyRoutingProfileReferenceIds(String sdRef) {
        return Uni.createFrom().item(() -> svc.getAll());
    }

    @Override
    public Uni<BQStatusRetrieveOutputModel> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        return Uni.createFrom().item(() -> {
            LOGGER.info("Retrieving party state status for {}/{}/{}", sdRef, crRef, bqRef);
            if (crRef != null) {
                PartyRoutingState state = svc.getState(crRef);
                if (state == null) {
                    return null;
                }
                BQStatusRetrieveOutputModel output = new BQStatusRetrieveOutputModel();
                output.setStatusRetrieveActionTaskReference(state.getProcessId());
                PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord record = new PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord();
                record.setCustomerRelationshipStatus(state.getStatus());
                output.setStatusInstanceRecord(record);
                return output;
            }
            return null;
        });
    }

}
