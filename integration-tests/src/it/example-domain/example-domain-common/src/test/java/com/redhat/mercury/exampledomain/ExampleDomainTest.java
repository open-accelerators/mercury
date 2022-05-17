package com.redhat.mercury.exampledomain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleDomainTest {
    
    @Test
    void testValidateConstants() {
        assertEquals("exampledomain", ExampleDomain.DOMAIN_NAME);
        assertEquals("exampledomain", ExampleDomain.CHANNEL_EXAMPLE_DOMAIN);
        assertEquals("exampledomain-crexample", ExampleDomain.CHANNEL_CR_EXAMPLE);
    }
}