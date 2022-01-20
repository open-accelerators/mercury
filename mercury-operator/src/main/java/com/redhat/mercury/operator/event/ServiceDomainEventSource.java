package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.client.KubernetesClient;

public abstract class ServiceDomainEventSource<T extends HasMetadata> extends AbstractMercuryEventSource<T>{

    public ServiceDomainEventSource(KubernetesClient client) {
        super(client);
    }

    public String getOwnerRefKind(){
        return "ServiceDomain";
    }
}
