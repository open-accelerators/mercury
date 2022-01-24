package com.redhat.mercury.customeroffer.services.client;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.model.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.model.InitiateCustomerOfferProcedureRequest;
import com.redhat.mercury.customeroffer.services.CustomerOfferApi;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.vertx.core.json.Json;

import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SERVICE_DOMAIN;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@ApplicationScoped
public class CustomerOfferClient implements CustomerOfferApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferClient.class);

    @GrpcClient("customer-offer")
    BindingService service;

    @Override
    public Uni<Empty> initiate(InitiateCustomerOfferProcedureRequest procedure) {
        return service.command(builder(CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
                .setBinaryData(ByteString.copyFromUtf8(Json.encode(procedure)))
                .build());
    }

    @Override
    public Uni<Empty> update(CustomerOfferProcedure update) {
        return service.command(builder(CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE)
                .setBinaryData(ByteString.copyFromUtf8(Json.encode(update)))
                .build());
    }

    @Override
    public Uni<CustomerOfferProcedure> retrieve(String crRefId) {
        return service.query(builder(CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE)
                        .putAttributes(CE_CR_REF, CloudEventAttributeValue
                                .newBuilder()
                                .setCeString(crRefId)
                                .build())
                        .build())
                .onItem()
                .transform(ce -> Json.decodeValue(ce.getBinaryData().toStringUtf8(), CustomerOfferProcedure.class));
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
