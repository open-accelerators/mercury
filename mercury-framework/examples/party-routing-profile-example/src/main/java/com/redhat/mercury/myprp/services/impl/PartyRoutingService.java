package com.redhat.mercury.myprp.services.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.partyroutingprofile.PartyRoutingState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class PartyRoutingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingService.class);
    private static final Map<String, Set<PartyRoutingState>> partyRoutings = new ConcurrentHashMap<>();

    public static final String INITIATED_STATUS = "0";
    public static final String COMPLETED_STATUS = "1";

    public Set<PartyRoutingState> getState(String id) {
        return partyRoutings.getOrDefault(id, Set.of());
    }

    public void updatePartyRoutingState(String status, String processId) {
        Set<PartyRoutingState> states = partyRoutings.computeIfAbsent(processId, k -> new HashSet<>());
        states.removeIf(e -> processId.equals(e.getProcessId()));
        states.add(PartyRoutingState.newBuilder().setCustomerOfferStatus(status)
                .setProcessId(COMPLETED_STATUS.equals(status) ? null : processId).build());
    }

}
