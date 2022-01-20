package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.GenericKubernetesResource;
import io.fabric8.kubernetes.client.Watcher;
import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;

public class IntegrationEvent extends DefaultEvent {

    private final Watcher.Action action;
    private final GenericKubernetesResource resource;

    public IntegrationEvent(Watcher.Action action, GenericKubernetesResource resource, EventSource eventSource) {
        super(resource.getMetadata().getOwnerReferences().get(0).getUid(), eventSource);
        this.action = action;
        this.resource = resource;
    }

    public Watcher.Action getAction() {
        return action;
    }

    public GenericKubernetesResource getKafka() {
        return resource;
    }

    public String resourceUid() {
        return getKafka().getMetadata().getUid();
    }
}
