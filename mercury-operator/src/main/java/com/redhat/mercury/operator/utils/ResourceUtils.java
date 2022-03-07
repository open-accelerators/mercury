package com.redhat.mercury.operator.utils;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ResourceUtils {

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
}
