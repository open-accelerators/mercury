package com.redhat.mercury.operator.utils;

import com.redhat.mercury.operator.model.ApiVersion;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ResourceUtils {
    private static final Map<ApiVersion, ApiVersionPair> apiVersionMap = Map.of(ApiVersion.v1, new ApiVersionPair("v10", "v1"));

    private ResourceUtils() {
    }

    public static final String toStatus(Boolean value) {
        if (Boolean.TRUE.equals(value)) {
            return "True";
        }
        return "False";
    }

    public static String now() {
        return ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
    }

    public static String toLowerHyphen(String text) {
        if (text == null || text.isBlank()) {
            return text;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
                if (i != 0) {
                    result.append("-");
                }
            }
            result.append(c);
        }
        return result.toString();
    }

    public static String getOpenApiVersion(ApiVersion apiVersion){
        final ApiVersionPair apiVersionPair = apiVersionMap.get(apiVersion);
        return apiVersionPair != null ? apiVersionPair.getOpenApiVersion() : null;
    }

    public static String getDirectVersion(ApiVersion apiVersion){
        final ApiVersionPair apiVersionPair = apiVersionMap.get(apiVersion);
        return apiVersionPair != null ? apiVersionPair.getDirectVersion() : null;
    }

    private static class ApiVersionPair{
        private final String openApiVersion;
        private final String directVersion;

        public ApiVersionPair(String openApiVersion, String directVersion) {
            this.openApiVersion = openApiVersion;
            this.directVersion = directVersion;
        }

        public String getOpenApiVersion() {
            return openApiVersion;
        }

        public String getDirectVersion() {
            return directVersion;
        }
    }
}
