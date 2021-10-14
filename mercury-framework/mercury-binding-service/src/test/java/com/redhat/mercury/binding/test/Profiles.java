package com.redhat.mercury.binding.test;

import java.util.Collections;
import java.util.List;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profiles {

    public static class KafkaIntegrationProfile implements QuarkusTestProfile {
        @Override
        public List<TestResourceEntry> testResources() {
            return Collections.singletonList(new TestResourceEntry(KafkaLifecycleManager.class));
        }
    }
}
