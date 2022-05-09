package com.redhat.mercury.myco.services.messaging;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.model.state.CRStateNotification;

import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.MutinyEmitter;
import io.smallrye.reactive.messaging.annotations.Broadcast;

@ApplicationScoped
public class CustomerOfferProcedureNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferProcedureNotificationService.class);

    @Channel(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE)
    @Broadcast
    MutinyEmitter<CRStateNotification> emitter;

    public Uni<Void> send(CRStateNotification notification) {
        LOGGER.info("Sending notification {} to channel {}", notification, CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE);
        return emitter.send(notification);
    }
}
