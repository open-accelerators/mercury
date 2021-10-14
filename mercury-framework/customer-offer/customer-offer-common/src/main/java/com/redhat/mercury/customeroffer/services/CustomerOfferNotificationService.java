package com.redhat.mercury.customeroffer.services;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

public abstract class CustomerOfferNotificationService {

    public void onCustomerOfferInitiated(CustomerOfferNotification notification) {}

    public void onCustomerOfferCompleted(CustomerOfferNotification notification) {}

    //TODO: Implement other events
}
