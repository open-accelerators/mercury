package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis
 */
public class BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis   {
  private Object salesandMarketingInstanceAnalysisRecord = null;

  private String salesandMarketingInstanceAnalysisReportType = null;

  private String salesandMarketingInstanceAnalysisParameters = null;

  private Object salesandMarketingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return salesandMarketingInstanceAnalysisRecord
  **/

  public Object getSalesandMarketingInstanceAnalysisRecord() {
    return salesandMarketingInstanceAnalysisRecord;
  }

  public void setSalesandMarketingInstanceAnalysisRecord(Object salesandMarketingInstanceAnalysisRecord) {
    this.salesandMarketingInstanceAnalysisRecord = salesandMarketingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return salesandMarketingInstanceAnalysisReportType
  **/

  public String getSalesandMarketingInstanceAnalysisReportType() {
    return salesandMarketingInstanceAnalysisReportType;
  }

  public void setSalesandMarketingInstanceAnalysisReportType(String salesandMarketingInstanceAnalysisReportType) {
    this.salesandMarketingInstanceAnalysisReportType = salesandMarketingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return salesandMarketingInstanceAnalysisParameters
  **/

  public String getSalesandMarketingInstanceAnalysisParameters() {
    return salesandMarketingInstanceAnalysisParameters;
  }

  public void setSalesandMarketingInstanceAnalysisParameters(String salesandMarketingInstanceAnalysisParameters) {
    this.salesandMarketingInstanceAnalysisParameters = salesandMarketingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return salesandMarketingInstanceAnalysisReport
  **/

  public Object getSalesandMarketingInstanceAnalysisReport() {
    return salesandMarketingInstanceAnalysisReport;
  }

  public void setSalesandMarketingInstanceAnalysisReport(Object salesandMarketingInstanceAnalysisReport) {
    this.salesandMarketingInstanceAnalysisReport = salesandMarketingInstanceAnalysisReport;
  }


}

