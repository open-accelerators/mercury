package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.*;
import io.strimzi.api.kafka.model.KafkaTopic;
import io.strimzi.api.kafka.model.KafkaTopicBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class ServiceDomainController implements ResourceController<ServiceDomain> {

    public static final String BINDING_SERVICE_SA = "bian-binding-service-sa";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);
    private static final String SERVICE_DOMAIN_LABEL = "service-domain";
    private static final String SERVICE_ACCOUNT_NAME = "bian-binding-service-sa";
    private static final String BUSINESS_SERVICE_CONTAINER_NAME = "business-service";
    private static final String QUARKUS_HTTP_PORT_ENV_VAR = "QUARKUS_HTTP_PORT";
    private static final String QUARKUS_HTTP_PORT = "8081";
    private static final String MERCURY_SERVICE_DOMAIN_ENV_VAR = "MERCURY_SERVICEDOMAIN";
    private static final String CONTAINER_NAME_INBOUND = "inbound";
    private static final String BINDING_SERVICE_CONTAINER_NAME = "binding-service";
    private static final String APP_LABEL = "app";
    private static final String CONTAINER_NAME_OUTBOUND = "outbound";
    private static final String MERCURY_KAFKA_BROKER_ENV_VAR = "MERCURY_KAFKA_BROKERS";
    private static final String INTERNAL = "internal";
    private static final String HTTP_CONTAINER_NAME = "http";
    private static final String TCP_PROTOCOL = "TCP";
    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_KIND = "ServiceDomain";
    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION = "mercury.redhat.io/v1alpha1";

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
        String kafkaBrokerUr;
        ServiceDomainStatus status = new ServiceDomainStatus();
        String sdName = sd.getMetadata().getName();

        try {
            final ServiceDomainCluster serviceDomainCluster = client.resources(ServiceDomainCluster.class)
                    .inNamespace(client.getNamespace())
                    .withName(sd.getSpec().getServiceDomainCluster()).get();

            if(isKafkaBrokerUrlInCluster(serviceDomainCluster)){
                kafkaBrokerUr = serviceDomainCluster.getStatus().getKafkaBroker();

                createOrUpdateServiceAccount(sd);
                createOrUpdateDeployment(sd, kafkaBrokerUr);
                createOrUpdateService(sd);
                String kafkaTopic = createKafkaTopic(sd);
                String kafkaUser = createKafkaUser(sd, kafkaTopic);

                status.setKafkaTopic(kafkaTopic);
                status.setKafkaUser(kafkaUser);
            }
        } catch (Exception e) {
            LOGGER.error("{} service domain failed to be created/updated", sdName, e);
            return UpdateControl.noUpdate();
        }

        sd.setStatus(status);
        return UpdateControl.updateStatusSubResource(sd);
    }

    private boolean isKafkaBrokerUrlInCluster(ServiceDomainCluster serviceDomainCluster) {
        return serviceDomainCluster != null && serviceDomainCluster.getStatus() != null && serviceDomainCluster.getStatus().getKafkaBroker() != null;
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

        KafkaTopic desiredKafkaTopic = new KafkaTopicBuilder()
                .withNewMetadata()
                .withName(kafkaTopicName)
                .withLabels(Map.of("strimzi.io/cluster", "mercury-kafka"))
                .endMetadata()
                .withNewSpec()
                .withPartitions(1)
                .withReplicas(1)
                .endSpec()
                .build();

        desiredKafkaTopic.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        final KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).withName(kafkaTopicName).get();

        if(kafkaTopic == null) {
            client.resources(KafkaTopic.class).create(desiredKafkaTopic);
            LOGGER.debug("{} kafka topic was missing, creating it", kafkaTopicName);
        } else {
            if(!Objects.equals(kafkaTopic.getSpec(), desiredKafkaTopic.getSpec())) {
                client.resources(KafkaTopic.class).replace(desiredKafkaTopic);
                LOGGER.debug("{} kafka topic was updated", kafkaTopicName);
            }
        }

        return kafkaTopicName;
    }

    private void createOrUpdateDeployment(ServiceDomain sd, String kafkaBrokerUr) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Deployment desiredDeployment = new DeploymentBuilder()
                .withNewMetadata()
                .withName(sdName)
                .withNamespace(sdNS)
                .withLabels(Map.of(APP_LABEL, "bian-" + sdName, SERVICE_DOMAIN_LABEL, sdName))
                .endMetadata()
                .withSpec(new DeploymentSpecBuilder()
                                .withSelector(new LabelSelectorBuilder()
                                                .withMatchLabels(Map.of(APP_LABEL, "bian-" + sdName))
                                                .build())
                                .withTemplate(new PodTemplateSpecBuilder()
                                                    .withNewMetadata()
                                                    .withLabels(Map.of(APP_LABEL, "bian-" + sdName, SERVICE_DOMAIN_LABEL, sdName))
                                                    .endMetadata()
                                                    .withSpec(new PodSpecBuilder()
                                                                    .withServiceAccountName(SERVICE_ACCOUNT_NAME)
                                                                    .withContainers(new ContainerBuilder()
                                                                                        .withName(BUSINESS_SERVICE_CONTAINER_NAME)
                                                                                        .withImage(sd.getSpec().getBusinessImage())
                                                                                        .withPorts(new ContainerPortBuilder()
                                                                                                .withContainerPort(10001)
                                                                                                .withName(CONTAINER_NAME_INBOUND).build())
                                                                                        .withEnv(new EnvVarBuilder()
                                                                                                        .withName(QUARKUS_HTTP_PORT_ENV_VAR)
                                                                                                        .withValue(QUARKUS_HTTP_PORT).build(),
                                                                                                new EnvVarBuilder()
                                                                                                        .withName(MERCURY_SERVICE_DOMAIN_ENV_VAR)
                                                                                                        .withValue(sdName).build())
                                                                                        .build(),
                                                                                    new ContainerBuilder()
                                                                                        .withName(BINDING_SERVICE_CONTAINER_NAME)
                                                                                        .withImage(sd.getSpec().getBindingServiceImage())
                                                                                        .withPorts(new ContainerPortBuilder()
                                                                                                        .withContainerPort(10100)
                                                                                                        .withName(CONTAINER_NAME_OUTBOUND).build(),
                                                                                                new ContainerPortBuilder()
                                                                                                        .withContainerPort(10101)
                                                                                                        .withName(INTERNAL).build(),
                                                                                                new ContainerPortBuilder()
                                                                                                        .withContainerPort(8080)
                                                                                                        .withName(HTTP_CONTAINER_NAME).build())
                                                                                        .withEnv(new EnvVarBuilder()
                                                                                                        .withName(MERCURY_SERVICE_DOMAIN_ENV_VAR)
                                                                                                        .withValue(sdName).build(),
                                                                                                new EnvVarBuilder()
                                                                                                        .withName(MERCURY_KAFKA_BROKER_ENV_VAR)
                                                                                                        .withValue(kafkaBrokerUr).build())
                                                                                        .build())
                                                                    .build())
                                                    .build())
                                .build())
                .build();

        desiredDeployment.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        final Deployment sdDeployment = client.apps().deployments().inNamespace(sdNS).withName(sdName).get();

        if(sdDeployment == null) {
            client.apps().deployments().inNamespace(sdNS).create(desiredDeployment);
            LOGGER.debug("{} deployment was missing, creating it", sdName);
        } else {
            if(!Objects.equals(sdDeployment.getSpec(), desiredDeployment.getSpec())) {
                client.apps().deployments().inNamespace(sdNS).replace(desiredDeployment);
                LOGGER.debug("{} deployment was updated", sdName);
            }
        }
    }

    private void createOrUpdateService(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        final String serviceName = sdName + "-binding";
        Service desiredService = new ServiceBuilder()
                .withApiVersion("v1")
                .withNewMetadata()
                .withName(serviceName)
                .withNamespace(sdNS)
                .withLabels(Map.of(APP_LABEL, "bian-" + sdName,
                                   "com.redhat.mercury/service-domain", sdName,
                                   "com.redhat.mercury/service-domain-binding", INTERNAL,
                                   "com.redhat.mercury/service-domain-cluster", sd.getSpec().getServiceDomainCluster()))
                .endMetadata()
                .withNewSpec()
                .withPorts(new ServicePortBuilder()
                                .withPort(10101)
                                .withProtocol(TCP_PROTOCOL)
                                .withName(INTERNAL).build())
                .withSelector(Map.of(APP_LABEL, "bian-" + sdName))
                .endSpec().build();

        desiredService.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        final Service sdService = client.services().inNamespace(sdNS).withName(serviceName).get();

        if(sdService == null) {
            client.services().inNamespace(sdNS).create(desiredService);
            LOGGER.debug("{} service was missing, creating it", serviceName);
        } else {
            if(!Objects.equals(sdService.getSpec(), desiredService.getSpec())) {
                client.services().inNamespace(sdNS).replace(desiredService);
                LOGGER.debug("{} service was updated", serviceName);
            }
        }
   }

    private void createOrUpdateServiceAccount(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();

        ServiceAccount desiredServiceAccount = new ServiceAccountBuilder()
                .withNewMetadata()
                .withName(BINDING_SERVICE_SA)
                .withNamespace(sdNS)
                .endMetadata()
                .build();

        desiredServiceAccount.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        ServiceAccount serviceAccount = client.serviceAccounts().inNamespace(sdNS).withName(BINDING_SERVICE_SA).get();

        if(serviceAccount == null) {
            client.serviceAccounts().inNamespace(sdNS).create(desiredServiceAccount);
            LOGGER.debug("{} service account was missing, creating it", BINDING_SERVICE_SA);
        } else {
            if(!Objects.equals(serviceAccount, desiredServiceAccount)) {
                client.serviceAccounts().inNamespace(sdNS).replace(desiredServiceAccount);
                LOGGER.debug("{} service account was updated", BINDING_SERVICE_SA);
            }
        }
    }
}
