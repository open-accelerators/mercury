package com.redhat.mercury.operator.event;

import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;

public class MercuryOperatorEvent extends DefaultEvent {

    public MercuryOperatorEvent(String relatedCustomResourceUid, EventSource eventSource) {
        super(relatedCustomResourceUid, eventSource);
    }
}
