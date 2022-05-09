package com.redhat.mercury.myco.services.messaging;

import java.util.HashMap;
import java.util.Map;

import com.redhat.mercury.customeroffer.CustomerOffer;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import io.smallrye.reactive.messaging.providers.connectors.InMemoryConnector;

public class KafkaTestResourceLifecycleManager implements QuarkusTestResourceLifecycleManager {
    
    @Override
    public Map<String, String> start() {
        Map<String, String> env = new HashMap<>();
        Map<String, String> props1 = InMemoryConnector.switchOutgoingChannelsToInMemory(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE);
        env.putAll(props1);
        return env;
    }

    @Override
    public void stop() {
        InMemoryConnector.clear();
    }

}
