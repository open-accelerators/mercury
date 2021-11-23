package com.redhat.mercury.myco.services.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.bian.protobuf.customeroffer.BasicReference;
import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureUpdate;
import org.bian.protobuf.customeroffer.ProcedureInstanceRecord;
import org.junit.jupiter.api.Test;

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
        CustomerOfferProcedureInitiation procedure = CustomerOfferProcedureInitiation.newBuilder()
                .setProcedure(ProcedureInstanceRecord.newBuilder()
                        .setCustomerReference("foo")
                        .build())
                .build();
        CompletableFuture<Void> message = new CompletableFuture<>();
        client.initiateCustomerOfferProcedure(procedure).subscribe().with(reply -> message.complete(null));
        message.get(5, TimeUnit.SECONDS);
        CustomerOfferNotification notification = CustomerOfferNotification.newBuilder()
                .setCustomerOfferReference(BasicReference.newBuilder()
                        .setId("foo")
                        .build()).build();
        verify(notificationService, times(1)).onCustomerOfferInitiated(notification);
    }

    @Test
    void testUpdateCustomerOfferProcedure() throws ExecutionException, InterruptedException, TimeoutException {
        CustomerOfferProcedureUpdate procedure = CustomerOfferProcedureUpdate.newBuilder()
                .setProcedure(ProcedureInstanceRecord.newBuilder()
                        .setCustomerReference("foo")
                        .build())
                .build();
        CompletableFuture<Void> message = new CompletableFuture<>();
        client.updateCustomerOfferProcedure(procedure).subscribe().with(reply -> message.complete(null));
        message.get(5, TimeUnit.SECONDS);
        CustomerOfferNotification notification = CustomerOfferNotification.newBuilder()
                .setCustomerOfferReference(BasicReference.newBuilder()
                        .setId("foo")
                        .build()).build();
        verify(notificationService, times(1)).onCustomerOfferCompleted(notification);
    }
}
