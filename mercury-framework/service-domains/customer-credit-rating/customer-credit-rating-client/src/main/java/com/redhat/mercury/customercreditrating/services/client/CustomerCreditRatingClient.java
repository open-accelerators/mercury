package com.redhat.mercury.customercreditrating.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.bian.protobuf.customercreditrating.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingApi;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.STATE_RETRIEVE_ACTION;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.STATE_RETRIEVE_TYPE;

@ApplicationScoped
public class CustomerCreditRatingClient implements CustomerCreditRatingApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingClient.class);

    @GrpcClient("customer-credit-rating")
    BindingService service;

    @Override
    public Uni<Message> retrieveCustomerCreditRatingState(String sd, String cr) {
        LOGGER.info("Received retrieveCustomerCreditRatingState for {}/{}", sd, cr);
        return service.query(CloudEvent.newBuilder()
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
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(Rating.class)));
    }
}
