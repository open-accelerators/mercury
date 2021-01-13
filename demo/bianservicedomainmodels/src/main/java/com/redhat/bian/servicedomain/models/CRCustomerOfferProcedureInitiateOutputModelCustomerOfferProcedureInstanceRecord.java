package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord   {
  private String customerOfferProcessingSchedule = null;

  private CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties 
   * @return customerOfferProcessingSchedule
  **/

  public String getCustomerOfferProcessingSchedule() {
    return customerOfferProcessingSchedule;
  }

  public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
  }


  /**
   * Get customerOfferProcessingTask
   * @return customerOfferProcessingTask
  **/

  public CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask getCustomerOfferProcessingTask() {
    return customerOfferProcessingTask;
  }

  public void setCustomerOfferProcessingTask(CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
  }


}

