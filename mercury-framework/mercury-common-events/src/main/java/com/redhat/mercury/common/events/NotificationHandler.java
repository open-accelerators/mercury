package com.redhat.mercury.common.events;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public interface NotificationHandler<T extends Message> {

    Uni<Void> onEvent(org.eclipse.microprofile.reactive.messaging.Message<T> event);

}
