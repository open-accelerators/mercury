package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask
 */
public class CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask   {
  private String customerOfferProcessingTaskType = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of task performed (each BQ constitutes an optional task instance) 
   * @return customerOfferProcessingTaskType
  **/

  public String getCustomerOfferProcessingTaskType() {
    return customerOfferProcessingTaskType;
  }

  public void setCustomerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
    this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in completing the offer task 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

