package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCOServiceImpl extends CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<Void> initiateCustomerOfferProcedure(CustomerOfferProcedure procedure) {
        LOGGER.info("initiateCustomerOfferProcedure received");
        return Uni.createFrom()
                .voidItem()
                .onItem()
                .invoke(() -> notificationService.onCustomerOfferInitiated(CustomerOfferNotification
                        .newBuilder()
                        .setCustomerOfferReference(BasicReference.newBuilder()
                                .setId(procedure.getProcedure()
                                        .getCustomerReference())
                                .build())
                        .build()));
    }

    @Override
    public Uni<Void> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate procedure) {
        LOGGER.info("updateCustomerOfferProcedure received");
        return Uni.createFrom()
                .voidItem()
                .onItem()
                .invoke(() -> notificationService.onCustomerOfferCompleted(CustomerOfferNotification
                        .newBuilder()
                        .setCustomerOfferReference(BasicReference.newBuilder()
                                .setId(procedure.getProcedure()
                                        .getCustomerReference())
                                .build())
                        .build()));
    }
}
