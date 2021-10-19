package com.redhat.mercury.accountrecovery.services.impl;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.accountrecovery.services.AccountRecoveryNotificationService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class AccountRecoveryNotificationServiceImpl extends AccountRecoveryNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecoveryNotificationServiceImpl.class);

    @GrpcClient("outboundBindingService")
    OutboundBindingService outbound;

}
