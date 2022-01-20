package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.client.Watcher;
import io.javaoperatorsdk.operator.processing.event.DefaultEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;

public class DeploymentEvent extends DefaultEvent {

    private final Watcher.Action action;
    private final Deployment deployment;

    public DeploymentEvent(Watcher.Action action, Deployment resource, EventSource eventSource) {
        super(resource.getMetadata().getOwnerReferences().get(0).getUid(), eventSource);
        this.action = action;
        this.deployment = resource;
    }

    public Watcher.Action getAction() {
        return action;
    }

    public Deployment getDeployment() {
        return deployment;
    }

    public String resourceUid() {
        return getDeployment().getMetadata().getUid();
    }
}
