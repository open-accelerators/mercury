package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingStateOuterClass.RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState;
import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseOuterClass.RetrieveCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CRCustomerCreditRatingStateServiceClient;
import com.redhat.mercury.customercreditrating.v10.client.CustomerCreditRatingClient;
import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.messaging.KafkaTestResourceLifecycleManager;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.smallrye.mutiny.Uni;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@QuarkusTest
@QuarkusTestResource(KafkaTestResourceLifecycleManager.class)
class CustomerOfferServiceTest {

    private static final String CUSTOMER_REF = "some-ref";

    @Inject
    CustomerOfferService service;

    @InjectMock
    ProcedureStoreService storeService;

    @InjectMock
    CustomerCreditRatingClient ccrClient;

    @Test
    void testProcessing() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder()
                .id(1)
                .status(ControlRecordState.INITIATED)
                .customerReference(CUSTOMER_REF)
                .build();
        when(storeService.create(CUSTOMER_REF, ControlRecordState.INITIATED))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        expected = CustomerOfferProcedure.builder()
                .id(1)
                .status(ControlRecordState.PROCESSING)
                .customerReference(CUSTOMER_REF)
                .build();
        when(storeService.create(CUSTOMER_REF, ControlRecordState.PROCESSING))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        when(storeService.update(expected))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        CRCustomerCreditRatingStateServiceClient ccrStateClientMock = mock(CRCustomerCreditRatingStateServiceClient.class);
        when(ccrClient.getCRCustomerCreditRatingStateService()).thenReturn(ccrStateClientMock);
        when(ccrClient.getCRCustomerCreditRatingStateService().retrieve(any()))
                .thenReturn(Uni.createFrom().item(RetrieveCustomerCreditRatingStateResponse.newBuilder()
                        .setCustomerCreditRatingState(RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState.newBuilder()
                                .setCreditRatingAssessmentResult("802")
                                .build())
                        .build()));

        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(ControlRecordState.PROCESSING);

        verify(storeService, times(1)).create(eq(CUSTOMER_REF), any());
        verify(storeService, times(1)).update(any());
        verify(ccrStateClientMock, times(1)).retrieve(any());

    }

    @Test
    void testInterrupted() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedure expected = CustomerOfferProcedure.builder()
                .id(1)
                .status(ControlRecordState.INITIATED)
                .customerReference(CUSTOMER_REF)
                .build();
        when(storeService.create(CUSTOMER_REF, ControlRecordState.INITIATED))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        expected = CustomerOfferProcedure.builder()
                .id(1)
                .status(ControlRecordState.INTERRUPTED)
                .customerReference(CUSTOMER_REF)
                .build();
        when(storeService.create(CUSTOMER_REF, ControlRecordState.INTERRUPTED))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        when(storeService.update(expected))
                .thenReturn(Uni.createFrom()
                        .item(expected));
        CRCustomerCreditRatingStateServiceClient ccrStateClientMock = mock(CRCustomerCreditRatingStateServiceClient.class);
        when(ccrClient.getCRCustomerCreditRatingStateService()).thenReturn(ccrStateClientMock);
        when(ccrClient.getCRCustomerCreditRatingStateService().retrieve(any()))
                .thenReturn(Uni.createFrom().item(RetrieveCustomerCreditRatingStateResponse.newBuilder()
                        .setCustomerCreditRatingState(RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState.newBuilder()
                                .setCreditRatingAssessmentResult("699")
                                .build())
                        .build()));

        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.initiateProcedure(CUSTOMER_REF).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state.getId()).isNotNull();
        assertThat(state.getCustomerReference()).isEqualTo(CUSTOMER_REF);
        assertThat(state.getStatus()).isEqualTo(ControlRecordState.INTERRUPTED);

        verify(storeService, times(1)).create(eq(CUSTOMER_REF), any());
        verify(storeService, times(1)).update(any());
        verify(ccrStateClientMock, times(1)).retrieve(any());

    }

    @Test
    void testUpdateNull() throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        service.updateProcedure(CustomerOfferProcedure.builder().id(99999).build()).subscribe().with(message::complete);

        CustomerOfferProcedure state = message.get(5, TimeUnit.SECONDS);
        assertThat(state).isNull();
    }

}
