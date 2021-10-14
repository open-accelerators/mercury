package com.redhat.mercury.myprp.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.COMPLETED_STATUS;
import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.INITIATED_STATUS;


@ApplicationScoped
public class CustomerOfferEventHandler extends CustomerOfferNotificationService {

    @Inject
    PartyRoutingService svc;

    @Override
    public void onCustomerOfferInitiated(CustomerOfferNotification notification) {
        svc.updatePartyRoutingState(INITIATED_STATUS, notification.getCustomerOfferReference().getId());
    }

    @Override
    public void onCustomerOfferCompleted(CustomerOfferNotification notification) {
        svc.updatePartyRoutingState(COMPLETED_STATUS, notification.getCustomerOfferReference().getId());
    }

}
