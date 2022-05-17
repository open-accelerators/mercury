package com.redhat.mercury.myprp.model;

public class PartyRoutingState {

    String status;
    String referenceId;

    public String getStatus() {
        return status;
    }

    public PartyRoutingState setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public PartyRoutingState setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
}
