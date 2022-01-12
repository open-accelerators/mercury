package com.redhat.mercury.partyroutingprofile.services.client;

import java.util.Collection;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.partyroutingprofile.model.BQStatusRetrieveOutputModel;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileApi;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.vertx.core.json.Json;

import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_REFERENCE_IDS_RETRIEVE_TYPE;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE;

@ApplicationScoped
public class PartyRoutingProfileClient implements PartyRoutingProfileApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileClient.class);

    @GrpcClient("party-routing-profile")
    BindingService service;

    @Override
    public Uni<BQStatusRetrieveOutputModel> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        LOGGER.info("Received retrievePartyStateStatus for {}/{}/{}", sdRef, crRef, bqRef);
        return service.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(PARTY_STATE_STATUS_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(sdRef)
                                .build())
                        .putAttributes(CE_CR_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(crRef)
                                .build())
                        .putAttributes(CE_BQ_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(bqRef)
                                .build())
                        .build())
                .onItem()
                .transform(ce -> Json.decodeValue(ce.getBinaryData().toStringUtf8(), BQStatusRetrieveOutputModel.class));
    }

    @Override
    public Uni<Collection<String>> retrieveCustomerProfileReferenceIds(String sdRef) {
        return service.query(CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(PARTY_REFERENCE_IDS_RETRIEVE_TYPE)
                        .putAttributes(CE_SD_REF, CloudEventAttributeValue.newBuilder()
                                .setCeString(sdRef)
                                .build())
                        .build())
                .onItem()
                .transform(ce -> Json.decodeValue(ce.getBinaryData().toStringUtf8(), Collection.class));
    }
}
