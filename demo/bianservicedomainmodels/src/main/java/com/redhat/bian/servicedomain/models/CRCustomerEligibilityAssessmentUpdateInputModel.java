package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerEligibilityAssessmentUpdateInputModel
 */
public class CRCustomerEligibilityAssessmentUpdateInputModel   {
  private String customerProductServiceEligibilityServicingSessionReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private CRCustomerEligibilityAssessmentUpdateInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private Object customerEligibilityAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerProductServiceEligibilityServicingSessionReference
  **/

  public String getCustomerProductServiceEligibilityServicingSessionReference() {
    return customerProductServiceEligibilityServicingSessionReference;
  }

  public void setCustomerProductServiceEligibilityServicingSessionReference(String customerProductServiceEligibilityServicingSessionReference) {
    this.customerProductServiceEligibilityServicingSessionReference = customerProductServiceEligibilityServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Eligibility Assessment instance 
   * @return customerEligibilityAssessmentInstanceReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(String customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
  }


  /**
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public CRCustomerEligibilityAssessmentUpdateInputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentUpdateInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
    this.customerEligibilityAssessmentInstanceRecord = customerEligibilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time of the assessment 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerEligibilityAssessmentUpdateActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentUpdateActionTaskRecord() {
    return customerEligibilityAssessmentUpdateActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentUpdateActionTaskRecord(Object customerEligibilityAssessmentUpdateActionTaskRecord) {
    this.customerEligibilityAssessmentUpdateActionTaskRecord = customerEligibilityAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

