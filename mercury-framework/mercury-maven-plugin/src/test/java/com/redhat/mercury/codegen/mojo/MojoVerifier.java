package com.redhat.mercury.codegen.mojo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.maven.it.VerificationException;
import org.apache.maven.it.Verifier;
import org.apache.maven.it.util.ResourceExtractor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MojoVerifier {

    private File testDir;
    private Verifier verifier;

    public MojoVerifier(String resourcePath) throws VerificationException, IOException {
        this.testDir = ResourceExtractor.simpleExtractResources(getClass(), resourcePath);
        verifier = new Verifier(testDir.getAbsolutePath());
    }

    public Verifier getVerifier() {
        return verifier;
    }

    public void assertFile(String expected, String actual) throws VerificationException {
        verifier.verifyFilePresent(actual);
        List<String> strings = verifier.loadFile(testDir.getPath(), actual, false);

        try (Scanner scanner = new Scanner(this.getClass().getClassLoader().getResourceAsStream("expectations/" + expected))) {
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.trim().isBlank()) {
                    assertEquals(line.trim(), strings.get(i++).trim());
                }
            }
            assertEquals(strings.size(), i);
        }
    }
}
