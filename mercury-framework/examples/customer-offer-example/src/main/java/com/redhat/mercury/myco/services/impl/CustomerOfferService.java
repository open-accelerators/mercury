package com.redhat.mercury.myco.services.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.myco.model.CustomerOfferState;

@ApplicationScoped
public class CustomerOfferService {

    private int customerOfferId = 1;
    private static final Map<Integer, CustomerOfferState> states = new HashMap<>();

    public static final String INITIATED_STATUS = "INITIATED";
    public static final String COMPLETED_STATUS = "COMPLETED";

    public Collection<CustomerOfferState> getStates() {
        return states.values();
    }

    public CustomerOfferState initiateProcedure(String customerReference) {
        Integer id = getId();
        CustomerOfferState current = new CustomerOfferState().setId(id).setCustomerReference(customerReference).setStatus(INITIATED_STATUS);
        states.put(id, current);
        return current;
    }

    public CustomerOfferState updateProcedure(Integer id) {
        CustomerOfferState procedure = states.get(id);
        if (procedure == null) {
            return null;
        }
        states.get(id).setStatus(COMPLETED_STATUS);
        return procedure;
    }

    private synchronized Integer getId() {
        return customerOfferId++;
    }

}
