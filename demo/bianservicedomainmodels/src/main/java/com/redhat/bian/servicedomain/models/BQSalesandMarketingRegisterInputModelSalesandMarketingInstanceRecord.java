package com.redhat.bian.servicedomain.models;

/**
 * BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord
 */
public class BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord {
  private String productServiceSalesMaterial = null;

  private String productServicesFeaturesAndOptions = null;

  private String productServicePricingTable = null;

  private String productServiceFeesPenaltiesTable = null;

  private String productSuitabilityGuide = null;

  private String productServiceEligibilityType = null;

  private String productServiceEligibilityDescription = null;

  private String productServiceOfferProcessingRequirements = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  Descriptive materials/brochures organized for selective access 
   * @return productServiceSalesMaterial
  **/

  public String getProductServiceSalesMaterial() {
    return productServiceSalesMaterial;
  }

  public void setProductServiceSalesMaterial(String productServiceSalesMaterial) {
    this.productServiceSalesMaterial = productServiceSalesMaterial;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: ProductFeature  general-info: Descriptions of product features and product options for review 
   * @return productServicesFeaturesAndOptions
  **/

  public String getProductServicesFeaturesAndOptions() {
    return productServicesFeaturesAndOptions;
  }

  public void setProductServicesFeaturesAndOptions(String productServicesFeaturesAndOptions) {
    this.productServicesFeaturesAndOptions = productServicesFeaturesAndOptions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Allowed price/rate ranges by credit grade/customer type (can be reviewed through simulation) 
   * @return productServicePricingTable
  **/

  public String getProductServicePricingTable() {
    return productServicePricingTable;
  }

  public void setProductServicePricingTable(String productServicePricingTable) {
    this.productServicePricingTable = productServicePricingTable;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable fees/penalties (can be reviewed through simulation) 
   * @return productServiceFeesPenaltiesTable
  **/

  public String getProductServiceFeesPenaltiesTable() {
    return productServiceFeesPenaltiesTable;
  }

  public void setProductServiceFeesPenaltiesTable(String productServiceFeesPenaltiesTable) {
    this.productServiceFeesPenaltiesTable = productServiceFeesPenaltiesTable;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines suitability requirements set by the bank 
   * @return productSuitabilityGuide
  **/

  public String getProductSuitabilityGuide() {
    return productSuitabilityGuide;
  }

  public void setProductSuitabilityGuide(String productSuitabilityGuide) {
    this.productSuitabilityGuide = productSuitabilityGuide;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable legal or regulatory requirements governing eligibility 
   * @return productServiceEligibilityType
  **/

  public String getProductServiceEligibilityType() {
    return productServiceEligibilityType;
  }

  public void setProductServiceEligibilityType(String productServiceEligibilityType) {
    this.productServiceEligibilityType = productServiceEligibilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description/explanation of eligibility requirements, can include required disclosures 
   * @return productServiceEligibilityDescription
  **/

  public String getProductServiceEligibilityDescription() {
    return productServiceEligibilityDescription;
  }

  public void setProductServiceEligibilityDescription(String productServiceEligibilityDescription) {
    this.productServiceEligibilityDescription = productServiceEligibilityDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks required to complete a customer offer 
   * @return productServiceOfferProcessingRequirements
  **/

  public String getProductServiceOfferProcessingRequirements() {
    return productServiceOfferProcessingRequirements;
  }

  public void setProductServiceOfferProcessingRequirements(String productServiceOfferProcessingRequirements) {
    this.productServiceOfferProcessingRequirements = productServiceOfferProcessingRequirements;
  }


}

