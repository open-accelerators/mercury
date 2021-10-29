package com.redhat.mercury.constants;

public final class BianCloudEvent {

    public static final String CE_TYPE_PREFIX = "org.bian.";

    public static final String CE_EXCEPTION_TYPE = "com.redhat.mercury.exception";

    public static final String CE_CR_REF = "biancrref";
    public static final String CE_SD_REF = "biansdref";
    public static final String CE_BQ_REF = "bianbqref";
    public static final String CE_ACTION = "bianaction";

    public static final String CE_ACTION_QUERY = "query";
    public static final String CE_ACTION_COMMAND = "command";
    public static final String CE_ACTION_RESPONSE = "response";

    private BianCloudEvent() {
    }
}
