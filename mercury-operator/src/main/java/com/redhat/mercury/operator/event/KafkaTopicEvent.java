package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.client.Watcher;
import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;
import io.strimzi.api.kafka.model.KafkaTopic;

public class KafkaTopicEvent extends DefaultEvent {

    private final Watcher.Action action;
    private final KafkaTopic kafkaTopic;

    public KafkaTopicEvent(Watcher.Action action, KafkaTopic resource, EventSource eventSource) {
        super(resource.getMetadata().getOwnerReferences().get(0).getUid(), eventSource);
        this.action = action;
        this.kafkaTopic = resource;
    }

    public Watcher.Action getAction() {
        return action;
    }

    public KafkaTopic getKafkaTopic() {
        return kafkaTopic;
    }

    public String resourceUid() {
        return getKafkaTopic().getMetadata().getUid();
    }
}
