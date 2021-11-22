/*
 * Customer Offer
 * This service domain orchestrates the processing of a product offer for a new/established  customer.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customeroffer.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 {
  @SerializedName("productOption")
  private String productOption = null;

  @SerializedName("productOptionDescription")
  private String productOptionDescription = null;

  @SerializedName("productPricing")
  private String productPricing = null;

  @SerializedName("negotiationGuidelinesRules")
  private String negotiationGuidelinesRules = null;

  public CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 productOption(String productOption) {
    this.productOption = productOption;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Product feature that can be configured for the customer 
   * @return productOption
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Product feature that can be configured for the customer ")
  public String getProductOption() {
    return productOption;
  }

  public void setProductOption(String productOption) {
    this.productOption = productOption;
  }

  public CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 productOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the feature provided for review 
   * @return productOptionDescription
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the feature provided for review ")
  public String getProductOptionDescription() {
    return productOptionDescription;
  }

  public void setProductOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
  }

  public CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 productPricing(String productPricing) {
    this.productPricing = productPricing;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).BankingProduct.BankingProductFeature (as PricingFeature)  general-info: The allowed pricing includes ranges by customer measures e.g. credit grade 
   * @return productPricing
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).BankingProduct.BankingProductFeature (as PricingFeature)  general-info: The allowed pricing includes ranges by customer measures e.g. credit grade ")
  public String getProductPricing() {
    return productPricing;
  }

  public void setProductPricing(String productPricing) {
    this.productPricing = productPricing;
  }

  public CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 negotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines for the allowed situation-based pricing adjustments (to maximize margins) 
   * @return negotiationGuidelinesRules
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines for the allowed situation-based pricing adjustments (to maximize margins) ")
  public String getNegotiationGuidelinesRules() {
    return negotiationGuidelinesRules;
  }

  public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 = (CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1) o;
    return Objects.equals(this.productOption, crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1.productOption) &&
        Objects.equals(this.productOptionDescription, crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1.productOptionDescription) &&
        Objects.equals(this.productPricing, crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1.productPricing) &&
        Objects.equals(this.negotiationGuidelinesRules, crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1.negotiationGuidelinesRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOption, productOptionDescription, productPricing, negotiationGuidelinesRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord1 {\n");
    
    sb.append("    productOption: ").append(toIndentedString(productOption)).append("\n");
    sb.append("    productOptionDescription: ").append(toIndentedString(productOptionDescription)).append("\n");
    sb.append("    productPricing: ").append(toIndentedString(productPricing)).append("\n");
    sb.append("    negotiationGuidelinesRules: ").append(toIndentedString(negotiationGuidelinesRules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}