package com.redhat.customereligibility;

import java.io.Serializable;
import java.util.Date;
/*
    Customer Eligibility Hibernate Model
 */
public class CustomerEligibilityCRModel implements Serializable {


    private String customerReference;
    private String productServiceType;
    private String customerProductServiceTypeEligibility;
    private Date eligibilityDate;
    private String crNumber;

    public String getCrNumber() {
        return crNumber;
    }

    public void setCrNumber(String crNumber) {
        this.crNumber = crNumber;
    }



    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getProductServiceType() {
        return productServiceType;
    }

    public void setProductServiceType(String productServiceType) {
        this.productServiceType = productServiceType;
    }

    public Date getEligibilityDate() {
        return eligibilityDate;
    }

    public void setEligibilityDate(Date eligibilityDate) {
        this.eligibilityDate = eligibilityDate;
    }

    public String getCustomerProductServiceTypeEligibility() {
        return customerProductServiceTypeEligibility;
    }

    public void setCustomerProductServiceTypeEligibility(String customerProductServiceTypeEligibility) {
        this.customerProductServiceTypeEligibility = customerProductServiceTypeEligibility;
    }
}
