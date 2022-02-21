package com.redhat.mercury.myco.services.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.graalvm.collections.Pair;

import com.google.protobuf.Any;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.myco.model.CustomerOfferState;

@ApplicationScoped
public class CustomerOfferService {

    private int customerOfferId = 1;
    private static final Map<Integer, CustomerOfferProcedure> procedures = new HashMap<>();
    private static final Map<Integer, CustomerOfferState> states = new HashMap<>();

    public Map<Integer, CustomerOfferProcedure> getProcedures() {
        return procedures;
    }

    public Collection<CustomerOfferState> getStates() {
        return states.values();
    }

    public Pair<Integer, CustomerOfferProcedure> initiateProcedure(Any customerReference) {
        Integer id = getId();
        states.put(id, new CustomerOfferState().setCustomerReference(customerReference.getTypeUrl()).setStatus("INITIATED"));
        final CustomerOfferProcedure procedure = CustomerOfferProcedure.newBuilder()
                .setCustomerReference(customerReference)
                .setCustomerOfferProcessingTask("INITIATED")
                .build();
        procedures.put(id, procedure);
        return Pair.create(id, procedure);
    }

    public CustomerOfferProcedure updateProcedure(Integer id) {
        CustomerOfferProcedure procedure = procedures.get(id);
        if (procedure == null) {
            return null;
        }
        states.get(id).setStatus("COMPLETED");
        CustomerOfferProcedure updated = CustomerOfferProcedure.newBuilder(procedure)
                .setCustomerOfferProcessingTask("COMPLETED")
                .build();
        procedures.put(id, updated);
        return updated;
    }

    private synchronized Integer getId() {
        return customerOfferId++;
    }

}
