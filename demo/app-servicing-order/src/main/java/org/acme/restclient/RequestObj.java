package org.acme.restclient;

public class RequestObj {

    private String customerReference;
    private String productType;

    public String getCustomerReference() {

        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
