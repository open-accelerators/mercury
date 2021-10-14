package com.redhat.mercury.events;

import com.redhat.mercury.exceptions.DataTransformationException;

import io.cloudevents.v1.proto.CloudEvent;

public interface BianNotificationHandler {

    String getType();

    void onEvent(CloudEvent event) throws DataTransformationException;

}
