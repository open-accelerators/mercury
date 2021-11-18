package com.redhat.mercury.common.services.impl;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_COMMAND;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_QUERY;
import static com.redhat.mercury.constants.BianCloudEvent.CE_BQ_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_CR_REF;
import static com.redhat.mercury.constants.BianCloudEvent.CE_SD_REF;

public abstract class BaseInboundService implements InboundBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseInboundService.class);

    protected static final String GET_VERB = "GET";

    @Override
    public Uni<CloudEvent> query(CloudEvent request) {
        LOGGER.info("received query request");
        return mapQueryMethod(request)
                .onItem()
                .transform(message -> transformAction(message, request))
                .onFailure()
                .transform(this::exceptionTransformer);
    }

    private Throwable exceptionTransformer(Throwable e) {
        if (e instanceof MappingNotFoundException) {
            return new StatusRuntimeException(Status.INVALID_ARGUMENT
                    .withCause(e)
                    .withDescription(e.getMessage()));
        }
        return new StatusRuntimeException(Status.INTERNAL
                .withCause(e)
                .withDescription(e.getMessage()));
    }

    @Override
    public Uni<Empty> command(CloudEvent request) {
        LOGGER.info("received command request");
        return mapCommandMethod(request);
    }

    private CloudEvent transformAction(Message message, CloudEvent request) {
        Builder ceBuilder = CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setType(request.getType())
                .setSource(getDomainName())
                .putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(BianCloudEvent.CE_ACTION_RESPONSE).build());
        if (message != null) {
            ceBuilder.setProtoData(Any.pack(message));
        }
        return ceBuilder.build();
    }

    @Override
    public Uni<CloudEvent> receive(CloudEvent request) {
        LOGGER.info("received receive request");
        return Uni.createFrom()
                .failure(exceptionTransformer(new MappingNotFoundException(request.getType())));
    }

    @Override
    public Uni<ExternalResponse> external(ExternalRequest request) {
        return Uni.createFrom().item(request).onItem().transformToUni(this::processExternalRequest);
    }

    protected String getRef(CloudEvent cloudEvent, String ref) {
        CloudEventAttributeValue value = cloudEvent.getAttributesMap().get(ref);
        if (value == null) {
            return null;
        }
        return value.getCeString();
    }

    private Uni<ExternalResponse> processExternalRequest(ExternalRequest request) {
        Builder builder = CloudEvent.newBuilder().setId(UUID.randomUUID().toString());
        String uri = request.getPath();
        String action = GET_VERB.equals(request.getVerb()) ? CE_ACTION_QUERY : CE_ACTION_COMMAND;
        Optional<Matcher> path = getMatchingPath(uri, action);
        if (path.isPresent()) {
            try {
                String type = getCEType(path.get().pattern(), action);
                if (type == null) {
                    throw new IllegalStateException("Unable to retrieve the right CloudEvent type from " + path.get() + " and " + action);
                }
                addRefToCE(builder, path.get(), 1, CE_SD_REF);
                addRefToCE(builder, path.get(), 2, CE_CR_REF);
                addRefToCE(builder, path.get(), 3, CE_BQ_REF);
                builder.setType(type).putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder().setCeString(action).build());
                LOGGER.debug("Set Type {}", type);
                if (CE_ACTION_COMMAND.equals(action)) {
                    if (getInTypeMappings().containsKey(type)) {
                        Message.Builder messageBuilder = getInTypeMappings().get(type).get();
                        JsonFormat.parser().ignoringUnknownFields().merge(request.getPayload().toStringUtf8(), messageBuilder);
                        builder.setProtoData(Any.pack(messageBuilder.build()));
                    }
                    return mapCommandMethod(builder.build()).chain(v -> toExternalResponse(type, null));
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

    private Uni<ExternalResponse> toExternalResponse(String type, Uni<? extends Message> m) {
        if (m == null) {
            return Uni.createFrom()
                    .nullItem()
                    .onItem()
                    .transform(o -> ExternalResponse.newBuilder().setResponseCode(202).build());
        }
        return m.onItem().transform(message -> {
            try {
                return ExternalResponse.newBuilder().setResponseCode(200).setPayload(ByteString.copyFromUtf8(JsonFormat.printer().print(message))).build();
            } catch (InvalidProtocolBufferException e) {
                return ExternalResponse.newBuilder().setResponseCode(500).build();
            }
        });
    }

    private Optional<Matcher> getMatchingPath(String uri, String action) {
        switch (action) {
            case CE_ACTION_QUERY:
                return getQueryPathMappings()
                        .keySet()
                        .stream()
                        .map(p -> p.matcher(uri))
                        .filter(Matcher::matches)
                        .findFirst();
            default:
                return getCommandPathMappings().keySet()
                        .stream()
                        .map(p -> p.matcher(uri))
                        .filter(Matcher::matches)
                        .findFirst();
        }
    }

    private String getCEType(Pattern key, String action) {
        switch (action) {
            case CE_ACTION_QUERY:
                return getQueryPathMappings().get(key);
            default:
                return getCommandPathMappings().get(key);
        }
    }

    protected abstract String getDomainName();

    protected abstract Uni<Message> mapQueryMethod(CloudEvent cloudEvent);

    protected abstract Uni<Empty> mapCommandMethod(CloudEvent cloudEvent);

    protected abstract Map<String, Supplier<Message.Builder>> getInTypeMappings();

    protected abstract Map<Pattern, String> getQueryPathMappings();

    protected abstract Map<Pattern, String> getCommandPathMappings();

}
