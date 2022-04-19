package com.redhat.mercury.customeroffer;

import static com.redhat.mercury.Constants.CHANNEL_DELIMITER;

public final class CustomerOffer {

    public static final String DOMAIN_NAME = "customeroffer";

    public static final String CR_CUSTOMER_OFFER_PROCEDURE = "customerofferprocedure";
    public static final String BQ_AGREEMENT = "agreement";
    public static final String BQ_AUDIT = "audit";
    public static final String BQ_BOOKING = "booking";
    public static final String BQ_COLLATERAL = "collateral";
    public static final String BQ_COMPLIANCE = "compliance";
    public static final String BQ_CORRESPONDENCEAND_DOCUMENTS = "correspondenceanddocuments";
    public static final String BQ_CREDIT = "credit";
    public static final String BQ_DISCLOSURES = "disclosures";
    public static final String BQ_FACILITY_APPLICATION = "facilityapplication";
    public static final String BQ_PRODUCT_INITIALIZATION = "productinitialization";
    public static final String BQ_UNDERWRITING = "underwriting";
    
    // Message Channels
    public static final String CHANNEL_SD_CUSTOMER_OFFER = DOMAIN_NAME;
    public static final String CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE = DOMAIN_NAME + CHANNEL_DELIMITER + CR_CUSTOMER_OFFER_PROCEDURE;
    public static final String CHANNEL_BQ_AGREEMENT = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_AGREEMENT;
    public static final String CHANNEL_BQ_AUDIT = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_AUDIT;
    public static final String CHANNEL_BQ_BOOKING = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_BOOKING;
    public static final String CHANNEL_BQ_COLLATERAL = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_COLLATERAL;
    public static final String CHANNEL_BQ_COMPLIANCE = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_COMPLIANCE;
    public static final String CHANNEL_BQ_CORRESPONDENCEAND_DOCUMENTS = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_CORRESPONDENCEAND_DOCUMENTS;
    public static final String CHANNEL_BQ_CREDIT = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_CREDIT;
    public static final String CHANNEL_BQ_DISCLOSURES = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_DISCLOSURES;
    public static final String CHANNEL_BQ_FACILITY_APPLICATION = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_FACILITY_APPLICATION;
    public static final String CHANNEL_BQ_PRODUCT_INITIALIZATION = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_PRODUCT_INITIALIZATION;
    public static final String CHANNEL_BQ_UNDERWRITING = CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE + CHANNEL_DELIMITER + BQ_UNDERWRITING;
    
    private CustomerOffer() {
    }
}
