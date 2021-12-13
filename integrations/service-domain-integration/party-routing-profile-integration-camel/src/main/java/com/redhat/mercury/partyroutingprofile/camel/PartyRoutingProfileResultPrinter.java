package com.redhat.mercury.partyroutingprofile.camel;

import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.camel.CloudEventPrinter;
import com.redhat.mercury.partyroutingprofile.PartyRoutingProfile;

import io.cloudevents.v1.proto.CloudEvent;

public class PartyRoutingProfileResultPrinter extends CloudEventPrinter {

    @Override
    public String toJson(CloudEvent event) throws InvalidProtocolBufferException {
        switch(event.getType()) {
            case PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE:
                return print(event, PartyRoutingStateList.class);
        }
        return null;
    }

}
