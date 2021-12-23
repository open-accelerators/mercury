package com.redhat.mercury.customeroffer.services.impl;

import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.exceptions.DataTransformationException;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@GrpcService
public class CustomerOfferBindingService extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferBindingService.class);

    @Inject
    CustomerOfferService service;

    protected Uni<Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CUSTOMER_OFFER_RETRIEVE_TYPE:
                return service.retrieveSDCustomerOffer(getRef(cloudEvent, CE_SD_REF));
            case CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE:
                return service.retrieveCustomerOffer(getRef(cloudEvent, CE_SD_REF), getRef(cloudEvent, CE_CR_REF));
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        try {
            switch (cloudEvent.getType()) {
                case CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE:
                    return service.initiateCustomerOfferProcedure(cloudEvent.getProtoData().unpack(CustomerOfferProcedureInitiation.class));
                case CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE:
                    return service.updateCustomerOfferProcedure(cloudEvent.getProtoData().unpack(CustomerOfferProcedureUpdate.class));
            }
            return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
        } catch (InvalidProtocolBufferException e) {
            LOGGER.error("Unable to convert to the expected data type", e);
            return Uni.createFrom().failure(new DataTransformationException(e));
        }
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

}
