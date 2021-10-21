package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainRequest;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller(namespaces = Controller.WATCH_CURRENT_NAMESPACE)
public class ServiceDomainController implements ResourceController<ServiceDomainRequest> {

    private static final String BINDING_SERVICE_SA = "bian-binding-service-sa";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);

    @Inject
    KubernetesClient client;

    @Override
    public DeleteControl deleteResource(ServiceDomainRequest sdr, Context<ServiceDomainRequest> context) {
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomainRequest> createOrUpdateResource(ServiceDomainRequest sdr, Context<ServiceDomainRequest> context) {
        ServiceDomainStatus status = null;
        try {
            String sdNS = sdr.getMetadata().getNamespace();
            String sdName = sdr.getMetadata().getName();

            createOrUpdateServiceAccount(sdNS);


        } catch (Exception e) {
            status = new ServiceDomainStatus();
            status.setMessage("Error createOrUpdateResource: " + e.getMessage());
            status.setState(ServiceDomainStatus.State.ERROR);
            status.setError(true);
        }

        sdr.setStatus(status);
        return UpdateControl.updateStatusSubResource(sdr);
    }

    private void createOrUpdateServiceAccount(String sdNS) {
        ServiceAccount serviceAccount = client
                .serviceAccounts()
                .inNamespace(sdNS)
                .withName(BINDING_SERVICE_SA).get();

        if(serviceAccount == null){
            serviceAccount = new ServiceAccountBuilder()
                    .withNewMetadata()
                    .withName(BINDING_SERVICE_SA)
                    .endMetadata()
                    .build();
            try{

                client.serviceAccounts().create(serviceAccount);
                LOGGER.info(BINDING_SERVICE_SA + " service account was created successfully");
            } catch (Exception e){
                LOGGER.info(BINDING_SERVICE_SA + " service account failed to be created");
                throw e;
            }
        }
    }
}
