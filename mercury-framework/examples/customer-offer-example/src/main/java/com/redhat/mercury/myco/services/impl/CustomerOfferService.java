package com.redhat.mercury.myco.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;

@ApplicationScoped
public class CustomerOfferService {

    private int customerOfferId = 1;
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferService.class);
    private Map<Integer, CustomerOfferProcedure> procedures = new HashMap<>();

    public Map<Integer, CustomerOfferProcedure> getProcedures() {
        return procedures;
    }

    public CustomerOfferProcedure getProcedure(Integer id) {
        return procedures.get(id);
    }

    public void updateProcedure(Integer id, CustomerOfferProcedure procedure) {
        procedures.put(id, procedure);
    }
}
