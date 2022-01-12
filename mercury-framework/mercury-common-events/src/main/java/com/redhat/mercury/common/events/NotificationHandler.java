package com.redhat.mercury.common.events;

import io.smallrye.mutiny.Uni;

public interface NotificationHandler {

    Uni<Void> onEvent(org.eclipse.microprofile.reactive.messaging.Message<String> event);

}
