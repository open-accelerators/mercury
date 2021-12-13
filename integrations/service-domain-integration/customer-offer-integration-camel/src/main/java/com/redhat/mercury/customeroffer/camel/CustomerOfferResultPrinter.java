package com.redhat.mercury.customeroffer.camel;

import com.google.protobuf.InvalidProtocolBufferException;
import com.redhat.mercury.camel.CloudEventPrinter;
import com.redhat.mercury.customeroffer.CustomerOffer;

import org.bian.protobuf.customeroffer.CustomerOfferProcedure;
import org.bian.protobuf.customeroffer.SDCustomerOffer;

import io.cloudevents.v1.proto.CloudEvent;

public class CustomerOfferResultPrinter extends CloudEventPrinter {

    @Override
    public String toJson(CloudEvent event) throws InvalidProtocolBufferException {
        switch(event.getType()) {
            case CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE:
                return print(event, CustomerOfferProcedure.class);
            case CustomerOffer.CUSTOMER_OFFER_RETRIEVE_TYPE:
                return print(event, SDCustomerOffer.class);
        }
        return null;
    }

}
