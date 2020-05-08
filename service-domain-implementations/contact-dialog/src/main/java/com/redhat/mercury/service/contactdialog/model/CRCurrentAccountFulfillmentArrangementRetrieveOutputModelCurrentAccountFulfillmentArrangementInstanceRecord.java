package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  @JsonProperty("productInstanceReference")
  private String productInstanceReference;

  @JsonProperty("currentAccountNumber")
  private String currentAccountNumber;

  @JsonProperty("customerReference")
  private String customerReference;

  @JsonProperty("bankBranchLocationReference")
  private String bankBranchLocationReference;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("accountCurrency")
  private String accountCurrency;

  @JsonProperty("taxReference")
  private String taxReference;

  @JsonProperty("entitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("entitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("restrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("restrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("associations")
  private InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations;

  @JsonProperty("linkedAccounts")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts;

  @JsonProperty("positionLimits")
  private InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance 
   * @return productInstanceReference
  */
  @ApiModelProperty(example = "721040", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance ")


  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountNumber(String currentAccountNumber) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountOwner)  general-info: Reference to the account primary party/owner 
   * @return customerReference
  */
  @ApiModelProperty(example = "794126", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountOwner)  general-info: Reference to the account primary party/owner ")


  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord bankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountServicer). PartyRole.Party.Location  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  */
  @ApiModelProperty(example = "718448", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountServicer). PartyRole.Party.Location  general-info: Bank branch associated with the account for booking purposes ")


  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord accountType(String accountType) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord accountCurrency(String accountCurrency) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  */
  @ApiModelProperty(example = "709480", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling ")


  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option ")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option ")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option ")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord restrictionOptionSetting(String restrictionOptionSetting) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord associations(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord linkedAccounts(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
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
    CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord = (CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.productInstanceReference, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.productInstanceReference) &&
        Objects.equals(this.currentAccountNumber, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.currentAccountNumber) &&
        Objects.equals(this.customerReference, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.customerReference) &&
        Objects.equals(this.bankBranchLocationReference, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.bankBranchLocationReference) &&
        Objects.equals(this.accountType, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.accountType) &&
        Objects.equals(this.accountCurrency, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.accountCurrency) &&
        Objects.equals(this.taxReference, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.taxReference) &&
        Objects.equals(this.entitlementOptionDefinition, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionSetting) &&
        Objects.equals(this.associations, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.associations) &&
        Objects.equals(this.linkedAccounts, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.linkedAccounts) &&
        Objects.equals(this.positionLimits, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, crCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, currentAccountNumber, customerReference, bankBranchLocationReference, accountType, accountCurrency, taxReference, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, linkedAccounts, positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    currentAccountNumber: ").append(toIndentedString(currentAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
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

