package com.redhat.mercury.camel;

public enum ServiceDomain {

    CustomerCreditRating("customer-credit-rating"), 
    CustomerOffer("customer-offer");

    public final String path;

    ServiceDomain(String path) {
        this.path = path;
    }

}
