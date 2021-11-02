package com.redhat.mercury.operator;

import io.fabric8.kubernetes.client.Watcher;
import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;
import io.strimzi.api.kafka.model.Kafka;

public class KafkaServiceEvent extends DefaultEvent {

    private final Watcher.Action action;
    private final Kafka kafka;

    public KafkaServiceEvent(Watcher.Action action, Kafka resource, EventSource eventSource) {
        super(resource.getMetadata().getOwnerReferences().get(0).getUid(), eventSource);
        this.action = action;
        this.kafka = resource;
    }

    public Watcher.Action getAction() {
        return action;
    }

    public Kafka getKafka() {
        return kafka;
    }

    public String resourceUid() {
        return getKafka().getMetadata().getUid();
    }
}
