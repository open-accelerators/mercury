package com.redhat.mercury.myco.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RetrieveRequest;
import com.redhat.mercury.customercreditrating.v10.client.CustomerCreditRatingClient;
import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.model.state.CRStateNotification.WorkPerformanceBuilder;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.messaging.CustomerOfferProcedureNotificationService;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferService.class);

    private static final Integer THRESHOLD = 700;

    @Inject
    CustomerCreditRatingClient client;

    @Inject
    ProcedureStoreService storeService;

    @Inject
    CustomerOfferProcedureNotificationService notificationService;

    public Uni<CustomerOfferProcedure> initiateProcedure(String customerReference) {
        return Uni.createFrom().item(customerReference)
                .chain(id -> storeService.create(id, ControlRecordState.INITIATED))
                .call(this::notifyStatus)
                .chain(this::updateStateWithScore)
                .onItem()
                .call(this::notifyStatus);
    }

    public Uni<CustomerOfferProcedure> updateProcedure(CustomerOfferProcedure state) {
        return storeService.get(state.getId())
                .chain(() -> storeService.update(state));
    }


    private Uni<Void> notifyStatus(CustomerOfferProcedure procedure) {
        WorkPerformanceBuilder notificationBuilder = CRStateNotification.builder(ServiceDomain.CUSTOMER_OFFER)
                .withReference(procedure.getCustomerReference()).invocation()
                .workPerformance();
        CRStateNotification notification;
        switch (procedure.getStatus()) {
            case ControlRecordState.INITIATED:
                notification = notificationBuilder.initiated().build();
                break;
            case ControlRecordState.PROCESSING:
                notification = notificationBuilder.processing().build();
                break;
            case ControlRecordState.COMPLETED:
                notification = notificationBuilder.completed().build();
                break;
            case ControlRecordState.INTERRUPTED:
                notification = notificationBuilder.interrupted().build();
                break;
            default:
                return Uni.createFrom().failure(new StatusRuntimeException(Status.INVALID_ARGUMENT));
        }
        LOGGER.info("notify: {}", notification);
        return notificationService.send(notification);
    }

    private Uni<CustomerOfferProcedure> updateStateWithScore(CustomerOfferProcedure state) {
        return client.getCrCustomerCreditRatingStateService()
                .retrieve(RetrieveRequest.newBuilder().setCustomercreditratingId(state.getCustomerReference()).build())
                .onItem()
                .ifNotNull()
                .transform(i -> Integer.valueOf(i.getCustomerCreditRatingState().getCreditRatingAssessmentResult()))
                .onItem()
                .transform(score -> score >= THRESHOLD ? ControlRecordState.PROCESSING : ControlRecordState.INTERRUPTED)
                .onItem()
                .transform(status -> CustomerOfferProcedure.builder()
                        .id(state.getId())
                        .customerReference(state.getCustomerReference())
                        .status(status)
                        .build()
                )
                .chain(storeService::update);
    }

}
