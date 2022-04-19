package com.redhat.mercury.model.state;

public class ServiceDomainState {

    public enum ServiceDomainStateType {
        REPORTING,
        OPERATION
    }

    // Reporting
    public static final String RUNNING = "Running";
    public static final String SUBSCRIBED = "Subscribed";
    public static final String REPORTED = "Reported";

    // Operation
    public static final String INACTIVE = "Inactive";
    public static final String ACTIVE = "Active";
    public static final String CONSTRAINED = "Constrained";
    public static final String ENDING = "Ending";

    private ServiceDomainState() {
    }
}
