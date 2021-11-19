package com.redhat.mercury.partyroutingprofile.services.client;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_ACTION;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE;

@ApplicationScoped
public class PartyRoutingProfileClient extends PartyRoutingProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileClient.class);

    @GrpcClient
    BindingService bindingService;

    @Override
    public Uni<Message> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        LOGGER.info("Received retrievePartyStateStatus for {}/{}/{}", sdRef, crRef, bqRef);
        return bindingService.query(CloudEvent.newBuilder()
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
                        .putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder()
                                .setCeString(PARTY_STATE_STATUS_RETRIEVE_ACTION)
                                .build())
                        .build())
                .onItem()
                .transform(Unchecked.function(ce -> ce.getProtoData().unpack(PartyRoutingStateList.class)));
    }
}
