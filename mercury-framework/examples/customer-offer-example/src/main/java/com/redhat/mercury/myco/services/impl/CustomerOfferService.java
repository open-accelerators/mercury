package com.redhat.mercury.myco.services.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.myco.model.CustomerOfferState;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class CustomerOfferService {

    private int customerOfferId = 1;
    private static final Map<Integer, CustomerOfferState> states = new HashMap<>();

    public static final String INITIATED_STATUS = "INITIATED";
    public static final String COMPLETED_STATUS = "COMPLETED";

    public Collection<CustomerOfferState> getStates() {
        return states.values();
    }

    public void clear() {
        states.clear();
    }

    public Uni<CustomerOfferState> initiateProcedure(String customerReference) {
        return Uni.createFrom()
                .item(this::getId)
                .onItem()
                .transform(id -> {
                    CustomerOfferState state = CustomerOfferState.builder()
                            .id(id)
                            .customerReference(customerReference)
                            .status(INITIATED_STATUS).build();
                    states.put(id, state);
                    return state;
                });
    }

    public Uni<CustomerOfferState> updateProcedure(Integer id) {
        return Uni.createFrom().item(() -> {
            CustomerOfferState procedure = states.get(id);
            if (procedure == null) {
                return null;
            }
            states.get(id).setStatus(COMPLETED_STATUS);
            return procedure;
        });
    }

    private synchronized Integer getId() {
        return customerOfferId++;
    }

}
