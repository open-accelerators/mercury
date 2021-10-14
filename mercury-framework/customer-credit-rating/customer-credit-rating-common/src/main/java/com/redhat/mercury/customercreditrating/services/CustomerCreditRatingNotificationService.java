package com.redhat.mercury.customercreditrating.services;

import org.bian.protobuf.customercreditrating.RatingEvent;

public abstract class CustomerCreditRatingNotificationService {

    public void onCreditRatingStateEvent(RatingEvent event) {}

    //TODO: Implement other events
}
