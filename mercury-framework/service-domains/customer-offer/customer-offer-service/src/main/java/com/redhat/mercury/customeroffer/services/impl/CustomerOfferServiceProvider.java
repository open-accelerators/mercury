package com.redhat.mercury.customeroffer.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.events.BianNotificationHandler;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class CustomerOfferServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    CustomerOfferService getService() {
        return Arc.container().select(CustomerOfferService.class).get();
    }

}
