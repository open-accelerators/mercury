package com.redhat.mercury.customercreditrating.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;

@GrpcService
public class CustomerCreditRatingBindingService extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingBindingService.class);

    @Inject
    CustomerCreditRatingService service;

    @Override
    protected String getDomainName() {
        return CustomerCreditRating.DOMAIN_NAME;
    }

    protected Uni<? extends Object> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CustomerCreditRating.STATE_RETRIEVE_TYPE:
                return service.retrieve(getRef(cloudEvent, CE_CR_REF));
            //TODO: Add more mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }
}
