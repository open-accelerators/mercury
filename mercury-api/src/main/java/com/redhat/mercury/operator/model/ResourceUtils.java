package com.redhat.mercury.operator.model;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ResourceUtils {

    public static final String capitalize(String value) {
        if (value == null || value.length() == 0) {
            return "";
        }
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    public static final String capitalize(Boolean value) {
        if (Boolean.TRUE.equals(value)) {
            return "True";
        }
        return "False";
    }

    public static String now() {
        return ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
    }

    public static ZonedDateTime fromInstant(String instant) {
        return Instant.parse(instant).atZone(ZoneOffset.UTC);
    }

}
