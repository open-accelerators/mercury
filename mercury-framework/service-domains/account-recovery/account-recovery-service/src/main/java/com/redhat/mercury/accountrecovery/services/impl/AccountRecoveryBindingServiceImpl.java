package com.redhat.mercury.accountrecovery.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.accountrecovery.services.AccountRecoveryService;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.accountrecovery.AccountRecovery.DOMAIN_NAME;

@GrpcService
public class AccountRecoveryBindingServiceImpl extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecoveryBindingServiceImpl.class);

    @Inject
    AccountRecoveryService service;

    protected Uni<Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

}
