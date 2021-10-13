package com.redhat.mercury.customeroffer.services.impl;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;

import com.google.protobuf.Any;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class CustomerOfferNotificationServiceImpl extends CustomerOfferNotificationService {

    @GrpcClient
    OutboundBindingService outbound;

    @Override
    public void onCustomerOfferInitiated(CustomerOfferNotification notification) {
        onCustomerOfferEvent(notification, CustomerOffer.CUSTOMER_OFFER_INITIATED);
    }

    @Override
    public void onCustomerOfferCompleted(CustomerOfferNotification notification) {
        onCustomerOfferEvent(notification, CustomerOffer.CUSTOMER_OFFER_COMPLETED);
    }

    private void onCustomerOfferEvent(CustomerOfferNotification notification, String eventType) {
        outbound.notify(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                .setSource(CustomerOffer.DOMAIN_NAME)
                .setType(eventType)
                .setProtoData(Any.pack(notification))
                .build());
    }
}
