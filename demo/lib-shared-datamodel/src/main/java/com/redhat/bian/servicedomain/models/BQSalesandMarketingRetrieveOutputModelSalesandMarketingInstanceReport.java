package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport
 */
public class BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport   {
  private Object salesandMarketingInstanceReportRecord = null;

  private String salesandMarketingInstanceReportType = null;

  private String salesandMarketingInstanceReportParameters = null;

  private Object salesandMarketingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return salesandMarketingInstanceReportRecord
  **/

  public Object getSalesandMarketingInstanceReportRecord() {
    return salesandMarketingInstanceReportRecord;
  }

  public void setSalesandMarketingInstanceReportRecord(Object salesandMarketingInstanceReportRecord) {
    this.salesandMarketingInstanceReportRecord = salesandMarketingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return salesandMarketingInstanceReportType
  **/

  public String getSalesandMarketingInstanceReportType() {
    return salesandMarketingInstanceReportType;
  }

  public void setSalesandMarketingInstanceReportType(String salesandMarketingInstanceReportType) {
    this.salesandMarketingInstanceReportType = salesandMarketingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return salesandMarketingInstanceReportParameters
  **/

  public String getSalesandMarketingInstanceReportParameters() {
    return salesandMarketingInstanceReportParameters;
  }

  public void setSalesandMarketingInstanceReportParameters(String salesandMarketingInstanceReportParameters) {
    this.salesandMarketingInstanceReportParameters = salesandMarketingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return salesandMarketingInstanceReport
  **/

  public Object getSalesandMarketingInstanceReport() {
    return salesandMarketingInstanceReport;
  }

  public void setSalesandMarketingInstanceReport(Object salesandMarketingInstanceReport) {
    this.salesandMarketingInstanceReport = salesandMarketingInstanceReport;
  }


}

