package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.client.Watcher;
import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;
import io.strimzi.api.kafka.model.Kafka;

public class ServiceEvent extends DefaultEvent {

    private final Watcher.Action action;
    private final Service service;

    public ServiceEvent(Watcher.Action action, Service resource, EventSource eventSource) {
        super(resource.getMetadata().getOwnerReferences().get(0).getUid(), eventSource);
        this.action = action;
        this.service = resource;
    }

    public Watcher.Action getAction() {
        return action;
    }

    public Service getService() {
        return service;
    }

    public String resourceUid() {
        return getService().getMetadata().getUid();
    }
}
