package com.redhat.mercury.customeroffer.reflection;

import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureUpdateInputModel;
import com.redhat.mercury.customeroffer.model.CustomeroffersdReferenceIdcustomerofferprocedurecrReferenceIdupdateCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdReferenceIdcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModel;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {
        CRCustomerOfferProcedureInitiateInputModel.class,
        CRCustomerOfferProcedureUpdateInputModel.class,
        SDCustomerOfferRetrieveOutputModel.class,
        CRCustomerOfferProcedureRetrieveOutputModel.class,
        CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord.class,
        CustomeroffersdReferenceIdcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord.class,
        CustomeroffersdReferenceIdcustomerofferprocedurecrReferenceIdupdateCustomerOfferProcedureInstanceRecord.class
})
public class CustomerOfferReflectionConfiguration {
}
