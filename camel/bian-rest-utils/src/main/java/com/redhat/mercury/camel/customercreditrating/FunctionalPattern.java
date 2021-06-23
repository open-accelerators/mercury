package com.redhat.mercury.camel.customercreditrating;

public enum FunctionalPattern {
    
    State("/customer-credit-rating-state");

    public final String path;

    FunctionalPattern(String path) {
        this.path = path;
    }
}
