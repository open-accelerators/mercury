package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CustomeroffersdReferenceIdcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;
import com.redhat.mercury.customeroffer.services.client.CustomerOfferClient;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@QuarkusTest
class MyCOServiceImplTest {

    @Inject
    CustomerOfferClient client;

    @InjectMock
    CustomerOfferNotificationService notificationService;

    @Test
    void testInitiateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomeroffersdReferenceIdcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord customerOfferInstanceRecord = new CustomeroffersdReferenceIdcustomerofferprocedureinitiationCustomerOfferProcedureInstanceRecord();
        customerOfferInstanceRecord.setCustomerReference("foo");
        CRCustomerOfferProcedureInitiateInputModel procedure = new CRCustomerOfferProcedureInitiateInputModel();
        procedure.setCustomerOfferProcedureInstanceRecord(customerOfferInstanceRecord);
        CompletableFuture<Void> message = new CompletableFuture<>();
        client.initiateCustomerOfferProcedure(procedure).subscribe().with(reply -> message.complete(null));
        message.get(5, TimeUnit.SECONDS);
        verify(notificationService, times(1)).onCustomerOfferInitiated("foo");
    }

}
