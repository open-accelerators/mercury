package com.redhat.mercury.partyroutingprofile.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.partyroutingprofile.PartyRoutingStateList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.DOMAIN_NAME;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_ACTION;
import static com.redhat.mercury.partyroutingprofile.PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE_TYPE;

@ApplicationScoped
public class PartyRoutingProfileClient extends PartyRoutingProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileClient.class);

    @GrpcClient
    OutboundBindingService outbound;

    @Override
    public Uni<PartyRoutingStateList> retrievePartyStateStatus(String sdRef, String crRef, String bqRef) {
        LOGGER.info("Received retrievePartyStateStatus for {}/{}/{}", sdRef, crRef, bqRef);
        return outbound.query(CloudEvent.newBuilder().setSource(DOMAIN_NAME)
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
                .onItem().transform(ce -> {
                    try {
                        return ce.getProtoData().unpack(PartyRoutingStateList.class);
                    } catch (InvalidProtocolBufferException e) {
                        LOGGER.error("Unable to unpack response", e);
                        return null;
                    }
                });
    }
}
