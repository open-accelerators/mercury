package com.redhat.mercury.model;

import com.google.inject.Inject;
import com.redhat.mercury.resources.StringFormatter;

public class FuntionalPattern {

    @Inject
    StringFormatter formatter;

    String firstNotCap;
    String firstCap;
    String withSD;
    String withGet;

    public FuntionalPattern(String fullFilename, String sd) {
        String[] fileName = fullFilename.split("_", 2);
        this.firstNotCap = fileName[0] + formatter.capitalizeWord(fileName[1].replace("_", " "));
        this.firstCap = fileName[0].toUpperCase() + formatter.capitalizeWord(fileName[1].replace("_", " "));
        this.withSD = sd + "-" + fullFilename.replace("_", "-").replace("-service", "");
        this.withGet = "get" + formatter.capitalizeWord(firstNotCap);
    }

    public String getFirstNotCap() {
        return firstNotCap;
    }

    public String getFirstCap() {
        return firstCap;
    }

    public String getWithSD() {
        return withSD;
    }

    public String getWithGet() {
        return withGet;
    }
}
