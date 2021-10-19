package com.redhat.mercury.advertising.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.redhat.mercury.advertising.services.AdvertisingService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class AdvertisingServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    AdvertisingService getService() {
        return Arc.container().select(AdvertisingService.class).get();
    }

}
