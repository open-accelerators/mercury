package com.redhat.mercury.customeroffer.events;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class CustomerOfferNotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    CustomerOfferNotificationService getService() {
        return Arc.container().select(CustomerOfferNotificationService.class).get();
    }

}
