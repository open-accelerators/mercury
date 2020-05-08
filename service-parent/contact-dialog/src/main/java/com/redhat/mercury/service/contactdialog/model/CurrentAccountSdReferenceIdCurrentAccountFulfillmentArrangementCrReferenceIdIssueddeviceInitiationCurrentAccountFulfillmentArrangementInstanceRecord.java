package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord   {
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

  @JsonProperty("entitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("restrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("positionLimits")
  private InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance 
   * @return productInstanceReference
  */
  @ApiModelProperty(example = "723381", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the current account product instance ")


  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountNumber(String currentAccountNumber) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountOwner)  general-info: Reference to the account primary party/owner 
   * @return customerReference
  */
  @ApiModelProperty(example = "736337", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountOwner)  general-info: Reference to the account primary party/owner ")


  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord bankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountServicer). PartyRole.Party.Location  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  */
  @ApiModelProperty(example = "702544", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountServicer). PartyRole.Party.Location  general-info: Bank branch associated with the account for booking purposes ")


  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord accountType(String accountType) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord accountCurrency(String accountCurrency) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord entitlementOptionSetting(String entitlementOptionSetting) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord restrictionOptionSetting(String restrictionOptionSetting) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
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
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.productInstanceReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.productInstanceReference) &&
        Objects.equals(this.currentAccountNumber, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.currentAccountNumber) &&
        Objects.equals(this.customerReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.customerReference) &&
        Objects.equals(this.bankBranchLocationReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.bankBranchLocationReference) &&
        Objects.equals(this.accountType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.accountType) &&
        Objects.equals(this.accountCurrency, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.accountCurrency) &&
        Objects.equals(this.entitlementOptionSetting, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionSetting) &&
        Objects.equals(this.positionLimits, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, currentAccountNumber, customerReference, bankBranchLocationReference, accountType, accountCurrency, entitlementOptionSetting, restrictionOptionSetting, positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    currentAccountNumber: ").append(toIndentedString(currentAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
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

