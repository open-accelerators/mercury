package com.redhat.mercury.customeroffer.services.impl;

import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Message.Builder;
import com.redhat.mercury.common.services.impl.BaseInboundService;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@GrpcService
public class CustomerOfferInboundServiceImpl extends BaseInboundService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferInboundServiceImpl.class);

    private static final Pattern CUSTOMER_OFFER_RETRIEVE_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)");
    private static final Pattern CUSTOMER_OFFER_PROCEDURE_INITIATION_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/customer-offer-procedure/initiation");
    private static final Pattern CUSTOMER_OFFER_PROCEDURE_UPDATE_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/customer-offer-procedure/([a-zA-Z0-9\\-]+)/update");

    private static final Map<Pattern, String> QUERY_PATH_MAPPINGS = Map.of(
            CUSTOMER_OFFER_RETRIEVE_PATH, CUSTOMER_OFFER_RETRIEVE_TYPE
            //TODO: Implement
    );
    private static final Map<Pattern, String> COMMAND_PATH_MAPPINGS = Map.of(
            CUSTOMER_OFFER_PROCEDURE_INITIATION_PATH, CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE,
            CUSTOMER_OFFER_PROCEDURE_UPDATE_PATH, CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE
            //TODO: Implement
    );
    private static final Map<String, Supplier<Message.Builder>> IN_TYPE_MAPPINGS = Map.of(
            CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE, () -> CustomerOfferProcedure.newBuilder(),
            CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE, () -> CustomerOfferProcedureUpdate.newBuilder()
            //TODO: Add mappings
    );

    @Inject
    CustomerOfferService service;

    protected Uni<Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CUSTOMER_OFFER_RETRIEVE_TYPE:
                return service.retrieveSDCustomerOffer(getRef(cloudEvent, CE_SD_REF));
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Message> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        try {
            switch (cloudEvent.getType()) {
                case CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE:
                    return service.initiateCustomerOfferProcedure(cloudEvent.getProtoData().unpack(CustomerOfferProcedure.class));
                case CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE:
                    return service.updateCustomerOfferProcedure(cloudEvent.getProtoData().unpack(CustomerOfferProcedureUpdate.class));
            }
        } catch (InvalidProtocolBufferException e) {
            LOGGER.error("Unable to convert to the expected data type", e);
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }

    @Override
    protected Map<String, Supplier<Builder>> getInTypeMappings() {
        return IN_TYPE_MAPPINGS;
    }

    @Override
    protected Map<Pattern, String> getQueryPathMappings() {
        return QUERY_PATH_MAPPINGS;
    }

    @Override
    protected Map<Pattern, String> getCommandPathMappings() {
        return COMMAND_PATH_MAPPINGS;
    }
}
