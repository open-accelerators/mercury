package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModelCollateralInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateOutputModelCollateralInstanceRecord   {
  private String collateralRequirement = null;

  private String collateralEarmarkReference = null;

  private Object collateralAssetAllocationInstanceRecord = null;

  private String collateralAssetReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_FLlGE8TGEeChad0JzLk7QA_-1191802314  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAmount  general-info: The required collateral amount for the offer 
   * @return collateralRequirement
  **/

  public String getCollateralRequirement() {
    return collateralRequirement;
  }

  public void setCollateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344  bian-reference: CollateralAgreement.CollateralArrangement.PaymentWarrantyArrangement  general-info: Reference to earmarked collateral during the offer procedure 
   * @return collateralEarmarkReference
  **/

  public String getCollateralEarmarkReference() {
    return collateralEarmarkReference;
  }

  public void setCollateralEarmarkReference(String collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831345  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset. CollateralAssetAllocation  general-info: Reference to the allocated collateral 
   * @return collateralAssetAllocationInstanceRecord
  **/

  public Object getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_2rpAYbbpEeG8PZlPAY1QrA_1766124127  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset  general-info: Reference to the related collateral asset (e.g. property) 
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


}

