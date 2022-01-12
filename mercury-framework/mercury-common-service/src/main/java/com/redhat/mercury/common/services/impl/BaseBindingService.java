package com.redhat.mercury.common.services.impl;

import java.util.UUID;

import org.bian.protobuf.BindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.Builder;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.smallrye.mutiny.Uni;
import io.vertx.core.json.Json;

public abstract class BaseBindingService implements BindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseBindingService.class);

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

    private CloudEvent transformAction(Object object, CloudEvent request) {
        Builder ceBuilder = CloudEvent.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setType(request.getType())
                .setSource(getDomainName());
        if (object != null) {
            ceBuilder.setBinaryData(ByteString.copyFromUtf8(Json.encode(object)));
        }
        return ceBuilder.build();
    }

    protected String getRef(CloudEvent cloudEvent, String ref) {
        CloudEventAttributeValue value = cloudEvent.getAttributesMap().get(ref);
        if (value == null) {
            return null;
        }
        return value.getCeString();
    }

    protected abstract String getDomainName();

    protected abstract Uni<? extends Object> mapQueryMethod(CloudEvent cloudEvent);

    protected abstract Uni<Empty> mapCommandMethod(CloudEvent cloudEvent);

}
