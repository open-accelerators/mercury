package com.redhat.mercury.customercreditrating.events;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingNotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class CustomerCreditRatingNotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    CustomerCreditRatingNotificationService getService() {
        return Arc.container().select(CustomerCreditRatingNotificationService.class).get();
    }

}
