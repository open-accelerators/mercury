package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureUpdateInputModel;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCOServiceImpl implements CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<Empty> initiateCustomerOfferProcedure(CRCustomerOfferProcedureInitiateInputModel procedure) {
        LOGGER.info("initiateCustomerOfferProcedure received");
        return notificationService.onCustomerOfferInitiated(procedure
                .getCustomerOfferProcedureInstanceRecord()
                .getCustomerReference());
    }

    @Override
    public Uni<Empty> updateCustomerOfferProcedure(CRCustomerOfferProcedureUpdateInputModel procedure) {
        LOGGER.info("updateCustomerOfferProcedure received");
        return notificationService.onCustomerOfferCompleted(procedure
                .getCustomerOfferProcedureInstanceRecord()
                .getCustomerReference());
    }
}
