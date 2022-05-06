package com.redhat.mercury.codegen.mojo;

import org.apache.maven.it.Verifier;
import org.junit.jupiter.api.Test;

class GrpcClientMojoTest {

    private static final String JAVA_FILE = "ExampleDomainClient.java";
    private static final String GENERATED_JAVA_FILE = "target/generated-sources/mercury/com/redhat/mercury/exampledomain/v10/client/" + JAVA_FILE;
    private static final String APPLICATION_PROPERTIES_FILE = "application.properties";
    private static final String APPLICATION_PROPERTIES_PATH_FILE = "target/generated-sources/mercury/" + APPLICATION_PROPERTIES_FILE;

    @Test
    void testGrpcClientGoal() throws Exception {
        MojoVerifier mojoVerifier = new MojoVerifier("/example-client");

        Verifier verifier = mojoVerifier.getVerifier();
        try {
            verifier.executeGoal("compile");
        } catch (Exception e) {
            // ignore compilation exception
        }
        mojoVerifier.assertFile(JAVA_FILE, GENERATED_JAVA_FILE);
        mojoVerifier.assertFile(APPLICATION_PROPERTIES_FILE, APPLICATION_PROPERTIES_PATH_FILE);
        verifier.resetStreams();
    }
}
