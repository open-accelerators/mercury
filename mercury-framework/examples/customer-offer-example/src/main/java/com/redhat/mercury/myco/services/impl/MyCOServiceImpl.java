package com.redhat.mercury.myco.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.StringValue;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.ExecuteCustomerOfferProcedureResponseOuterClass.ExecuteCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseCustomerOfferProcedureOuterClass.InitiateCustomerOfferProcedureResponseCustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.RequestCustomerOfferProcedureResponseOuterClass.RequestCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.ExecuteRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RequestRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RetrieveRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.myco.model.CustomerOfferState;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferNotificationService notificationService;

    @Inject
    CustomerOfferService svc;

    @Override
    public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        String customerReference = null;
        try {
            customerReference = request
                    .getInitiateCustomerOfferProcedureRequest()
                    .getCustomerOfferProcedure()
                    .getCustomerReference()
                    .unpack(StringValue.class).getValue();
        } catch (InvalidProtocolBufferException e) {
            LOGGER.error("Invalid customerReference", e);
            return Uni.createFrom().failure(e);
        }
        LOGGER.info("Initiate received for {}", customerReference);
        CustomerOfferState procedure = svc.initiateProcedure(customerReference);
        return notificationService.onCustomerOfferInitiated(procedure.getId().toString())
                .onItem()
                .transform(e -> InitiateCustomerOfferProcedureResponse.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure.newBuilder()
                                .setCustomerOfferProcessingTask(procedure.getId().toString())
                                .setCustomerOfferProcessingTaskResult(procedure.getStatus())
                                .build())
                        .build());
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
        Integer id = Integer.valueOf(request.getCustomerofferId());
        LOGGER.info("Update received for {}", id);
        CustomerOfferState procedure = svc.updateProcedure(id);
        if (procedure == null) {
            return Uni.createFrom().nullItem();
        }
        return notificationService.onCustomerOfferCompleted(id.toString())
                .onItem()
                .transform(e -> CustomerOfferProcedure.newBuilder()
                        .setCustomerOfferProcessingTask(id.toString())
                        .setCustomerOfferProcessingTaskResult(procedure.getStatus())
                        .build());
    }
}
