package com.redhat.mercury.customeroffer.events;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.events.BianNotificationHandler;
import com.redhat.mercury.exceptions.DataTransformationException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.arc.Unremovable;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
@Unremovable
public class CustomerOfferInitiatedHandler implements BianNotificationHandler {

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public String getType() {
        return CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE;
    }

    @Override
    public Uni<Message> onEvent(CloudEvent event) throws DataTransformationException {
        try {
            return notificationService.onCustomerOfferInitiated(event.getProtoData().unpack(CustomerOfferNotification.class));
        } catch (InvalidProtocolBufferException e) {
            throw new DataTransformationException("Unable to convert to CustomerOfferNotification", e);
        }
    }
}
