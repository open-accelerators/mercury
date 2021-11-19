package com.redhat.mercury.customercreditrating.services.impl;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class CustomerCreditRatingServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    CustomerCreditRatingService getService() {
        return Arc.container().select(CustomerCreditRatingService.class).get();
    }

}
