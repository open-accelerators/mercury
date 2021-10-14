package com.redhat.mercury.partyroutingprofile.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class PartyRoutingProfileServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    PartyRoutingProfileService getService() {
        return Arc.container().select(PartyRoutingProfileService.class).get();
    }

}
