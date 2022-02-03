package com.redhat.mercury.myco.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Any;
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

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    private int customerOfferId = 1;

    private Map<Integer, CustomerOfferProcedure> procedures = new HashMap<>();

    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        Integer id = getId();
        Any customerReference = request
                .getInitiateCustomerOfferProcedureRequest()
                .getCustomerOfferProcedure()
                .getCustomerReference();
        final CustomerOfferProcedure procedure = CustomerOfferProcedure.newBuilder()
                .setCustomerReference(customerReference)
                .setCustomerOfferProcessingTask("INITIATED")
                .build();
        procedures.put(id, procedure);
        LOGGER.info("Initiate received for {}", customerReference);
        return notificationService.onCustomerOfferInitiated(id.toString())
                .onItem()
                .transform(e -> InitiateCustomerOfferProcedureResponse.newBuilder()
                        .setCustomerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure.newBuilder()
                                .setCustomerOfferProcessingTask(id.toString())
                                .setCustomerOfferProcessingTaskResult(procedure.getCustomerOfferProcessingTask())
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
        CustomerOfferProcedure procedure = procedures.get(id);
        if (procedure == null) {
            return Uni.createFrom().nullItem();
        }
        CustomerOfferProcedure updated = CustomerOfferProcedure.newBuilder(procedure)
                .setCustomerOfferProcessingTask("COMPLETED")
                .build();
        procedures.put(id, updated);
        return notificationService.onCustomerOfferCompleted(id.toString())
                .onItem()
                .transform(e -> CustomerOfferProcedure.newBuilder()
                        .setCustomerOfferProcessingTask(id.toString())
                        .setCustomerOfferProcessingTaskResult(updated.getCustomerOfferProcessingTask())
                        .build());
    }

    private synchronized Integer getId() {
        return customerOfferId++;
    }

}
