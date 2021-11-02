package com.redhat.mercury.events;

import com.google.protobuf.Message;
import com.redhat.mercury.exceptions.DataTransformationException;

import io.cloudevents.v1.proto.CloudEvent;
import io.smallrye.mutiny.Uni;

public interface BianNotificationHandler {

    String getType();

    Uni<Message> onEvent(CloudEvent event) throws DataTransformationException;

}
