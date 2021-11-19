package com.redhat.mercury.advertising.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.advertising.services.AdvertisingService;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.advertising.Advertising.DOMAIN_NAME;

@GrpcService
public class AdvertisingBindingServiceImpl extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertisingBindingServiceImpl.class);

    @Inject
    AdvertisingService service;

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
