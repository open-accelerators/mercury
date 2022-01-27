package com.redhat.mercury.customeroffer.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.customeroffer.api.bqagreementservice.BQAgreementService;
import com.redhat.mercury.customeroffer.api.bqauditservice.BQAuditService;
import com.redhat.mercury.customeroffer.api.bqbookingservice.BQBookingService;
import com.redhat.mercury.customeroffer.api.bqcollateralservice.BQCollateralService;
import com.redhat.mercury.customeroffer.api.bqcomplianceservice.BQComplianceService;
import com.redhat.mercury.customeroffer.api.bqcorrespondenceanddocumentsservice.BQCorrespondenceandDocumentsService;
import com.redhat.mercury.customeroffer.api.bqcreditservice.BQCreditService;
import com.redhat.mercury.customeroffer.api.bqdisclosuresservice.BQDisclosuresService;
import com.redhat.mercury.customeroffer.api.bqfacilityapplicationservice.BQFacilityApplicationService;
import com.redhat.mercury.customeroffer.api.bqproductinitializationservice.BQProductInitializationService;
import com.redhat.mercury.customeroffer.api.bqunderwritingservice.BQUnderwritingService;
import com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class CustomerOfferClient {

    @GrpcClient("customer-offer-cr-customer-offer-procedure")
    CRCustomerOfferProcedureService crCustomerOfferProcedureService;

    @GrpcClient("customer-offer-bq-agreement")
    BQAgreementService bqAgreementService;

    @GrpcClient("customer-offer-bq-audit")
    BQAuditService bqAuditService;

    @GrpcClient("customer-offer-bq-booking")
    BQBookingService bqBookingService;

    @GrpcClient("customer-offer-bq-collateral")
    BQCollateralService bqCollateralService;

    @GrpcClient("customer-offer-bq-compliance")
    BQComplianceService bqComplianceService;

    @GrpcClient("customer-offer-bq-correspondence-and-documents")
    BQCorrespondenceandDocumentsService bqCorrespondenceandDocumentsService;

    @GrpcClient("customer-offer-bq-credit")
    BQCreditService bqCreditService;

    @GrpcClient("customer-offer-bq-disclosures")
    BQDisclosuresService bqDisclosuresService;

    @GrpcClient("customer-offer-bq-facility-application")
    BQFacilityApplicationService bqFacilityApplicationService;

    @GrpcClient("customer-offer-bq-product-initialization")
    BQProductInitializationService bqProductInitializationService;

    @GrpcClient("customer-offer-bq-underwriting")
    BQUnderwritingService bqUnderwritingService;

    public CRCustomerOfferProcedureService getCrCustomerOfferProcedureService() {
        return crCustomerOfferProcedureService;
    }

    public BQAgreementService getBqAgreementService() {
        return bqAgreementService;
    }

    public BQAuditService getBqAuditService() {
        return bqAuditService;
    }

    public BQBookingService getBqBookingService() {
        return bqBookingService;
    }

    public BQCollateralService getBqCollateralService() {
        return bqCollateralService;
    }

    public BQComplianceService getBqComplianceService() {
        return bqComplianceService;
    }

    public BQCorrespondenceandDocumentsService getBqCorrespondenceandDocumentsService() {
        return bqCorrespondenceandDocumentsService;
    }

    public BQCreditService getBqCreditService() {
        return bqCreditService;
    }

    public BQDisclosuresService getBqDisclosuresService() {
        return bqDisclosuresService;
    }

    public BQFacilityApplicationService getBqFacilityApplicationService() {
        return bqFacilityApplicationService;
    }

    public BQProductInitializationService getBqProductInitializationService() {
        return bqProductInitializationService;
    }

    public BQUnderwritingService getBqUnderwritingService() {
        return bqUnderwritingService;
    }
}
