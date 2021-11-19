package com.redhat.mercury.accountrecovery.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.accountrecovery.AccountRecovery;
import com.redhat.mercury.accountrecovery.services.AccountRecoveryNotificationService;

@ApplicationScoped
public class AccountRecoveryNotificationServiceImpl extends AccountRecoveryNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecoveryNotificationServiceImpl.class);

    @Inject
    @Channel(AccountRecovery.DOMAIN_NAME)
    Emitter<Message> emitter;

}
