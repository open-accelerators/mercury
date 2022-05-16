package com.redhat.mercury.exampledomain.v10.client;

import javax.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ExampleDomainClientTest {
    
    @Inject
    ExampleDomainClient client;
    
    @Test
    void testClient() {
        assertNotNull(client);
        assertNotNull(client.getCrExampleService());
    }
}