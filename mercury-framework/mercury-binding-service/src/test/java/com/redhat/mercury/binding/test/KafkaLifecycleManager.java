package com.redhat.mercury.binding.test;

import java.util.Map;

import org.testcontainers.containers.KafkaContainer;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class KafkaLifecycleManager implements QuarkusTestResourceLifecycleManager {

    private static KafkaContainer kafka = new KafkaContainer();

    @Override
    public Map<String, String> start() {
        kafka.start();
        return Map.of("mercury.kafka.brokers", kafka.getBootstrapServers());
    }

    @Override
    public void stop() {
        kafka.stop();
    }
}
