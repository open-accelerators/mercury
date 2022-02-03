package ${package}.${sdNameLowerCase}.services.impl;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import ${package}.${sdNameLowerCase}.v10.client.${sdName}Client;

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ${sdName}ServiceImplTest {

    @Inject
    ${sdName}Client client;


    @Test
    void testInjection() {
        assertThat(client).isNotNull();
    }
}
