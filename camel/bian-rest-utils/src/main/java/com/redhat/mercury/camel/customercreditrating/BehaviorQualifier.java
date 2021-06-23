package com.redhat.mercury.camel.customercreditrating;

public enum BehaviorQualifier {
    
    Alerts("/alerts"),
    ExternalReporting("/externalreporting"),
    InternalReporting("/internalreporting");

    public final String path;

    BehaviorQualifier(String path) {
        this.path = path;
    }
}
