package com.redhat.mercury.advertising.events;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.advertising.services.AdvertisingNotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class AdvertisingNotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    AdvertisingNotificationService getService() {
        return Arc.container().select(AdvertisingNotificationService.class).get();
    }

}
