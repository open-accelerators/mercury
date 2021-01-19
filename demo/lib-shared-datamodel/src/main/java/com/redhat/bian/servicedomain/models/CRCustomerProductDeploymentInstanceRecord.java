package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord
 */
public class CRCustomerProductDeploymentInstanceRecord   {
  private String customerReference = null;

  private String productType = null;

  private String status;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

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

