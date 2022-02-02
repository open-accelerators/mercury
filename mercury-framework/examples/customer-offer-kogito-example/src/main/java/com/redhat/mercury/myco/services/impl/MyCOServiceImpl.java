package com.redhat.mercury.myco.services.impl;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.kie.kogito.Model;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.v10.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.v10.model.CRCustomerOfferProcedureUpdateInputModel;
import com.redhat.mercury.customeroffer.v10.services.CustomerOfferService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCOServiceImpl implements CustomerOfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCOServiceImpl.class);

    @Inject
    @Named("customer_offer")
    Process<? extends Model> process;

    @Override
    public Uni<Empty> initiateCustomerOfferProcedure(CRCustomerOfferProcedureInitiateInputModel procedure) {
        LOGGER.info("initiateCustomerOfferProcedure received");
        return Uni.createFrom().nullItem().onItem().transform(i -> {
            Model model = process.createModel();
            model.fromMap(Map.of("customerOfferProcedure", procedure));
            ProcessInstance<? extends Model> instance = process.createInstance(model);
            instance.start();
            return Empty.getDefaultInstance();
        });
    }

    @Override
    public Uni<Empty> updateCustomerOfferProcedure(CRCustomerOfferProcedureUpdateInputModel update) {
        return Uni.createFrom()
                .failure(new UnsupportedOperationException("Not implemented"));
    }
}
