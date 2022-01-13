package com.redhat.mercury.partyroutingprofile.reflection;

import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;
import com.redhat.mercury.partyroutingprofile.model.PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {
        BQStatusRetrieveOutputModel.class,
        PartyroutingprofilesdReferenceIdpartystatecrReferenceIdstatusbqReferenceIdupdateStatusInstanceRecord.class
})
public class PartyRoutingProfileReflectionConfiguration {
}
