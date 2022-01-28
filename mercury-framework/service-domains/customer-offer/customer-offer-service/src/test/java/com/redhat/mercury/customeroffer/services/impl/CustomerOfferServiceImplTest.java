package com.redhat.mercury.customeroffer.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.redhat.mercury.customeroffer.v10.client.CustomerOfferClient;
import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.v10.ExecuteCustomerOfferProcedureResponseOuterClass.ExecuteCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.RequestCustomerOfferProcedureResponseOuterClass.RequestCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.UpdateAgreementResponseOuterClass.UpdateAgreementResponse;
import com.redhat.mercury.customeroffer.v10.api.bqagreementservice.BQAgreementService;
import com.redhat.mercury.customeroffer.v10.api.bqagreementservice.BqAgreementService.RetrieveAgreementRequest;
import com.redhat.mercury.customeroffer.v10.api.bqagreementservice.BqAgreementService.UpdateAgreementRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.ExecuteRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RequestRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.RetrieveRequest;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;

import io.quarkus.grpc.GrpcService;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CustomerOfferServiceImplTest {

    private static final CRCustomerOfferProcedureService mockCrCustomerOfferProcedureSvc = Mockito.mock(CRCustomerOfferProcedureService.class);
    private static final BQAgreementService mockBQAgreementSvc = Mockito.mock(BQAgreementService.class);

    @Inject
    CustomerOfferClient client;

    @Test
    void testQueryProcedureRetrieve() throws ExecutionException, InterruptedException, TimeoutException {
        String customerId = "foo";
        RetrieveRequest request = RetrieveRequest.newBuilder().setCustomerofferId(customerId).build();
        CustomerOfferProcedure expected = CustomerOfferProcedure.newBuilder().build();
        Mockito.when(mockCrCustomerOfferProcedureSvc.retrieve(request)).thenReturn(Uni.createFrom().item(expected));

        Uni<CustomerOfferProcedure> response = client.getCrCustomerOfferProcedureService().retrieve(request);

        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete(m));
        CustomerOfferProcedure sdCustomerOffer = message.get(5, TimeUnit.SECONDS);
        assertThat(sdCustomerOffer).isEqualTo(expected);
    }


    @Test
    void testBQAgreementSvc() throws ExecutionException, InterruptedException, TimeoutException {
        String customerId = "foo";
        RetrieveAgreementRequest request = RetrieveAgreementRequest.newBuilder().setCustomerofferId(customerId).build();
        CustomerOfferProcedure expected = CustomerOfferProcedure.newBuilder().build();
        Mockito.when(mockBQAgreementSvc.retrieveAgreement(request)).thenReturn(Uni.createFrom().item(expected));

        Uni<CustomerOfferProcedure> response = client.getBqAgreementService().retrieveAgreement(request);

        CompletableFuture<CustomerOfferProcedure> message = new CompletableFuture<>();
        response.subscribe().with(m -> message.complete(m));
        CustomerOfferProcedure sdCustomerOffer = message.get(5, TimeUnit.SECONDS);
        assertThat(sdCustomerOffer).isEqualTo(expected);
    }

    @GrpcService
    private static class MyTestService implements CRCustomerOfferProcedureService {

        @Override
        public Uni<ExecuteCustomerOfferProcedureResponse> execute(ExecuteRequest request) {
            return mockCrCustomerOfferProcedureSvc.execute(request);
        }

        @Override
        public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
            return mockCrCustomerOfferProcedureSvc.initiate(request);
        }

        @Override
        public Uni<RequestCustomerOfferProcedureResponse> request(RequestRequest request) {
            return mockCrCustomerOfferProcedureSvc.request(request);
        }

        @Override
        public Uni<CustomerOfferProcedure> retrieve(RetrieveRequest request) {
            return mockCrCustomerOfferProcedureSvc.retrieve(request);
        }

        @Override
        public Uni<CustomerOfferProcedure> update(UpdateRequest request) {
            return mockCrCustomerOfferProcedureSvc.update(request);
        }
    }

    @GrpcService
    private static class MyBQAgreementService implements BQAgreementService {

        @Override
        public Uni<CustomerOfferProcedure> retrieveAgreement(RetrieveAgreementRequest request) {
            return mockBQAgreementSvc.retrieveAgreement(request);
        }

        @Override
        public Uni<UpdateAgreementResponse> updateAgreement(UpdateAgreementRequest request) {
            return mockBQAgreementSvc.updateAgreement(request);
        }
    }

}
