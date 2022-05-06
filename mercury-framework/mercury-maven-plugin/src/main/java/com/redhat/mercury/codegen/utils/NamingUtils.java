package com.redhat.mercury.codegen.utils;

public class NamingUtils {

    private static final String CHANNEL_PREFIX = "CHANNEL";
    private static final String UNDERSCORE = "_";
    private static final String DELIMITER = "-";

    private NamingUtils() {
    }

    public static String toChannelId(String serviceDomain, String serviceName) {
        return toPackageName(serviceDomain) +
                DELIMITER +
                toPackageName(serviceName.replace("_", "-")
                        .replace("-service", ""));
    }

    public static String toChannelName(String serviceName) {
        return CHANNEL_PREFIX +
                UNDERSCORE +
                toUpperCase(serviceName.replace("_service", ""));
    }

    public static String toGrpcClient(String serviceDomain, String serviceName) {
        return serviceDomain +
                DELIMITER +
                serviceName.replace("_", "-")
                        .replace("-service", "");
    }

    public static String toGrpcServiceName(String serviceName) {
        String sn = toCamelCase(serviceName);
        if (sn == null) {
            return null;
        }
        char[] chars = sn.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        chars[1] = Character.toUpperCase(chars[1]);
        return new String(chars);
    }

    public static String toPackageName(String str) {
        if (str == null) {
            return null;
        }
        return str.trim()
                .replaceAll("[_\\- ]+", "")
                .toLowerCase();
    }

    public static String toFieldName(String str) {
        String camelCase = toCamelCase(str);
        if (camelCase == null || camelCase.isBlank()) {
            return camelCase;
        }
        char[] chars = camelCase.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        return new String(chars);
    }

    public static String toCamelCase(String str) {
        if (str == null) {
            return null;
        }
        if (str.trim().isBlank()) {
            return "";
        }
        String[] words = str.trim().split("[_\\- ]+");
        StringBuilder capitalizeWord = new StringBuilder();
        for (String w : words) {
            if (!w.isBlank()) {
                String first = w.substring(0, 1);
                String afterFirst = w.substring(1);
                capitalizeWord.append(first.toUpperCase()).append(afterFirst);
            }
        }
        return capitalizeWord.toString();
    }

    public static String toUpperCase(String str) {
        return str.trim()
                .toUpperCase()
                .replaceAll("[\\- ]+", "_");
    }
}
