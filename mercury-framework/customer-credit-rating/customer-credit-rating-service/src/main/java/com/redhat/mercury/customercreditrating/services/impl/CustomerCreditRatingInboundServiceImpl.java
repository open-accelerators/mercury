package com.redhat.mercury.customercreditrating.services.impl;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bian.protobuf.ExternalRequest;
import org.bian.protobuf.ExternalResponse;
import org.bian.protobuf.InboundBindingService;
import org.bian.protobuf.customercreditrating.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_COMMAND;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_QUERY;
import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customercreditrating.CustomerCreditRating.DOMAIN_NAME;

@GrpcService
public class CustomerCreditRatingInboundServiceImpl implements InboundBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingInboundServiceImpl.class);

    private static final String GET_VERB = "GET";
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

    private static final Map<String, Class> OUT_TYPE_MAPPINGS = Map.of(
            CustomerCreditRating.STATE_RETRIEVE_TYPE, Rating.class
            //TODO: Add more out type mappings
    );

    @Inject
    CustomerCreditRatingService service;

    @Override
    public Uni<CloudEvent> query(CloudEvent request) {
        LOGGER.info("received query request");
        return mapQueryMethod(request)
                .onItem()
                .transform(e -> CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(request.getType())
                        .setSource("http://" + DOMAIN_NAME)
                        .putAttributes(BianCloudEvent.CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(BianCloudEvent.CE_ACTION_RESPONSE).build())
                        .setProtoData(Any.pack(e))
                        .build());
    }

    @Override
    public Uni<CloudEvent> command(CloudEvent request) {
        LOGGER.info("received command request");
        return mapCommandMethod(request)
                .onItem()
                .transform(e -> CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(request.getType())
                        .setSource("http://" + DOMAIN_NAME)
                        .putAttributes(BianCloudEvent.CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(BianCloudEvent.CE_ACTION_RESPONSE).build())
                        .setProtoData(Any.pack(e))
                        .build());
    }

    @Override
    public Uni<Empty> receive(CloudEvent request) {
        LOGGER.info("received receive request");
        return Uni.createFrom().item(() -> {
            mapReceiveMethod(request);
            return Empty.getDefaultInstance();
        });
    }

    protected String getRef(CloudEvent cloudEvent, String ref) {
        CloudEventAttributeValue value = cloudEvent.getAttributesMap().get(ref);
        if (value == null) {
            return null;
        }
        return value.getCeString();
    }

    protected Uni<? extends Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            case CustomerCreditRating.STATE_RETRIEVE_TYPE:
                return service.retrieveCustomerCreditRatingState(getRef(cloudEvent, CE_SD_REF), getRef(cloudEvent, CE_CR_REF));
            //TODO: Add more mappings
        }
        return null;
    }

    protected Uni<? extends Message> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return null;
    }

    protected void mapReceiveMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
    }

    public Uni<ExternalResponse> external(ExternalRequest request) {
        return Uni.createFrom().item(request).onItem().transformToUni(this::processExternalRequest);
    }

    private Uni<ExternalResponse> processExternalRequest(ExternalRequest request) {
        Builder builder = CloudEvent.newBuilder().setId(UUID.randomUUID().toString());
        String uri = request.getPath();
        Optional<Matcher> path = getMatchingPath(uri);
        if (!path.isEmpty()) {
            try {
                String action = GET_VERB.equals(request.getVerb()) ? CE_ACTION_QUERY : CE_ACTION_COMMAND;
                String type = getType(path.get().pattern(), action);
                if(type == null) {
                    throw new IllegalStateException("Unable to retrieve the right CloudEvent type from " + path.get() + " and " + action);
                }
                addRefToCE(builder, path.get(), 1, CE_SD_REF);
                addRefToCE(builder, path.get(), 2, CE_CR_REF);
                addRefToCE(builder, path.get(), 3, CE_BQ_REF);
                builder.setType(type).putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(action).build());
                LOGGER.debug("Set Type {}", type);
                if (CE_ACTION_COMMAND.equals(action)) {
                    if (IN_TYPE_MAPPINGS.containsKey(type)) {
                        Message.Builder messageBuilder = IN_TYPE_MAPPINGS.get(type).get();
                        JsonFormat.parser().ignoringUnknownFields().merge(request.getPayload().toString(), builder);
                        builder.setProtoData(Any.pack(messageBuilder.build()));
                    }
                    return toExternalResponse(type, mapCommandMethod(builder.build()));
                } else {
                    return toExternalResponse(type, mapQueryMethod(builder.build()));
                }
            } catch (InvalidProtocolBufferException e) {
                LOGGER.error("Unable to parse Json {}", request.getPayload(), e);
                return Uni.createFrom().item(() -> ExternalResponse.newBuilder().setResponseCode(500).build());
            }
        }
        LOGGER.info("No valid mapping found for {}", uri);
        return Uni.createFrom().item(() -> ExternalResponse.newBuilder().setResponseCode(400).build());
    }

    private void addRefToCE(Builder builder, Matcher matcher, int group, String ref) {
        if (matcher.groupCount() >= group) {
            String value = matcher.group(group);
            LOGGER.debug("Set {} to {}", ref, value);
            builder.putAttributes(ref, CloudEventAttributeValue.newBuilder().setCeString(value).build());
        }
    }

    private Optional<Matcher> getMatchingPath(String uri) {
        return QUERY_PATH_MAPPINGS
                .keySet()
                .stream()
                .map(p -> p.matcher(uri))
                .filter(m -> m.matches())
                .findFirst();
    }

    private String getType(Pattern key, String method) {
        switch (method) {
            case CE_ACTION_QUERY:
                return QUERY_PATH_MAPPINGS.get(key);
            default:
                return COMMAND_PATH_MAPPINGS.get(key);
        }
    }

    private Uni<ExternalResponse> toExternalResponse(String type, Uni<? extends Message> m) throws InvalidProtocolBufferException {
        return m.onItem().transform(message -> {
            Class<Message> outType = OUT_TYPE_MAPPINGS.get(type);
            if (outType == null) {
                return ExternalResponse.newBuilder().setResponseCode(500).build();
            }
            try {
                return ExternalResponse.newBuilder().setResponseCode(202).setPayload(ByteString.copyFromUtf8(JsonFormat.printer().print(message))).build();
            } catch (InvalidProtocolBufferException e) {
                return ExternalResponse.newBuilder().setResponseCode(500).build();
            }
        });
    }
}
