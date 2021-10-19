package com.redhat.mercury.partyroutingprofile.events;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileNotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class PartyRoutingProfileNotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    PartyRoutingProfileNotificationService getService() {
        return Arc.container().select(PartyRoutingProfileNotificationService.class).get();
    }

}
