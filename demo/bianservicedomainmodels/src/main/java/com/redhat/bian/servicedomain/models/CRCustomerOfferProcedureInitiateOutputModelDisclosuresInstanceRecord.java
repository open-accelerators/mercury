package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord   {
  private String disclosureType = null;

  private String disclosureTextDescription = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9j4m0HltEeG7BsjMvd1mEw_-611051048  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).Disclosure.DisclosureType  general-info: The type of disclosure (e.g. verbal, requiring signature) 
   * @return disclosureType
  **/

  public String getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(String disclosureType) {
    this.disclosureType = disclosureType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9j4m0XltEeG7BsjMvd1mEw_369279782  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).Disclosure.DisclosureDescription  general-info: The presented disclosure for customer review in any suitable format 
   * @return disclosureTextDescription
  **/

  public String getDisclosureTextDescription() {
    return disclosureTextDescription;
  }

  public void setDisclosureTextDescription(String disclosureTextDescription) {
    this.disclosureTextDescription = disclosureTextDescription;
  }


}

