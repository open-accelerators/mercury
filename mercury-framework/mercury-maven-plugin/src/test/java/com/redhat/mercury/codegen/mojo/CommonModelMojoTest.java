package com.redhat.mercury.codegen.mojo;

import org.apache.maven.it.Verifier;
import org.junit.jupiter.api.Test;

public class CommonModelMojoTest {

    private static final String JAVA_FILE = "ExampleDomain.java";
    private static final String GENERATED_JAVA_FILE = "target/generated-sources/mercury/com/redhat/mercury/exampledomain/" + JAVA_FILE;
    private static final String CLASS_FILE = "target/classes/com/redhat/mercury/exampledomain/ExampleDomain.class";

    @Test
    public void testCommonModelGoal() throws Exception {
        MojoVerifier mojoVerifier = new MojoVerifier("/example-common");

        Verifier verifier = mojoVerifier.getVerifier();
        try {
            verifier.executeGoal("compile");
        } catch (Exception e) {
            // ignore compilation exception
        }
        mojoVerifier.assertFile(JAVA_FILE, GENERATED_JAVA_FILE);
        verifier.verifyFilePresent(CLASS_FILE);
        
        verifier.verifyErrorFreeLog();
        verifier.resetStreams();
    }
}
