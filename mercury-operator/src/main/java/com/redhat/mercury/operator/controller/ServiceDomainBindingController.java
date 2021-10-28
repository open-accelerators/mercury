package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainBinding;
import com.redhat.mercury.operator.model.ServiceDomainBindingStatus;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller
public class ServiceDomainBindingController implements ResourceController<ServiceDomainBinding> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainBindingController.class);

    @Inject
    KubernetesClient client;

    @Override
    public DeleteControl deleteResource(ServiceDomainBinding sdb, Context<ServiceDomainBinding> context) {
        String sdName = sdb.getMetadata().getName();
        LOGGER.info("{} service domain cluster deleted successfully", sdName);
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomainBinding> createOrUpdateResource(ServiceDomainBinding sdb, Context<ServiceDomainBinding> context) {
        ServiceDomainBindingStatus status = new ServiceDomainBindingStatus();
        String sdNS = sdb.getMetadata().getNamespace();
        String sdName = sdb.getMetadata().getName();

        try {

        } catch (Exception e) {
            LOGGER.error("{} service domain binding failed to be created/updated", sdName, e);
        }

        sdb.setStatus(status);
        return UpdateControl.updateStatusSubResource(sdb);
    }
}
