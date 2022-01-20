package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.strimzi.api.kafka.model.Kafka;

public class KafkaEventSource extends AbstractMercuryEventSource<Kafka> {

    public static KafkaEventSource createAndRegisterWatch(KubernetesClient client) {
        KafkaEventSource eventSource = new KafkaEventSource(client);
        eventSource.registerWatch();
        return eventSource;
    }

    public KafkaEventSource(KubernetesClient client) {
        super(client);
    }

    public void registerWatch() {
        client.resources(Kafka.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .watch(this);
    }

    public String getOwnerRefKind(){
        return "ServiceDomainCluster";
    }
}
