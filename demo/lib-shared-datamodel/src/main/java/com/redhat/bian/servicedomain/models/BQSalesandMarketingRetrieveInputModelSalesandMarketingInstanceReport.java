package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport
 */
public class BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport   {
  private String salesandMarketingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return salesandMarketingInstanceReportReference
  **/

  public String getSalesandMarketingInstanceReportReference() {
    return salesandMarketingInstanceReportReference;
  }

  public void setSalesandMarketingInstanceReportReference(String salesandMarketingInstanceReportReference) {
    this.salesandMarketingInstanceReportReference = salesandMarketingInstanceReportReference;
  }


}

