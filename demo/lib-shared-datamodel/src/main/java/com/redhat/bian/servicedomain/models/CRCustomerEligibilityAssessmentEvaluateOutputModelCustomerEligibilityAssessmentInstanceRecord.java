package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord
 */
public class CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord   {
  private String customerProductServiceTypeEligibility = null;

  private String customerProductServiceTypeUsage = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines if and under what terms a product/service is available to this customer - this detail is maintained by the service domain and referenced by this evaluation 
   * @return customerProductServiceTypeEligibility
  **/

  public String getCustomerProductServiceTypeEligibility() {
    return customerProductServiceTypeEligibility;
  }

  public void setCustomerProductServiceTypeEligibility(String customerProductServiceTypeEligibility) {
    this.customerProductServiceTypeEligibility = customerProductServiceTypeEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the sold/in-force status of a product/service with the customer. Again this detail is maintained by the service domain and referenced by this evaluation 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


}

