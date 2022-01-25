package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.client.KubernetesClient;

public class ServiceEventSource extends ServiceDomainEventSource<Service> {

    public static ServiceEventSource createAndRegisterWatch(KubernetesClient client) {
        ServiceEventSource eventSource = new ServiceEventSource(client);
        eventSource.registerWatch();
        return eventSource;
    }

    public ServiceEventSource(KubernetesClient client) {
        super(client);
    }

    public void registerWatch() {
        client.services()
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .watch(this);
    }
}
