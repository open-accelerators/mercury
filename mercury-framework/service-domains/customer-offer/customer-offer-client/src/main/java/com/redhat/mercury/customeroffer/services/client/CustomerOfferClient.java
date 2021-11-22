package com.redhat.mercury.customeroffer.services.client;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.SDCustomerOffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.services.CustomerOfferApi;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SERVICE_DOMAIN;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@ApplicationScoped
public class CustomerOfferClient implements CustomerOfferApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferClient.class);

    @GrpcClient("customer-offer")
    BindingService service;

    @Override
    public Uni<Empty> initiateCustomerOfferProcedure(CustomerOfferProcedureInitiation procedure) {
        return service.command(builder(CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                .setProtoData(Any.pack(procedure))
                .build());
    }

    @Override
    public Uni<Empty> updateCustomerOfferProcedure(CustomerOfferProcedureUpdate update) {
        return service.command(builder(CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                .setProtoData(Any.pack(update))
                .build());
    }

    @Override
    public Uni<Message> retrieveSDCustomerOffer(String sdRefId) {
        return service.query(builder(CUSTOMER_OFFER_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .build())
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(SDCustomerOffer.class)));
    }

    @Override
    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        return service.query(builder(CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(sdRefId)
                                .build())
                        .putAttributes(CE_CR_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(crRefId)
                                .build())
                        .build())
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(CustomerOfferProcedure.class)));
    }

    private CloudEvent.Builder builder(String type) {
        return CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setType(type)
                .putAttributes(CE_SERVICE_DOMAIN,
                        CloudEventAttributeValue.newBuilder()
                                .setCeString(DOMAIN_NAME)
                                .build());
    }
}
