package com.redhat.mercury.operator.utils;

public class ResourceUtils {

    public static final String capitalize(Boolean value) {
        if (Boolean.TRUE.equals(value)) {
            return "True";
        }
        return "False";
    }

}
