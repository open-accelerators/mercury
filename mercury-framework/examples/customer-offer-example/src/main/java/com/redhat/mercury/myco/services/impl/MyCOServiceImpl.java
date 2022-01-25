package com.redhat.mercury.myco.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customeroffer.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.ExecuteCustomerOfferProcedureResponseOuterClass.ExecuteCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.RequestCustomerOfferProcedureResponseOuterClass.RequestCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.ExecuteRequest;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RequestRequest;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RetrieveRequest;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        LOGGER.info("Initiate received");
        return notificationService.onCustomerOfferInitiated(request
                        .getInitiateCustomerOfferProcedureRequest()
                        .getCustomerOfferProcedure()
                        .getCustomerReference().getValue().toStringUtf8())
                .onItem()
                .transform(e -> InitiateCustomerOfferProcedureResponse.newBuilder().build());

    }

    @Override
    public Uni<RequestCustomerOfferProcedureResponse> request(RequestRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<CustomerOfferProcedure> retrieve(RetrieveRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<CustomerOfferProcedure> update(UpdateRequest request) {
        LOGGER.info("Update received");
        return notificationService.onCustomerOfferCompleted(request
                        .getCustomerOfferProcedure()
                        .getCustomerReference().getValue().toStringUtf8())
                .onItem()
                .transform(e -> CustomerOfferProcedure.newBuilder().build());

    }

}
