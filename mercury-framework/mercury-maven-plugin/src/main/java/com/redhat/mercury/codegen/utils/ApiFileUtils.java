package com.redhat.mercury.codegen.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.redhat.mercury.codegen.model.GrpcService;

public class ApiFileUtils {

    private ApiFileUtils() {
    }

    public static GrpcService readApiFile(File apiDir, String file, String sdName) throws IOException {
        try (Scanner s = new Scanner(apiDir.toPath().resolve(file))) {
            String pkg = null, svc = null;
            while (s.hasNextLine()) {
                String line = s.nextLine();
                Matcher pkgMatcher = Pattern.compile("package (.*);").matcher(line);
                if (pkgMatcher.matches()) {
                    pkg = pkgMatcher.toMatchResult().group(1);
                }
                Matcher svcMatcher = Pattern.compile("service (.*) \\{").matcher(line);
                if (svcMatcher.matches()) {
                    svc = svcMatcher.toMatchResult().group(1);
                }
            }
            if (pkg != null && svc != null) {
                return new GrpcService(svc, pkg, file.split("\\.")[0], sdName);
            }
        }
        throw new IllegalArgumentException("The file doesn't contain the expected package and service");
    }
}
