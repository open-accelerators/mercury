package com.redhat.mercury.customercreditrating.services.impl;

import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.google.protobuf.Message.Builder;
import com.redhat.mercury.common.services.impl.BaseInboundService;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.DOMAIN_NAME;

@GrpcService
public class CustomerCreditRatingInboundServiceImpl extends BaseInboundService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingInboundServiceImpl.class);

    private static final Pattern CUSTOMER_CREDIT_RATING_STATE_RETRIEVE = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/customer-credit-rating-state/([a-zA-Z0-9\\-]+)");

    private static final Map<Pattern, String> QUERY_PATH_MAPPINGS = Map.of(
            CUSTOMER_CREDIT_RATING_STATE_RETRIEVE, CustomerCreditRating.STATE_RETRIEVE_TYPE
    );
    private static final Map<Pattern, String> COMMAND_PATH_MAPPINGS = Map.of(
            //TODO: Implement
    );
    private static final Map<String, Supplier<Message.Builder>> IN_TYPE_MAPPINGS = Map.of(
            //TODO: Add mappings
    );

    @Inject
    CustomerCreditRatingService service;


    protected Uni<? extends Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CustomerCreditRating.STATE_RETRIEVE_TYPE:
                return service.retrieveCustomerCreditRatingState(getRef(cloudEvent, CE_SD_REF), getRef(cloudEvent, CE_CR_REF));
            //TODO: Add more mappings
        }
        return null;
    }

    protected Uni<Void> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return null;
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
