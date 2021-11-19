package com.redhat.mercury.accountrecovery.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.accountrecovery.services.AccountRecoveryService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class AccountRecoveryClient extends AccountRecoveryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecoveryClient.class);

    @GrpcClient
    BindingService bindingService;

}
