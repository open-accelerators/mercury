package com.redhat.mercury.operator.event;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.strimzi.api.kafka.model.KafkaTopic;

public class KafkaTopicEventSource extends ServiceDomainEventSource<KafkaTopic> {

    public static KafkaTopicEventSource createAndRegisterWatch(KubernetesClient client) {
        KafkaTopicEventSource eventSource = new KafkaTopicEventSource(client);
        eventSource.registerWatch();
        return eventSource;
    }

    public KafkaTopicEventSource(KubernetesClient client) {
        super(client);
    }

    public void registerWatch() {
        client.resources(KafkaTopic.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .watch(this);
    }
}
