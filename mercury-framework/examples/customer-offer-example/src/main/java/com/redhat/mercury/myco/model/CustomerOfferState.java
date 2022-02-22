package com.redhat.mercury.myco.model;

public class CustomerOfferState {

    String customerReference;
    String status;
    Integer id;

    public String getCustomerReference() {
        return customerReference;
    }

    public CustomerOfferState setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomerOfferState setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CustomerOfferState setId(Integer id) {
        this.id = id;
        return this;
    }
}
