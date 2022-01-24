package com.redhat.mercury.customeroffer.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.customeroffer.model.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.model.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import io.vertx.core.json.Json;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@GrpcService
public class CustomerOfferBindingService extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferBindingService.class);

    @Inject
    CustomerOfferService service;

    protected Uni<? extends Object> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE:
                return service.retrieve(getRef(cloudEvent, CE_CR_REF));
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        switch (cloudEvent.getType()) {
            case CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE:
                return service.initiate(Json.decodeValue(cloudEvent.getBinaryData().toStringUtf8(), InitiateCustomerOfferProcedureRequest.class));
            case CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE:
                return service.update(Json.decodeValue(cloudEvent.getBinaryData().toStringUtf8(), CustomerOfferProcedure.class));
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

}
