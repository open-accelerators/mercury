package com.redhat.mercury.myprp.model;

public class PartyRoutingState {

    String status;
    String processId;

    public String getStatus() {
        return status;
    }

    public PartyRoutingState setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getProcessId() {
        return processId;
    }

    public PartyRoutingState setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
}
