package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord   {
  private String guidelineComplianceCheckType = null;

  private String guidelineComplianceCheckRequirement = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg/elements/_ddIbAG7VEeO82qXU9yOWsg  bian-reference: Audit.GuidelineComplianceCheck (as Assessmet).Type  general-info: The required compliance check 
   * @return guidelineComplianceCheckType
  **/

  public String getGuidelineComplianceCheckType() {
    return guidelineComplianceCheckType;
  }

  public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the compliance requirements 
   * @return guidelineComplianceCheckRequirement
  **/

  public String getGuidelineComplianceCheckRequirement() {
    return guidelineComplianceCheckRequirement;
  }

  public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
  }


}

