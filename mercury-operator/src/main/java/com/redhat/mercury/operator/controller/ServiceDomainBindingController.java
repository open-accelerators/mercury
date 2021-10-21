package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainRequest;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller(namespaces = Controller.WATCH_CURRENT_NAMESPACE)
public class ServiceDomainBindingController implements ResourceController<ServiceDomainRequest> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainBindingController.class);

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
//            Deployment existingDeployment = client
//                            .apps()
//                            .deployments()
//                            .inNamespace(sdNS)
//                            .withName(sdName)
//                            .get();
//
//            //Create new deployment
//            if (existingDeployment == null) {
//                Deployment deployment = new Deployment();
//                deployment.getMetadata().setName(sdName);
//                deployment.getMetadata().setNamespace(sdNS);
//                deployment.getMetadata().getLabels().put("app", "bian-" + sdName);
//                deployment.getMetadata().getLabels().put("service-domain", sdName);
//                deployment.getSpec().getSelector().getMatchLabels().put("app", "bian-" + sdName);
//                deployment.getSpec().getTemplate().getMetadata().getLabels().put("app", "bian-" + sdName);
//                deployment.getSpec().getTemplate().getMetadata().getLabels().put("service-domain", sdName);
//                // set tomcat version
//                deployment
//                        .getSpec()
//                        .getTemplate()
//                        .getSpec()
//                        .getContainers()
//                        .get(0)
//                        .setImage("tomcat:" + tomcat.getSpec().getVersion());
//                deployment.getSpec().setReplicas(tomcat.getSpec().getReplicas());
//
//                // make sure label selector matches label (which has to be matched by service selector too)
//                deployment
//                        .getSpec()
//                        .getTemplate()
//                        .getMetadata()
//                        .getLabels()
//                        .put("app", tomcat.getMetadata().getName());
//                deployment
//                        .getSpec()
//                        .getSelector()
//                        .getMatchLabels()
//                        .put("app", tomcat.getMetadata().getName());
//
//                OwnerReference ownerReference = deployment.getMetadata().getOwnerReferences().get(0);
//                ownerReference.setName(tomcat.getMetadata().getName());
//                ownerReference.setUid(tomcat.getMetadata().getUid());
//
//                log.info("Creating or updating Deployment {} in {}", deployment.getMetadata().getName(), sdNS);
//                kubernetesClient.apps().deployments().inNamespace(sdNS).create(deployment);
//            } else {
//                existingDeployment
//                        .getSpec()
//                        .getTemplate()
//                        .getSpec()
//                        .getContainers()
//                        .get(0)
//                        .setImage("tomcat:" + tomcat.getSpec().getVersion());
//                existingDeployment.getSpec().setReplicas(tomcat.getSpec().getReplicas());
//                kubernetesClient.apps().deployments().inNamespace(sdNS).createOrReplace(existingDeployment);
//            }
        } catch (Exception e) {
            status = new ServiceDomainStatus();
            status.setMessage("Error createOrUpdateResource: " + e.getMessage());
            status.setState(ServiceDomainStatus.State.ERROR);
            status.setError(true);
        }

        sdr.setStatus(status);
        return UpdateControl.updateStatusSubResource(sdr);
    }
}
