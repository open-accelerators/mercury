package com.redhat.mercury.myco.services.impl;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation;
import org.bian.protobuf.customeroffer.CustomerOfferProcedureInitiation.Builder;
import org.kie.kogito.Model;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.util.JsonFormat;

@Path("/customer-offer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerOfferResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferResource.class);

    @Inject
    @Named("customer_offer")
    Process<? extends Model> process;

    @POST
    @Path("/{sdRef}/customer-offer-procedure/initiation")
    public Response initiateCustomerOfferProcedure(@PathParam("sdRef") String sdRef, String procedure) throws IOException {
        LOGGER.info("initiateCustomerOfferProcedure received");
        Builder builder = CustomerOfferProcedureInitiation.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(procedure, builder);
        CustomerOfferProcedureInitiation customerOfferProcedureInitiation = builder.build();

        Model model = process.createModel();
        model.fromMap(Map.of("customerOfferProcedure", customerOfferProcedureInitiation));
        ProcessInstance<? extends Model> instance = process.createInstance(model);
        instance.start();
        return Response.ok().build();

    }


}
