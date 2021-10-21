package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainClusterRequest;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatus;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import io.fabric8.kubernetes.api.model.rbac.*;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller(namespaces = Controller.WATCH_CURRENT_NAMESPACE)
public class ServiceDomainClusterController implements ResourceController<ServiceDomainClusterRequest> {

    public static final String SERVICE_DOMAIN_ROLE = "service-domain-role";
    public static final String ROLE_BINDING = "service-domain-role-binding";
    public static final String SUBJECT_NAME = "bian-binding-service-sa";
    public static final String SUBJECT_KIND = "ServiceAccount";
    public static final String ROLE_REF = "service-domain-role";
    public static final String ROLE_REF_KIND = "Role";
    public static final String ROLE_REF_API_GROUP = "rbac.authorization.k8s.io";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainClusterController.class);

    @Inject
    KubernetesClient client;

    @Override
    public DeleteControl deleteResource(ServiceDomainClusterRequest sdrc, Context<ServiceDomainClusterRequest> context) {
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomainClusterRequest> createOrUpdateResource(ServiceDomainClusterRequest sdcr, Context<ServiceDomainClusterRequest> context) {
        ServiceDomainClusterStatus status = new ServiceDomainClusterStatus();
        try {
            String sdcrNS = sdcr.getMetadata().getNamespace();
            String sdcrName = sdcr.getMetadata().getName();
            createOrUpdateRole(sdcrNS);
            createOrUpdateRoleBinding(sdcrNS);
            createOrUpdateKafkaBroker(sdcrNS);
        } catch (Exception e) {
            status = new ServiceDomainClusterStatus();
            status.setMessage("Error createOrUpdateResource: " + e.getMessage());
            status.setState(ServiceDomainStatus.State.ERROR);
            status.setError(true);
        }

        sdcr.setStatus(status);
        return UpdateControl.updateStatusSubResource(sdcr);
    }

    private void createOrUpdateRole(String sdrcNS) {
        Role role = client
                .rbac().roles()
//                .inNamespace(sdrcNS)
                .withName(SERVICE_DOMAIN_ROLE).get();

        if(role == null) {
            LOGGER.info(SERVICE_DOMAIN_ROLE + " role doesn't exist");
            final PolicyRule rule = new PolicyRuleBuilder().withApiGroups("", "mercury.redhat.io").withResources("services", "servicedomainbindings").withVerbs("list", "get", "watch").build();
            role = new RoleBuilder()
                    .withNewMetadata()
                    .withName(SERVICE_DOMAIN_ROLE)
                    .endMetadata()
                    .withRules(rule)
                    .build();
            try {
                client.rbac().roles().createOrReplace(role);
                LOGGER.info(SERVICE_DOMAIN_ROLE + " role was created successfully");
            } catch (Exception e) {
                LOGGER.info(SERVICE_DOMAIN_ROLE + " role failed to be created");
                throw e;
            }
        }
    }

    private void createOrUpdateRoleBinding(String sdrcNS) {
        RoleBinding roleBinding = client
                .rbac().roleBindings()
//                .inNamespace(sdrcNS)
                .withName(ROLE_BINDING).get();

        if(roleBinding == null){
            LOGGER.info(ROLE_BINDING + " role binding doesn't exist");
            final RoleRef roleRef = new RoleRefBuilder().withName(ROLE_REF).withApiGroup(ROLE_REF_API_GROUP).withKind(ROLE_REF_KIND).build();
            roleBinding = new RoleBindingBuilder()
                    .withNewMetadata()
                    .withName(ROLE_BINDING)
                    .endMetadata()
                    .withRoleRef(roleRef)
                    .withSubjects(new SubjectBuilder().withName(SUBJECT_NAME).withKind(SUBJECT_KIND).build())
                    .build();

            try {
                client.rbac().roleBindings().createOrReplace(roleBinding);
                LOGGER.info(ROLE_BINDING + " role binding was created successfully");
            } catch (Exception e){
                LOGGER.info(SERVICE_DOMAIN_ROLE + " role binding failed to be created");
                throw e;
            }
        }
    }

    private void createOrUpdateKafkaBroker(String sdrcNS) {

    }
}
