package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCOServiceImpl implements CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<Empty> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure) {
        LOGGER.info("initiateCustomerOfferProcedure received");
        return notificationService.onCustomerOfferInitiated(CustomerOfferNotification
                .newBuilder()
                .setCustomerOfferReference(BasicReference.newBuilder()
                        .setId(procedure.getProcedure()
                                .getCustomerReference())
                        .build())
                .build());
    }

    @Override
    public Uni<Empty> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate procedure) {
        LOGGER.info("updateCustomerOfferProcedure received");
        return notificationService.onCustomerOfferCompleted(CustomerOfferNotification
                .newBuilder()
                .setCustomerOfferReference(BasicReference.newBuilder()
                        .setId(procedure.getProcedure()
                                .getCustomerReference())
                        .build())
                .build());
    }
}
