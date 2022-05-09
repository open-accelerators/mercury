package com.redhat.mercury.model.state;

public class ControlRecordState {

    public enum ControlRecordStateType {
        INSTANTIATION,
        INVOCATION
    }

    // Instantiation States

    // Resourcing
    public static final String UNASSIGNED = "Unassigned";
    public static final String ASSIGNED = "Assigned";
    public static final String CHARTERED = "Chartered";

    // Subject Qualification
    public static final String PRESENT = "Present";
    public static final String RECOGNIZED = "Recognized";
    public static final String CLASSIFIED = "Classified";

    // Arrangement
    public static final String ELIGIBLE = "Eligible";
    public static final String INITIALIZED = "Initialized";
    public static final String IN_FORCE = "In-Force";
    public static final String RESTRICTED = "Restricted";
    public static final String CLOSING = "Closing";
    public static final String DORMANT = "Dormant";

    // Invocation States

    // Intelligence Deployed & Applied
    public static final String SOUGHT = "Sought";
    public static final String DEFINED = "Defined";
    public static final String SPECIFIED = "Specified";
    public static final String IMPLEMENTED = "Implemented";
    public static final String CERTIFIED = "Certified";
    public static final String DEPLOYED = "Deployed";
    public static final String CONSOLIDATED = "Consolidated";
    public static final String APPLIED = "Applied";
    public static final String PUBLISHED = "Published";
    public static final String QUALIFIED = "Qualified";
    public static final String RETIRED = "Retired";

    // Work Performance
    public static final String AVAILABLE = "Available";
    public static final String INITIATED = "Initiated";
    public static final String PROCESSING = "Processing";
    public static final String ENGAGED = "Engaged";
    public static final String INTERRUPTED = "Interrupted";
    public static final String COMPLETED = "Completed";

    private ControlRecordState() {
    }
}
