package com.redhat.mercury.customeroffer.services.test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.mockito.Mockito;

import com.redhat.mercury.customeroffer.services.CustomerOfferService;

import io.quarkus.arc.profile.IfBuildProfile;

public class CustomerOfferServiceMockProvider {

    @Produces
    @IfBuildProfile("test")
    @ApplicationScoped
    CustomerOfferService getCustomerOfferService() {
        return Mockito.mock(CustomerOfferService.class);
    }
}
