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
import com.redhat.mercury.myco.model.InitiateRequest;
import com.redhat.mercury.myco.services.impl.CustomerOfferService;
import com.redhat.mercury.myco.services.messaging.CustomerOfferProcedureNotificationService;

import io.smallrye.mutiny.Uni;

@Path("/customer-offer/api")
public class CustomerOfferResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferResource.class);

    @Inject
    CustomerOfferService svc;

    @Inject
    CustomerOfferProcedureNotificationService notificationService;

    @POST
    @Path("/procedures")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Void> initiate(InitiateRequest request) {
        LOGGER.info("Initiate received for {}", request);
        return svc.initiateProcedure(request.getCustomerReference())
                .onItem()
                .transform(state -> null);
    }
}
