package com.redhat.mercury.myco.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.myco.services.messaging.CustomerOfferProcedureNotificationService;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    CustomerOfferService svc;

    @Inject
    CustomerOfferProcedureNotificationService notificationService;

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        String customerReference = request
                .getInitiateCustomerOfferProcedureRequest()
                .getCustomerOfferProcedure()
                .getCustomerReference();

        LOGGER.info("Initiate received for {}", customerReference);
        return svc.initiateProcedure(customerReference)
                .call(state -> notificationService.send(CRStateNotification.builder(ServiceDomain.CustomerOffer)
                        .withReference(state.getId().toString())
                        .invocation()
                        .workPerformance()
                        .initiated()
                        .build()))
                .onItem()
                .transform(state -> InitiateCustomerOfferProcedureResponse.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure.newBuilder()
                                .setCustomerOfferProcessingTask(state.getId().toString())
                                .setCustomerOfferProcessingTaskResult(state.getStatus())
                                .build())
                        .build());

    }

    @Override
    public Uni<CustomerOfferProcedure> update(UpdateRequest request) {
        Integer id = Integer.valueOf(request.getCustomerofferId());
        LOGGER.info("Update received for {}", id);
        return svc.updateProcedure(id)
                .onItem()
                .ifNotNull()
                .transform(state -> CustomerOfferProcedure.newBuilder()
                        .setCustomerOfferProcessingTask(id.toString())
                        .setCustomerOfferProcessingTaskResult(state.getStatus())
                        .build())
                .call(customerOfferProcedure -> notificationService.send(CRStateNotification.builder(ServiceDomain.CustomerOffer)
                        .withReference(id.toString())
                        .invocation()
                        .workPerformance()
                        .completed()
                        .build()))
                .onItem()
                .ifNull()
                .failWith(new StatusRuntimeException(Status.NOT_FOUND));
    }

    @Override
    public Uni<RequestCustomerOfferProcedureResponse> request(RequestRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<CustomerOfferProcedure> retrieve(RetrieveRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

}
