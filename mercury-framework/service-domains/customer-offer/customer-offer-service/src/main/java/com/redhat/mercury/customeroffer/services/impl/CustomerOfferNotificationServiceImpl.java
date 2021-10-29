package com.redhat.mercury.customeroffer.services.impl;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class CustomerOfferNotificationServiceImpl extends CustomerOfferNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferNotificationServiceImpl.class);

    @GrpcClient("outboundBindingService")
    OutboundBindingService outbound;

    @Override
    public Uni<Message> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        return onCustomerOfferEvent(notification, CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE);
    }

    @Override
    public Uni<Message> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        return onCustomerOfferEvent(notification, CustomerOffer.CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE);
    }


    private Uni<Message> onCustomerOfferEvent(CustomerOfferNotification notification, String eventType) {
        LOGGER.info("Notify CustomerOffer type: {} - Event: {}", eventType, notification);
        return outbound.notify(CloudEvent.newBuilder().setId(UUID.randomUUID().toString())
                        .setSource(CustomerOffer.DOMAIN_NAME)
                        .setType(eventType)
                        .setProtoData(Any.pack(notification))
                        .build())
                .onItem()
                .transform(x -> null);
    }
}
