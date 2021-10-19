package com.redhat.mercury.accountrecovery.events;

import javax.enterprise.inject.Produces;

import com.redhat.mercury.accountrecovery.services.AccountRecoveryNotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class AccountRecoveryNotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    AccountRecoveryNotificationService getService() {
        return Arc.container().select(AccountRecoveryNotificationService.class).get();
    }

}
