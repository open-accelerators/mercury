package com.redhat.bian.servicedomain.models;



/**
 * BQSalesandMarketingRetrieveOutputModel
 */
public class BQSalesandMarketingRetrieveOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private String salesandMarketingRetrieveActionTaskReference = null;

  private Object salesandMarketingRetrieveActionTaskRecord = null;

  private String salesandMarketingRetrieveActionResponse = null;

  private BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport = null;

  private BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis = null;


  /**
   * Get productDirectoryEntryInstanceRecord
   * @return productDirectoryEntryInstanceRecord
  **/

  public CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord getProductDirectoryEntryInstanceRecord() {
    return productDirectoryEntryInstanceRecord;
  }

  public void setProductDirectoryEntryInstanceRecord(CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord) {
    this.productDirectoryEntryInstanceRecord = productDirectoryEntryInstanceRecord;
  }


  /**
   * Get salesandMarketingInstanceRecord
   * @return salesandMarketingInstanceRecord
  **/

  public BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord getSalesandMarketingInstanceRecord() {
    return salesandMarketingInstanceRecord;
  }

  public void setSalesandMarketingInstanceRecord(BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord) {
    this.salesandMarketingInstanceRecord = salesandMarketingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales and Marketing instance retrieve service call 
   * @return salesandMarketingRetrieveActionTaskReference
  **/

  public String getSalesandMarketingRetrieveActionTaskReference() {
    return salesandMarketingRetrieveActionTaskReference;
  }

  public void setSalesandMarketingRetrieveActionTaskReference(String salesandMarketingRetrieveActionTaskReference) {
    this.salesandMarketingRetrieveActionTaskReference = salesandMarketingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return salesandMarketingRetrieveActionResponse
  **/

  public String getSalesandMarketingRetrieveActionResponse() {
    return salesandMarketingRetrieveActionResponse;
  }

  public void setSalesandMarketingRetrieveActionResponse(String salesandMarketingRetrieveActionResponse) {
    this.salesandMarketingRetrieveActionResponse = salesandMarketingRetrieveActionResponse;
  }


  /**
   * Get salesandMarketingInstanceReport
   * @return salesandMarketingInstanceReport
  **/

  public BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport getSalesandMarketingInstanceReport() {
    return salesandMarketingInstanceReport;
  }

  public void setSalesandMarketingInstanceReport(BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport) {
    this.salesandMarketingInstanceReport = salesandMarketingInstanceReport;
  }


  /**
   * Get salesandMarketingInstanceAnalysis
   * @return salesandMarketingInstanceAnalysis
  **/

  public BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis getSalesandMarketingInstanceAnalysis() {
    return salesandMarketingInstanceAnalysis;
  }

  public void setSalesandMarketingInstanceAnalysis(BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis) {
    this.salesandMarketingInstanceAnalysis = salesandMarketingInstanceAnalysis;
  }


}

