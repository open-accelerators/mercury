package com.redhat.mercury.codegen.client.resources;

public class StringFormatter {

    private StringFormatter() {
        throw new UnsupportedOperationException("This StringFormatter class cannot be instantiated");
    }

    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s");
        StringBuilder capitalizeWord = new StringBuilder();
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterFirst = w.substring(1);
            capitalizeWord.append(first.toUpperCase() + afterFirst);
        }
        return capitalizeWord.toString();
    }
    
}
