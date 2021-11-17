package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

@ApplicationScoped
public class NotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    @Inject
    CustomerOfferNotificationService customerOfferNotificationService;

    public void onInitiateProcedure(CustomerOfferProcedureInitiation procedure) {
        customerOfferNotificationService.onCustomerOfferInitiated(CustomerOfferNotification.newBuilder()
                .setCustomerOfferReference(
                        BasicReference.newBuilder()
                                .setId(procedure.getProcedure().getCustomerReference())
                                .build())
                .build()).subscribe().with(m -> LOGGER.info("received: {}", m));
    }

}
