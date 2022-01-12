package com.redhat.mercury.model;

public class StateChangeNotification {

    private String referenceId;
    private String state;

    public String getReferenceId() {
        return referenceId;
    }

    public StateChangeNotification setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    public String getState() {
        return state;
    }

    public StateChangeNotification setState(String state) {
        this.state = state;
        return this;
    }
}
