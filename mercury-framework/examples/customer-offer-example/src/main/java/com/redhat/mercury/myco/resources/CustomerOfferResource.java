package com.redhat.mercury.myco.resources;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.CRStateNotification;
import com.redhat.mercury.myco.services.impl.CustomerOfferService;
import com.redhat.mercury.myco.services.messaging.CustomerOfferProcedureNotificationService;

import io.smallrye.mutiny.Uni;

@Path("/customer-offer/api")
public class CustomerOfferResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferResource.class);

    Long id = 1L;

    @Inject
    CustomerOfferService svc;

    @Inject
    CustomerOfferProcedureNotificationService notificationService;

    @POST
    @Path("/procedures")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Void> initiate() {
        Long nextId = this.id++;
        String customerReference = nextId.toString();

        LOGGER.info("Initiate received for {}", customerReference);
        return svc.initiateProcedure(customerReference)
                .call(state -> notificationService.send(CRStateNotification.builder(ServiceDomain.CUSTOMER_OFFER)
                        .withReference(state.getId().toString())
                        .invocation()
                        .workPerformance()
                        .initiated()
                        .build()))
                .onItem()
                .transform(state -> null);
    }
}
