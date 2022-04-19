package com.redhat.mercury.customercreditrating;

import static com.redhat.mercury.Constants.CHANNEL_DELIMITER;

public final class CustomerCreditRating {

    public static final String DOMAIN_NAME = "customer-credit-rating";

    public static final String CR_CUSTOMER_CREDIT_RATING_STATE = "customercreditratingstate";
    public static final String BQ_ALERTS = "alerts";
    public static final String BQ_EXTERNAL_REPORTING = "externalreporting";
    public static final String BQ_INTERNAL_REPORTING = "internalreporting";

    public static final String CHANNEL_SD_CUSTOMER_CREDIT_RATING = DOMAIN_NAME;
    public static final String CHANNEL_CR_CUSTOMER_CREDIT_RATING_STATE = DOMAIN_NAME + CHANNEL_DELIMITER + CR_CUSTOMER_CREDIT_RATING_STATE;
    public static final String CHANNEL_BQ_ALERTS = CHANNEL_CR_CUSTOMER_CREDIT_RATING_STATE + CHANNEL_DELIMITER + BQ_ALERTS;
    public static final String CHANNEL_BQ_EXTERNAL_REPORTING = CHANNEL_CR_CUSTOMER_CREDIT_RATING_STATE + CHANNEL_DELIMITER + BQ_EXTERNAL_REPORTING;
    public static final String CHANNEL_BQ_INTERNAL_REPORTING = CHANNEL_CR_CUSTOMER_CREDIT_RATING_STATE + CHANNEL_DELIMITER + BQ_INTERNAL_REPORTING;

    private CustomerCreditRating() {
    }
}
