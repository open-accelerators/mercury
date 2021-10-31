package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.*;
import io.strimzi.api.kafka.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Controller
public class ServiceDomainController implements ResourceController<ServiceDomain> {

    private static final String BINDING_SERVICE_SA = "bian-binding-service-sa";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);

    @Inject
    KubernetesClient client;

    @Override
    public DeleteControl deleteResource(ServiceDomain sd, Context<ServiceDomain> context) {
        String sdName = sd.getMetadata().getName();
        LOGGER.info("{} service domain deleted successfully", sdName);
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomain> createOrUpdateResource(ServiceDomain sd, Context<ServiceDomain> context) {
        ServiceDomainStatus status = new ServiceDomainStatus();
        String sdName = sd.getMetadata().getName();

        try {
            createOrUpdateServiceAccount(sd);
            createOrUpdateDeployment(sd);
            createOrUpdateService(sd);
            String kafkaTopic = createKafkaTopic(sd);
            String kafkaUser = createKafkaUser(sd, kafkaTopic);

            ServiceDomainStatus sds = new ServiceDomainStatus();
            sds.setKafkaTopic(kafkaTopic);
            sds.setKafkaUser(kafkaUser);
        } catch (Exception e) {
            LOGGER.error("{} service domain failed to be created/updated", sdName, e);
            return UpdateControl.noUpdate();
        }

        sd.setStatus(status);
        return UpdateControl.updateStatusSubResource(sd);
    }

    private String createKafkaUser(ServiceDomain sd, String kafkaTopic) {
        final String kafkaUserName = sd.getMetadata().getName() + "-user";
//        KafkaUser kafkaUser = client.resources(KafkaUser.class).withName(kafkaUserName).get();
//
//        if(kafkaUser == null) {
//            kafkaUser = new KafkaUserBuilder()
//                    .withNewMetadata()
//                    .withName(kafkaUserName)
//                    .withLabels(Map.of("strimzi.io/cluster", "mercury-kafka"))
//                    .endMetadata()
//                    .withNewSpec()
//                    .withAuthentication(new KafkaUserTlsClientAuthenticationBuilder()
//                                                .build())
//                    .withAuthorization(new KafkaUserAuthorizationSimpleBuilder()
//                                        .withAcls(new AclRuleBuilder()
//                                                        .withResource(new AclRuleTopicResourceBuilder()
//                                                                            .withName(kafkaTopic)
//                                                                            .withPatternType(AclResourcePatternType.LITERAL)
//                                                                            .build())
//                                                        .withOperation(AclOperation.READ)
//                                                        .withHost("'*'")
//                                                        .build(),
//                                                  new AclRuleBuilder()
//                                                        .withResource(new AclRuleTopicResourceBuilder()
//                                                                .withName(kafkaTopic)
//                                                                .withPatternType(AclResourcePatternType.LITERAL)
//                                                                .build())
//                                                        .withOperation(AclOperation.DESCRIBE)
//                                                        .withHost("'*'")
//                                                        .build(),
//                                                new AclRuleBuilder()
//                                                        .withResource(new AclRuleTopicResourceBuilder()
//                                                                .withName(kafkaTopic)
//                                                                .withPatternType(AclResourcePatternType.LITERAL)
//                                                                .build())
//                                                        .withOperation(AclOperation.READ)
//                                                        .withHost("'*'")
//                                                        .build())
//                                        .build())
//                    .endSpec()
//                    .build();
//
//            kafkaUser.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
//                    .withName(sd.getMetadata().getName())
//                    .withUid(sd.getMetadata().getUid()).build()));
//
//            client.resources(KafkaUser.class).create(kafkaUser);
//        }

        return kafkaUserName;
    }

    private String createKafkaTopic(ServiceDomain sd) {
        final String kafkaTopicName = sd.getMetadata().getName() + "-topic";
        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(kafkaTopicName).get();

        if(kafkaTopic == null) {
            kafkaTopic = new KafkaTopicBuilder()
                    .withNewMetadata()
                    .withName(kafkaTopicName)
                    .withLabels(Map.of("strimzi.io/cluster", "mercury-kafka"))
                    .endMetadata()
                    .withNewSpec()
                    .withPartitions(1)
                    .withReplicas(1)
                    .endSpec()
                    .build();

            kafkaTopic.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                    .withName(sd.getMetadata().getName())
                    .withUid(sd.getMetadata().getUid()).build()));

            client.resources(KafkaTopic.class).create(kafkaTopic);
        }

        return kafkaTopicName;
    }

    private void createOrUpdateDeployment(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Deployment deployment = new DeploymentBuilder()
                .withApiVersion("apps/v1")
                .withNewMetadata()
                .withName(sdName)
                .withNamespace(sdNS)//TODO: does it need to be in a namespace
                .withLabels(Map.of("app", "bian-" + sdName, "service-domain", sdName))
                .endMetadata()
                .withSpec(new DeploymentSpecBuilder()
                                .withSelector(new LabelSelectorBuilder()
                                                .withMatchLabels(Map.of("app", "bian-" + sdName))
                                                .build())
                                .withTemplate(new PodTemplateSpecBuilder()
                                                    .withNewMetadata()
                                                    .withLabels(Map.of("app", "bian-" + sdName, "service-domain", sdName))
                                                    .endMetadata()
                                                    .withSpec(new PodSpecBuilder()
                                                                    .withServiceAccountName("bian-binding-service-sa")
                                                                    .withContainers(new ContainerBuilder()
                                                                                        .withName("business-service")
                                                                                        .withImage(sd.getSpec().getBusinessImage())
                                                                                        .withPorts(new ContainerPortBuilder()
                                                                                                .withContainerPort(10001)
                                                                                                .withName("inbound").build())
                                                                                        .withEnv(new EnvVarBuilder()
                                                                                                        .withName("QUARKUS_HTTP_PORT")
                                                                                                        .withValue("8081").build(),
                                                                                                new EnvVarBuilder()
                                                                                                        .withName("MERCURY_SERVICEDOMAIN")
                                                                                                        .withValue(sdName).build())
                                                                                        .build(),
                                                                                    new ContainerBuilder()
                                                                                        .withName("binding-service")
                                                                                        .withImage(sd.getSpec().getBindingServiceImage())
                                                                                        .withPorts(new ContainerPortBuilder()
                                                                                                        .withContainerPort(10100)
                                                                                                        .withName("outbound").build(),
                                                                                                new ContainerPortBuilder()
                                                                                                        .withContainerPort(10101)
                                                                                                        .withName("internal").build(),
                                                                                                new ContainerPortBuilder()
                                                                                                        .withContainerPort(8080)
                                                                                                        .withName("http").build())
                                                                                        .withEnv(new EnvVarBuilder()
                                                                                                        .withName("MERCURY_SERVICEDOMAIN")
                                                                                                        .withValue(sdName).build(),
                                                                                                new EnvVarBuilder()
                                                                                                        .withName("MERCURY_KAFKA_BROKERS")
                                                                                                        .withValue("").build())
                                                                                        .build())//TODO: set the correct value)
                                                                    .build())
                                                    .build())
                                .build())
                .build();

        deployment.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid()).build()));

        final DeploymentList sdDeploymentList = client.apps().deployments().inNamespace(sdNS).list();
        if(sdDeploymentList.getItems().isEmpty()) {
            client.apps().deployments().inNamespace(sdNS).create(deployment);
            LOGGER.debug("{} deployment was created successfully", sdName);
        } else {
            client.apps().deployments().inNamespace(sdNS).replace(deployment);
            LOGGER.debug("{} deployment was updated successfully", sdName);
        }
    }

    private void createOrUpdateService(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Service service = new ServiceBuilder()
                .withApiVersion("v1")
                .withNewMetadata()
                .withName(sdName + "-binding")
                .withNamespace(sdNS)//TODO: does it need to be in a namespace
                .withLabels(Map.of("app", "bian-" + sdName,
                                   "service-domain", sdName,
                                   "mercury-binding", "internal"))//TODO: where do I get the value
                .endMetadata()
                .withNewSpec()
                .withPorts(new ServicePortBuilder()
                                .withPort(10101)//TODO: where do I get the value
                                .withProtocol("TCP")//TODO: where do I get the value
                                .withName("internal").build())
                .withSelector(Map.of("app", "bian-" + sdName))//TODO: where do I get the value
                .endSpec().build();

        service.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid()).build()));

        final ServiceList sdServiceList = client.services().inNamespace(sdNS).list();

        if(sdServiceList.getItems().isEmpty()) {
            client.services().inNamespace(sdNS).create(service);//TODO: does it need to be in a namespace
            LOGGER.debug("{} service was created successfully", sdName + "-binding");
        } else {
            LOGGER.debug("{} service was updated successfully", sdName + "-binding");
            client.services().inNamespace(sdNS).replace(service);//TODO: does it need to be in a namespace
        }
   }

    private void createOrUpdateServiceAccount(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();

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

            serviceAccount.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                    .withName(sd.getMetadata().getName())
                    .withUid(sd.getMetadata().getUid()).build()));

            final ServiceAccountList sdServiceAccountList = client.serviceAccounts().inNamespace(sdNS).list();

            if(sdServiceAccountList.getItems().isEmpty()) {
                client.serviceAccounts().create(serviceAccount);//TODO: does it need to be in a namespace
                LOGGER.debug("{} service account was created successfully", BINDING_SERVICE_SA);
            } else {
                client.serviceAccounts().replace(serviceAccount);//TODO: does it need to be in a namespace
                LOGGER.debug("{} service account was updated successfully", BINDING_SERVICE_SA);
            }
        }
    }
}
