package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.client.KubernetesClient;

public class DeploymentEventSource extends ServiceDomainEventSource<Deployment> {

    public DeploymentEventSource(KubernetesClient client) {
        super(client);
    }

    public static DeploymentEventSource createAndRegisterWatch(KubernetesClient client) {
        DeploymentEventSource eventSource = new DeploymentEventSource(client);
        eventSource.registerWatch();
        return eventSource;
    }

    public void registerWatch() {
        client.resources(Deployment.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .watch(this);
    }
}
