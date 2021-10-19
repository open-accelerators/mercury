package com.redhat.mercury.accountrecovery.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.redhat.mercury.accountrecovery.services.AccountRecoveryService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class AccountRecoveryServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    AccountRecoveryService getService() {
        return Arc.container().select(AccountRecoveryService.class).get();
    }

}
