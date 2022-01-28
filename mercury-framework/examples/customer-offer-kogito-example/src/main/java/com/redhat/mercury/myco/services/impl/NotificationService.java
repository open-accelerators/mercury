package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.v10.services.CustomerOfferNotificationService;

@ApplicationScoped
public class NotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    @Inject
    CustomerOfferNotificationService customerOfferNotificationService;

    public void onInitiateProcedure(String referenceId) {
        customerOfferNotificationService.onCustomerOfferInitiated(referenceId)
                .subscribe()
                .with(m -> LOGGER.info("received: {}", referenceId));
    }

}
