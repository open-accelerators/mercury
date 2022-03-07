package com.redhat.mercury.customeroffer.services.impl;

import java.net.URI;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.annotations.Broadcast;
import io.smallrye.reactive.messaging.ce.OutgoingCloudEventMetadata;

@ApplicationScoped
public class CustomerOfferNotificationServiceImpl implements CustomerOfferNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferNotificationServiceImpl.class);

    @Inject
    @Channel(CustomerOffer.DOMAIN_NAME)
    @Broadcast
    Emitter<String> emitter;

    @Override
    public Uni<Empty> onCustomerOfferInitiated(String referenceId) {
        return Uni.createFrom().nullItem().onItem().transform(o -> {
            emitter.send(onCustomerOfferEvent(
                    referenceId,
                    CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE));
            return Empty.getDefaultInstance();
        });
    }

    @Override
    public Uni<Empty> onCustomerOfferCompleted(String referenceId) {
        return Uni.createFrom().nullItem().onItem().transform(o -> {
            emitter.send(onCustomerOfferEvent(
                    referenceId,
                    CustomerOffer.CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE));
            return Empty.getDefaultInstance();
        });
    }

    private Message<String> onCustomerOfferEvent(String referenceId, String eventType) {
        LOGGER.info("Notify CustomerOffer type: {} - Event: {}", eventType, referenceId);
        return Message.of(referenceId)
                .addMetadata(OutgoingCloudEventMetadata.builder()
                        .withSource(URI.create(CustomerOffer.DOMAIN_NAME))
                        .withType(eventType)
                        .build());
    }
}
