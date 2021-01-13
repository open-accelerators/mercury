package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis
 */
public class BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis   {
  private String salesandMarketingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return salesandMarketingInstanceAnalysisReference
  **/

  public String getSalesandMarketingInstanceAnalysisReference() {
    return salesandMarketingInstanceAnalysisReference;
  }

  public void setSalesandMarketingInstanceAnalysisReference(String salesandMarketingInstanceAnalysisReference) {
    this.salesandMarketingInstanceAnalysisReference = salesandMarketingInstanceAnalysisReference;
  }


}

