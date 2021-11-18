package com.redhat.mercury.customeroffer.events;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.common.events.NotificationHandler;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.quarkus.arc.Unremovable;
import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.ce.IncomingCloudEventMetadata;

@ApplicationScoped
@Unremovable
public class CustomerOfferNotificationHandler implements NotificationHandler<CustomerOfferNotification> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferNotificationHandler.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    @Incoming(CustomerOffer.DOMAIN_NAME)
    public Uni<Void> onEvent(Message<CustomerOfferNotification> event) {
        IncomingCloudEventMetadata metadata = event.getMetadata(IncomingCloudEventMetadata.class)
                .orElseThrow(() -> new IllegalArgumentException("Expected a Cloud Event"));
        switch (metadata.getType()) {
            case CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE:
                return notificationService.onCustomerOfferInitiated(event.getPayload()).replaceWithVoid();
            case CustomerOffer.CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE:
                return notificationService.onCustomerOfferCompleted(event.getPayload()).replaceWithVoid();
            default:
                LOGGER.warn("Ignored Unsupported Customer Offer Notification event of type: {}", metadata.getType());
                return Uni.createFrom().voidItem();
        }
    }
}
