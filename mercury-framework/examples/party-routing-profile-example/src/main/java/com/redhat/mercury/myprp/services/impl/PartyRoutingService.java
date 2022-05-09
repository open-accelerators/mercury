package com.redhat.mercury.myprp.services.impl;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.myprp.model.PartyRoutingState;

@ApplicationScoped
public class PartyRoutingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingService.class);
    private static final Map<String, PartyRoutingState> partyRoutings = new ConcurrentHashMap<>();

    public static final String INITIATED_STATUS = "0";
    public static final String COMPLETED_STATUS = "1";

    public Collection<String> getAll() {
        return partyRoutings.keySet();
    }

    public PartyRoutingState getState(String id) {
        return partyRoutings.getOrDefault(id, null);
    }

    public void updatePartyRoutingState(String status, String processId) {
        LOGGER.info("Updating PartyRoutingState ProcessId: {} - Status: {}", processId, status);
        PartyRoutingState currentState = partyRoutings.get(processId);
        if (currentState == null || (COMPLETED_STATUS.equals(status) && INITIATED_STATUS.equals(currentState.getStatus()))) {
            partyRoutings.put(processId, new PartyRoutingState().setProcessId(processId).setStatus(status));
        }
    }

}
