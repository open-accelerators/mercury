package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRetrieveInputModel
 */
public class BQSalesandMarketingRetrieveInputModel   {
  private Object salesandMarketingRetrieveActionTaskRecord = null;

  private String salesandMarketingRetrieveActionRequest = null;

  private BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport = null;

  private BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return salesandMarketingRetrieveActionTaskRecord
  **/

  public Object getSalesandMarketingRetrieveActionTaskRecord() {
    return salesandMarketingRetrieveActionTaskRecord;
  }

  public void setSalesandMarketingRetrieveActionTaskRecord(Object salesandMarketingRetrieveActionTaskRecord) {
    this.salesandMarketingRetrieveActionTaskRecord = salesandMarketingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return salesandMarketingRetrieveActionRequest
  **/

  public String getSalesandMarketingRetrieveActionRequest() {
    return salesandMarketingRetrieveActionRequest;
  }

  public void setSalesandMarketingRetrieveActionRequest(String salesandMarketingRetrieveActionRequest) {
    this.salesandMarketingRetrieveActionRequest = salesandMarketingRetrieveActionRequest;
  }


  /**
   * Get salesandMarketingInstanceReport
   * @return salesandMarketingInstanceReport
  **/

  public BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport getSalesandMarketingInstanceReport() {
    return salesandMarketingInstanceReport;
  }

  public void setSalesandMarketingInstanceReport(BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport) {
    this.salesandMarketingInstanceReport = salesandMarketingInstanceReport;
  }


  /**
   * Get salesandMarketingInstanceAnalysis
   * @return salesandMarketingInstanceAnalysis
  **/

  public BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis getSalesandMarketingInstanceAnalysis() {
    return salesandMarketingInstanceAnalysis;
  }

  public void setSalesandMarketingInstanceAnalysis(BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis) {
    this.salesandMarketingInstanceAnalysis = salesandMarketingInstanceAnalysis;
  }


}

