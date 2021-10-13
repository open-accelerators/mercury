package com.redhat.mercury.customercreditrating.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.customercreditrating.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.STATE_RETRIEVE_ACTION;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.STATE_RETRIEVE_TYPE;

@ApplicationScoped
public class CustomerCreditRatingClient extends CustomerCreditRatingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingClient.class);

    @GrpcClient
    OutboundBindingService outbound;

    @Override
    public Uni<Rating> retrieveCustomerCreditRatingState(String sd, String cr) {
        LOGGER.info("Received retrieveCustomerCreditRatingState for {}/{}", sd,cr);
        return outbound.query(CloudEvent.newBuilder()
                        .setSource(CustomerCreditRating.DOMAIN_NAME)
                        .setType(STATE_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(sd)
                                .build())
                        .putAttributes(CE_CR_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(cr)
                                .build())
                        .putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder()
                                .setCeString(STATE_RETRIEVE_ACTION)
                                .build())
                        .build())
                .onItem().transform(ce -> {
                    try {
                        return ce.getProtoData().unpack(Rating.class);
                    } catch (InvalidProtocolBufferException e) {
                        LOGGER.error("Unable to unpack Rating response", e);
                        return null;
                    }
                });
    }
}
