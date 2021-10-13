package com.redhat.mercury.customeroffer.services.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bian.protobuf.ExternalRequest;
import org.bian.protobuf.ExternalResponse;
import org.bian.protobuf.InboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.constants.BianCloudEvent;
import com.redhat.mercury.customeroffer.services.CustomerOfferService;
import com.redhat.mercury.events.BianNotificationHandler;
import com.redhat.mercury.exceptions.DataTransformationException;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.arc.Arc;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_COMMAND;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_QUERY;
import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE;
import static com.redhat.mercury.customeroffer.CustomerOffer.DOMAIN_NAME;

@GrpcService
public class CustomerOfferInboundServiceImpl implements InboundBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferInboundServiceImpl.class);

    private static final String GET_VERB = "GET";
    private static final Pattern CUSTOMER_OFFER_PROCEDURE_INITIATION_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/customer-offer-procedure/initiation");
    private static final Pattern CUSTOMER_OFFER_PROCEDURE_UPDATE_PATH = Pattern.compile("/" + DOMAIN_NAME + "/([a-zA-Z0-9\\-]+)/customer-offer-procedure/([a-zA-Z0-9\\-]+)/update");

    private static final Map<Pattern, String> QUERY_PATH_MAPPINGS = Map.of(
            //TODO: Implement
    );
    private static final Map<Pattern, String> COMMAND_PATH_MAPPINGS = Map.of(
            CUSTOMER_OFFER_PROCEDURE_INITIATION_PATH, CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE,
            CUSTOMER_OFFER_PROCEDURE_UPDATE_PATH, CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE
            //TODO: Implement
    );
    private static final Map<String, Supplier<Message.Builder>> IN_TYPE_MAPPINGS = Map.of(
            //TODO: Add mappings
    );

    private static final Map<String, Class> OUT_TYPE_MAPPINGS = Map.of(
            //TODO: Add mappings
    );

    @Inject
    CustomerOfferService service;

    @Override
    public Uni<CloudEvent> query(CloudEvent request) {
        LOGGER.info("received query request");
        return mapQueryMethod(request)
                .onItem()
                .transform(e -> CloudEvent.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setType(request.getType())
                        .setSource(DOMAIN_NAME)
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
                        .setSource(DOMAIN_NAME)
                        .putAttributes(BianCloudEvent.CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(BianCloudEvent.CE_ACTION_RESPONSE).build())
                        .setProtoData(Any.pack(e))
                        .build());
    }

    @Override
    public Uni<Empty> receive(CloudEvent request) {
        LOGGER.info("received receive request");
        return Uni.createFrom().item(() -> {
            if (eventHandlers.containsKey(request.getType())) {
                try {
                    eventHandlers.get(request.getType()).onEvent(request);
                } catch (DataTransformationException e) {
                    LOGGER.error("Unable to process received event", e);
                }
            }
            return Empty.getDefaultInstance();
        });
    }

    private Map<String, BianNotificationHandler> eventHandlers = new HashMap<>();

    @PostConstruct
    void initEventHandlers() {
        Arc.container().select(BianNotificationHandler.class).forEach(e -> eventHandlers.put(e.getType(), e));
    }

    protected Uni<? extends Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return null;
    }

    protected Uni<? extends Message> mapCommandMethod(CloudEvent cloudEvent) {
        //TODO: Add more mappings
        return null;
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
                if (type == null) {
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
