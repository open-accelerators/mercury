package com.redhat.mercury.myprp.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.smallrye.mutiny.Uni;

import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.COMPLETED_STATUS;
import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.INITIATED_STATUS;


@ApplicationScoped
public class CustomerOfferEventHandler extends CustomerOfferNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferEventHandler.class);

    @Inject
    PartyRoutingService svc;

    @Override
    public Uni<Void> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        LOGGER.info("received onCustomerOfferInitiated {}", notification);
        return Uni.createFrom()
                .voidItem()
                .invoke(() -> svc.updatePartyRoutingState(INITIATED_STATUS, notification.getCustomerOfferReference().getId()));
    }

    @Override
    public Uni<Void> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        LOGGER.info("received onCustomerOfferCompleted {}", notification);
        return Uni.createFrom()
                .voidItem()
                .invoke(() -> svc.updatePartyRoutingState(COMPLETED_STATUS, notification.getCustomerOfferReference().getId()));
    }

}
