package com.redhat.mercury.exceptions;

public class MappingNotFoundException extends Exception {

    public MappingNotFoundException(String cloudEventType) {
        super("Mapping not found for CloudEvent type: " + cloudEventType);
    }
}
