package ${package}.${sdNameLowerCase}.services.impl;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import ${package}.${sdNameLowerCase}.services.${sdName}Service;
import ${package}.${sdNameLowerCase}.services.client.${sdName}Client;

import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ${sdName}BindingServiceImplTest {

    @Inject
    ${sdName}Client client;

    @Inject
    ${sdName}Service service;

    @Test
    void testInjection() {
        assertThat(client).isNotNull();
        assertThat(service).isNotNull();
    }
}
