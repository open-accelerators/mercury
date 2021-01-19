package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord   {
  private String productOption = null;

  private String productOptionDescription = null;

  private String productPricing = null;

  private String negotiationGuidelinesRules = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Product feature that can be configured for the customer 
   * @return productOption
  **/

  public String getProductOption() {
    return productOption;
  }

  public void setProductOption(String productOption) {
    this.productOption = productOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the feature provided for review 
   * @return productOptionDescription
  **/

  public String getProductOptionDescription() {
    return productOptionDescription;
  }

  public void setProductOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).BankingProduct.BankingProductFeature (as PricingFeature)  general-info: The allowed pricing includes ranges by customer measures e.g. credit grade 
   * @return productPricing
  **/

  public String getProductPricing() {
    return productPricing;
  }

  public void setProductPricing(String productPricing) {
    this.productPricing = productPricing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines for the allowed situation-based pricing adjustments (to maximize margins) 
   * @return negotiationGuidelinesRules
  **/

  public String getNegotiationGuidelinesRules() {
    return negotiationGuidelinesRules;
  }

  public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
  }


}

