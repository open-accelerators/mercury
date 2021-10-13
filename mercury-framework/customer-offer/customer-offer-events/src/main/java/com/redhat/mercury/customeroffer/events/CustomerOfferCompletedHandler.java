package com.redhat.mercury.customeroffer.events;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.events.BianNotificationHandler;
import com.redhat.mercury.exceptions.DataTransformationException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.arc.Unremovable;

@ApplicationScoped
@Unremovable
public class CustomerOfferCompletedHandler implements BianNotificationHandler {

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public String getType() {
        return CustomerOffer.CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE;
    }

    @Override
    public void onEvent(CloudEvent event) throws DataTransformationException {
        try {
            notificationService.onCustomerOfferCompleted(event.getProtoData().unpack(CustomerOfferNotification.class));
        } catch (InvalidProtocolBufferException e) {
            throw new DataTransformationException("Unable to convert to CustomerOfferNotification", e);
        }
    }
}
