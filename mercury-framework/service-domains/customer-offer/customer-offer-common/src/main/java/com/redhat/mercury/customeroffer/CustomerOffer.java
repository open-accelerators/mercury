package com.redhat.mercury.customeroffer;

public final class CustomerOffer {

    public static final String DOMAIN_NAME = "customer-offer";

    // QUERIES
    public static final String CUSTOMER_OFFER_RETRIEVE_TYPE = "org.bian.customeroffer.retrieve";
    public static final String CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE = "org.bian.customeroffer.procedure.retrieve";
    // TODO: Implement

    // COMMANDS
    public static final String CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE = "org.bian.customeroffer.procedure.initiation";
    public static final String CUSTOMER_OFFER_PROCEDURE_UPDATE_TYPE = "org.bian.customeroffer.procedure.update";
    // TODO: Implement

    // EVENTS
    //TODO: Only for demo. Implement appropriately
    public static final String CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE = "org.bian.customeroffer.procedure.initiated";
    public static final String CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE = "org.bian.customeroffer.procedure.completed";

    private CustomerOffer() {
    }
}
