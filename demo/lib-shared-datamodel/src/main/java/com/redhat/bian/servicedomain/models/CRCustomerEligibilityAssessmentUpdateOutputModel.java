package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerEligibilityAssessmentUpdateOutputModel
 */
public class CRCustomerEligibilityAssessmentUpdateOutputModel   {
  private CRCustomerEligibilityAssessmentUpdateInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private String customerEligibilityAssessmentUpdateActionTaskReference = null;

  private Object customerEligibilityAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerEligibilityAssessmentUpdateActionTaskReference
  **/

  public String getCustomerEligibilityAssessmentUpdateActionTaskReference() {
    return customerEligibilityAssessmentUpdateActionTaskReference;
  }

  public void setCustomerEligibilityAssessmentUpdateActionTaskReference(String customerEligibilityAssessmentUpdateActionTaskReference) {
    this.customerEligibilityAssessmentUpdateActionTaskReference = customerEligibilityAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

