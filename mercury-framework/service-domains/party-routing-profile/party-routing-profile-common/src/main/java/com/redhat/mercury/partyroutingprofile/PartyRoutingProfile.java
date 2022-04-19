package com.redhat.mercury.partyroutingprofile;

import static com.redhat.mercury.Constants.CHANNEL_DELIMITER;

public final class PartyRoutingProfile {

    public static final String DOMAIN_NAME = "party-routing-profile";

    public static final String CR_PARTY_STATE = "partystate";
    public static final String BQ_ALERT = "alert";
    public static final String BQ_RATING = "rating";
    public static final String BQ_STATUS = "status";

    // Message Channels
    public static final String CHANNEL_SD_PARTY_ROUTING_PROFILE = DOMAIN_NAME;
    public static final String CHANNEL_CR_PARTY_STATE = DOMAIN_NAME + CHANNEL_DELIMITER + CR_PARTY_STATE;
    public static final String CHANNEL_BQ_ALERT = CHANNEL_CR_PARTY_STATE + CHANNEL_DELIMITER + BQ_ALERT;
    public static final String CHANNEL_BQ_RATING = CHANNEL_CR_PARTY_STATE + CHANNEL_DELIMITER + BQ_RATING;
    public static final String CHANNEL_BQ_STATUS = CHANNEL_CR_PARTY_STATE + CHANNEL_DELIMITER + BQ_STATUS;

    private PartyRoutingProfile() {
    }
}
