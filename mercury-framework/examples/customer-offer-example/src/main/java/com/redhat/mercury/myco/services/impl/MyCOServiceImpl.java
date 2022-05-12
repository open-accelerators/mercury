package com.redhat.mercury.myco.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.redhat.mercury.myco.model.CustomerOfferProcedure;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferService svc;

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        String customerReference = request
                .getInitiateCustomerOfferProcedureRequest()
                .getCustomerOfferProcedure()
                .getCustomerReference();

        LOGGER.info("Initiate received for {}", customerReference);
        return svc.initiateProcedure(customerReference)
                .onItem()
                .transform(state -> InitiateCustomerOfferProcedureResponse.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure.newBuilder()
                                .setCustomerOfferProcessingTask(state.getId().toString())
                                .setCustomerOfferProcessingTaskResult(state.getStatus())
                                .build())
                        .build());

    }

    @Override
    public Uni<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> update(UpdateRequest request) {
        LOGGER.info("Update received for {}", request.getCustomerofferId());
        return svc.updateProcedure(toCustomerOfferState(request))
                .onItem()
                .transform(state -> com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure.newBuilder()
                        .setCustomerOfferProcessingTask(state.getId().toString())
                        .setCustomerOfferProcessingTaskResult(state.getStatus())
                        .build());
    }

    @Override
    public Uni<RequestCustomerOfferProcedureResponse> request(RequestRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure> retrieve(RetrieveRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    private CustomerOfferProcedure toCustomerOfferState(UpdateRequest request) {
        return CustomerOfferProcedure.builder().id(Integer.valueOf(request.getCustomerofferId()))
                .customerReference(request.getCustomerOfferProcedure().getCustomerOfferProcessingTask())
                .status(request.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult())
                .build();
    }

}
