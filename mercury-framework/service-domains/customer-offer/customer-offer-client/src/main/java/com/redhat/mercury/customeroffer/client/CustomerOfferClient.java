package com.redhat.mercury.customeroffer.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.bqagreementservice.BQAgreementService;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class CustomerOfferClient {

    @GrpcClient
    CRCustomerOfferProcedureService crCustomerOfferProcedureService;

    @GrpcClient
    BQAgreementService bqAgreementService;

    public CRCustomerOfferProcedureService getCrCustomerOfferProcedureService() {
        return crCustomerOfferProcedureService;
    }

    public BQAgreementService getBqAgreementService() {
        return bqAgreementService;
    }
}
