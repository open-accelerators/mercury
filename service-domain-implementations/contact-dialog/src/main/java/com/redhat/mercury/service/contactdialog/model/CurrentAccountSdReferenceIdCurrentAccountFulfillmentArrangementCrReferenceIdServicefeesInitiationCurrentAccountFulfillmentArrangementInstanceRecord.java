package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord   {
  @JsonProperty("productInstanceReference")
  private String productInstanceReference;

  @JsonProperty("currentAccountNumber")
  private String currentAccountNumber;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("accountCurrency")
  private String accountCurrency;

  @JsonProperty("taxReference")
  private String taxReference;

  @JsonProperty("restrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("linkedAccounts")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts;

  @JsonProperty("positionLimits")
  private InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance 
   * @return productInstanceReference
  */
  @ApiModelProperty(example = "762062", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance ")


  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountNumber(String currentAccountNumber) {
    this.currentAccountNumber = currentAccountNumber;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725  bian-reference: CurrentAccount (as Account).AccountIdentification  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return currentAccountNumber
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725  bian-reference: CurrentAccount (as Account).AccountIdentification  general-info: The associated account number in any suitable format (e.g. IBAN) ")


  public String getCurrentAccountNumber() {
    return currentAccountNumber;
  }

  public void setCurrentAccountNumber(String currentAccountNumber) {
    this.currentAccountNumber = currentAccountNumber;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_7CvjsPj5EeG2rK1g72xi7Q_-843966450  bian-reference: CurrentAccount (as Account).AccountType  general-info: The type of current account (e.g. checking, student, small business) 
   * @return accountType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_7CvjsPj5EeG2rK1g72xi7Q_-843966450  bian-reference: CurrentAccount (as Account).AccountType  general-info: The type of current account (e.g. checking, student, small business) ")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_-69C4IDWEeKn8fN1QdMTXQ_-145666344  bian-reference: CurrentAccount (as Account).AccountBaseCurrency  general-info: The primary account currency 
   * @return accountCurrency
  */
  @ApiModelProperty(example = "USD", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_-69C4IDWEeKn8fN1QdMTXQ_-145666344  bian-reference: CurrentAccount (as Account).AccountBaseCurrency  general-info: The primary account currency ")


  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  */
  @ApiModelProperty(example = "705481", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling ")


  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option ")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord linkedAccounts(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.productInstanceReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.productInstanceReference) &&
        Objects.equals(this.currentAccountNumber, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.currentAccountNumber) &&
        Objects.equals(this.accountType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.accountType) &&
        Objects.equals(this.accountCurrency, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.accountCurrency) &&
        Objects.equals(this.taxReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.taxReference) &&
        Objects.equals(this.restrictionOptionSetting, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionSetting) &&
        Objects.equals(this.linkedAccounts, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.linkedAccounts) &&
        Objects.equals(this.positionLimits, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, currentAccountNumber, accountType, accountCurrency, taxReference, restrictionOptionSetting, linkedAccounts, positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    currentAccountNumber: ").append(toIndentedString(currentAccountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

