package com.redhat.mercury.myprp.notification;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myprp.services.impl.PartyRoutingService;
import com.redhat.mercury.notification.NotificationSink;

import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.COMPLETED_STATUS;
import static com.redhat.mercury.myprp.services.impl.PartyRoutingService.INITIATED_STATUS;


@ApplicationScoped
public class CustomerOfferProcedureSink implements NotificationSink<CRStateNotification> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferProcedureSink.class);

    @Inject
    PartyRoutingService svc;

    @Override
    @Incoming(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE)
    public void onReceive(CRStateNotification notification) {
        LOGGER.info("received {}", notification);
        switch (notification.getState()) {
            case ControlRecordState.INITIATED:
                svc.updatePartyRoutingState(INITIATED_STATUS, notification.getReferenceId());
                break;
            case ControlRecordState.COMPLETED:
                svc.updatePartyRoutingState(COMPLETED_STATUS, notification.getReferenceId());
                break;
            default:
                LOGGER.warn("Ignore unsupported status with state: {}", notification.getState());
        }
    }

}
