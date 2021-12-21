package com.redhat.mercury.myprp.services.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.partyroutingprofile.PartyRoutingState;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class PartyRoutingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingService.class);
    private static final Map<String, PartyRoutingState> partyRoutings = new ConcurrentHashMap<>();

    public static final String INITIATED_STATUS = "0";
    public static final String COMPLETED_STATUS = "1";

    public PartyRoutingStateList getAll() {
        return PartyRoutingStateList
                .newBuilder()
                .addAllPartyRoutingStates(partyRoutings.values())
                .build();
    }

    public PartyRoutingState getState(String id) {
        return partyRoutings.getOrDefault(id, null);
    }

    public Uni<Empty> updatePartyRoutingState(String status, String processId) {
        return Uni.createFrom().item(() -> {
            LOGGER.info("Updating PartyRoutingState ProcessId: {} - Status: {}", processId, status);

            PartyRoutingState currentState = partyRoutings.get(processId);
            if (currentState == null || (COMPLETED_STATUS.equals(status) && INITIATED_STATUS.equals(currentState.getCustomerOfferStatus()))) {
                partyRoutings.put(processId, PartyRoutingState.newBuilder().setProcessId(processId).setCustomerOfferStatus(status).build());
            }
            return Empty.getDefaultInstance();
        });

    }

}
