package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.api.model.GenericKubernetesResource;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.model.Scope;

public class IntegrationEventSource extends ServiceDomainEventSource<GenericKubernetesResource> {

    public static IntegrationEventSource createAndRegisterWatch(KubernetesClient client) {
        IntegrationEventSource eventSource = new IntegrationEventSource(client);
        eventSource.registerWatch();
        return eventSource;
    }

    public IntegrationEventSource(KubernetesClient client) {
        super(client);
    }

    public void registerWatch() {
        CustomResourceDefinitionContext resourceDefinitionContext = new CustomResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withScope(Scope.NAMESPACED.toString())
                .build();

        client.genericKubernetesResources(resourceDefinitionContext)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .watch(this);
    }
}
