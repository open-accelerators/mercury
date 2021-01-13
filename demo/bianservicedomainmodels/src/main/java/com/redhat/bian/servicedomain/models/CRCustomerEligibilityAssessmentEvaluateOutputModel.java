package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerEligibilityAssessmentEvaluateOutputModel
 */
public class CRCustomerEligibilityAssessmentEvaluateOutputModel   {
  private String customerEligibilityAssessmentInstanceReference = null;

  private String customerEligibilityAssessmentEvaluateActionReference = null;

  private Object customerEligibilityAssessmentEvaluateActionRecord = null;

  private String customerEligibilityAssessmentInstanceStatus = null;

  private CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return customerEligibilityAssessmentEvaluateActionReference
  **/

  public String getCustomerEligibilityAssessmentEvaluateActionReference() {
    return customerEligibilityAssessmentEvaluateActionReference;
  }

  public void setCustomerEligibilityAssessmentEvaluateActionReference(String customerEligibilityAssessmentEvaluateActionReference) {
    this.customerEligibilityAssessmentEvaluateActionReference = customerEligibilityAssessmentEvaluateActionReference;
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

  public CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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

