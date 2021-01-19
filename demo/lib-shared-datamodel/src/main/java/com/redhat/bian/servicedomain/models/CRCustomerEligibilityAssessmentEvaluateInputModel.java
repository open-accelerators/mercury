package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerEligibilityAssessmentEvaluateInputModel
 */
public class CRCustomerEligibilityAssessmentEvaluateInputModel   {
  private String customerProductServiceEligibilityServicingSessionReference = null;

  private Object customerEligibilityAssessmentEvaluateActionRecord = null;

  private String customerEligibilityAssessmentInstanceStatus = null;

  private CRCustomerEligibilityAssessmentEvaluateInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return customerEligibilityAssessmentEvaluateActionRecord
  **/

  public Object getCustomerEligibilityAssessmentEvaluateActionRecord() {
    return customerEligibilityAssessmentEvaluateActionRecord;
  }

  public void setCustomerEligibilityAssessmentEvaluateActionRecord(Object customerEligibilityAssessmentEvaluateActionRecord) {
    this.customerEligibilityAssessmentEvaluateActionRecord = customerEligibilityAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Eligibility Assessment instance (e.g. initialised, pending, active) 
   * @return customerEligibilityAssessmentInstanceStatus
  **/

  public String getCustomerEligibilityAssessmentInstanceStatus() {
    return customerEligibilityAssessmentInstanceStatus;
  }

  public void setCustomerEligibilityAssessmentInstanceStatus(String customerEligibilityAssessmentInstanceStatus) {
    this.customerEligibilityAssessmentInstanceStatus = customerEligibilityAssessmentInstanceStatus;
  }


  /**
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public CRCustomerEligibilityAssessmentEvaluateInputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentEvaluateInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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


}

