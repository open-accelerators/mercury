package com.redhat.mercury.myprp.services.impl;

import java.util.Collection;
import java.util.HashSet;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myprp.model.PartyRoutingState;

@ApplicationScoped
public class PartyRoutingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingService.class);
    private static final Collection<String> activeStatuses = new HashSet<>();
    
    public Collection<String> getAll() {
        return activeStatuses;
    }

    public PartyRoutingState getState(String referenceId) {
        if (activeStatuses.contains(referenceId)) {
            return new PartyRoutingState().setReferenceId(referenceId).setStatus(ControlRecordState.PROCESSING);
        }
        return null;
    }

    public void updatePartyRoutingState(String referenceId, String status) {
        LOGGER.info("Updating PartyRoutingState ProcessId: {} - Status: {}", referenceId, status);
        if (ControlRecordState.PROCESSING.equals(status)) {
            activeStatuses.add(referenceId);
        } else {
            activeStatuses.remove(referenceId);
        }
    }

}
