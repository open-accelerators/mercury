package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.model.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCOServiceImpl implements CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<Empty> initiate(InitiateCustomerOfferProcedureRequest procedure) {
        LOGGER.info("Initiate received");
        return notificationService.onCustomerOfferInitiated(procedure
                .getCustomerOfferProcedure()
                .getCustomerReference().toString());
    }

    @Override
    public Uni<Empty> update(CustomerOfferProcedure procedure) {
        LOGGER.info("updateCustomerOfferProcedure received");
        return notificationService.onCustomerOfferCompleted(procedure
                .getCustomerReference().toString());
    }
}
