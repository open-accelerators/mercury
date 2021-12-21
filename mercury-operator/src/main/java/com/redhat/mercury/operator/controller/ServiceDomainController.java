package com.redhat.mercury.operator.controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import com.google.common.base.CaseFormat;
import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainSpec;
import com.redhat.mercury.operator.model.ServiceDomainStatus;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.ContainerBuilder;
import io.fabric8.kubernetes.api.model.ContainerPortBuilder;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.model.GenericKubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.api.model.PodSpecBuilder;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.ServiceAccountBuilder;
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.ServicePortBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.client.dsl.base.ResourceDefinitionContext;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.Controller;
import io.javaoperatorsdk.operator.api.DeleteControl;
import io.javaoperatorsdk.operator.api.ResourceController;
import io.javaoperatorsdk.operator.api.UpdateControl;
import io.strimzi.api.kafka.model.AclOperation;
import io.strimzi.api.kafka.model.AclResourcePatternType;
import io.strimzi.api.kafka.model.AclRuleBuilder;
import io.strimzi.api.kafka.model.AclRuleTopicResourceBuilder;
import io.strimzi.api.kafka.model.KafkaTopic;
import io.strimzi.api.kafka.model.KafkaTopicBuilder;
import io.strimzi.api.kafka.model.KafkaUser;
import io.strimzi.api.kafka.model.KafkaUserAuthorizationSimpleBuilder;
import io.strimzi.api.kafka.model.KafkaUserBuilder;
import io.strimzi.api.kafka.model.KafkaUserTlsClientAuthenticationBuilder;

@Controller
public class ServiceDomainController implements ResourceController<ServiceDomain> {

    public static final String BINDING_SERVICE_SA = "bian-binding-service-sa";
    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_KIND = "ServiceDomain";
    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION = "mercury.redhat.io/v1alpha1";
    public static final String MERCURY_BINDING_LABEL = "mercury-binding";
    public static final String INTEGRATION_SUFFIX = "-camelk-rest";
    public static final String CONFIG_MAP_OPENAPI_JSON_KEY = "openapi.json";
    public static final String CONFIG_MAP_GRPC_KEY = "grpc.yaml";
    public static final String CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY = "directs.yaml";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);
    private static final String SERVICE_DOMAIN_LABEL = "service-domain";
    private static final String BUSINESS_SERVICE_CONTAINER_NAME = "business-service";
    private static final String APP_LABEL = "app";
    private static final String MERCURY_KAFKA_BROKER_ENV_VAR = "KAFKA_BOOTSTRAP_SERVERS";
    private static final String INTERNAL = "internal";
    private static final String TCP_PROTOCOL = "TCP";
    private static final String DEPLOYMENT_CONTAINER_IMAGE_PULL_POLICY = "Always";
    private static final String GRPC_NAME = "grpc";
    private static final int GRPC_PORT = 9000;
    private static final String COMMENT_LINE_REGEX = "(?m)^#.*";

    @Inject
    KubernetesClient client;

    @ConfigProperty(name = "application.version")
    String version;

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
        final String sdcName = sd.getSpec().getServiceDomainCluster();

        ServiceDomainCluster sdc = client.resources(ServiceDomainCluster.class).withName(sdcName).get();
        if (sdc == null) {
            LOGGER.error("{} service domain cluster not found", sdcName);
            status.setError(sdcName + " service domain cluster not found");
            sd.setStatus(status);
            return UpdateControl.updateStatusSubResource(sd);
        }

        if (sdc.getStatus() == null || sdc.getStatus().getKafkaBroker() == null) {
            LOGGER.error("kafka broker url not found");
            status.setError("kafka broker url not found");
            sd.setStatus(status);
            return UpdateControl.updateStatusSubResource(sd);
        }

        try {
            createOrUpdateServiceAccount(sd);
            createOrUpdateDeployment(sd, sdc.getStatus().getKafkaBroker());
            createOrUpdateService(sd);
            if (sd.getSpec().getExpose() != null && sd.getSpec().getExpose().contains(ServiceDomainSpec.ExposeType.http)) {
                final String sdConfigMapName = "integration-" + CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sd.getSpec().getType().toString()) + "-http";
                ConfigMap sdConfigMap = client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(sdConfigMapName).get();

                final boolean validateSdConfigMap = validateSdConfigMap(sd, sdConfigMapName, sdConfigMap);
                if (!validateSdConfigMap) {
                    return UpdateControl.noUpdate();
                }

                createOrUpdateCamelKHttpIntegration(sd, sdConfigMap);
            } else if (sd.getSpec().getExpose() == null || !sd.getSpec().getExpose().contains(ServiceDomainSpec.ExposeType.http)) {
                deleteCamelHttpIntegration(sd);
            } else {

            }

            String kafkaTopic = createKafkaTopic(sd);
            status.setKafkaTopic(kafkaTopic);
        } catch (Exception e) {
            LOGGER.error("{} service domain failed to be created/updated", sdName, e);
            status.setError(e.getMessage());
        }

        sd.setStatus(status);
        return UpdateControl.updateStatusSubResource(sd);
    }

    private void deleteCamelHttpIntegration(ServiceDomain sd) {
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;

        ResourceDefinitionContext resourceDefinitionContext = new ResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withNamespaced(true)
                .build();

        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(sd.getMetadata().getNamespace()).withName(integrationName).get();
        if (integration != null) {
            client.genericKubernetesResources(resourceDefinitionContext).inNamespace(sd.getMetadata().getNamespace()).withName(integrationName).delete();
        }
    }

    private void createOrUpdateCamelKHttpIntegration(ServiceDomain sd, ConfigMap configMap) throws IOException {
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        String sdCamelRouteYaml = configMap.getData().get(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY);
        String grpcYaml = configMap.getData().get(CONFIG_MAP_GRPC_KEY);
        String sdOpenAPIYaml = configMap.getData().get(CONFIG_MAP_OPENAPI_JSON_KEY);

        String yamlString = mergeCamelYamls(sd, integrationName, sdOpenAPIYaml, sdCamelRouteYaml, grpcYaml);

        CustomResourceDefinitionContext resourceDefinitionContext = new CustomResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .build();

        final GenericKubernetesResource integration = client.genericKubernetesResources(resourceDefinitionContext).inNamespace(sd.getMetadata().getNamespace()).withName(integrationName).get();

        if (integration == null) {
            final Map<String, Object> resource = new Yaml().load(yamlString);
            // GenericKubernetesResource doesn't work because it uses Random underneath
            client.customResource(resourceDefinitionContext).inNamespace(sd.getMetadata().getNamespace()).create(resource);
            LOGGER.debug("{} integration was missing, creating it", integrationName);
        } else {
            if (!Objects.equals(integration.getMetadata().getOwnerReferences().get(0).getUid(), sd.getMetadata().getUid())) {
                client.genericKubernetesResources(resourceDefinitionContext).inNamespace(client.getNamespace()).withName(integrationName).edit(object -> {
                    object.getMetadata().getOwnerReferences().get(0).setUid(sd.getMetadata().getUid());
                    return object;
                });
                LOGGER.debug("{} integration was updated", integrationName);
            }
        }
    }

    private boolean validateSdConfigMap(ServiceDomain sd, String sdConfigMapName, ConfigMap configMap) {
        final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
        final String sdTypeAsString = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sdType.toString());

        if (configMap == null) {
            LOGGER.error("{} config map is missing ", sdConfigMapName);
            return false;
        }

        String sdCamelRouteYaml = configMap.getData().get(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY);
        String grpcYaml = configMap.getData().get(CONFIG_MAP_GRPC_KEY);
        if (sdCamelRouteYaml == null || grpcYaml == null) {
            if (sdCamelRouteYaml == null) {
                LOGGER.error("{} config map value is missing", sdTypeAsString + "-direct.yaml");
            }

            if (grpcYaml == null) {
                LOGGER.error("{} config map value is missing", "grpc.yaml");
            }

            return false;
        }

        return true;
    }

    private String mergeCamelYamls(ServiceDomain sd, String integrationName, String sdOpenAPIYaml, String sdCamelRouteYaml, String grpcYaml) {
        final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
        final String sdTypeAsString = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sdType.toString());

        sdCamelRouteYaml = sdCamelRouteYaml.replaceAll(COMMENT_LINE_REGEX, "").trim();
        grpcYaml = grpcYaml.replaceAll(COMMENT_LINE_REGEX, "").trim();

        Yaml yaml = new Yaml();
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("apiVersion", "camel.apache.org/v1");
        data.put("kind", "Integration");
        data.put("metadata", Map.of("name", integrationName,
                "namespace", sd.getMetadata().getNamespace(),
                "ownerReferences", List.of(new TreeMap<>(Map.of("apiVersion", SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION,
                        "kind", SERVICE_DOMAIN_OWNER_REFERENCES_KIND,
                        "name", sd.getMetadata().getName(),
                        "uid", sd.getMetadata().getUid())))));
        final Map<String, Object> specMap = new TreeMap<>(Map.of("configuration", List.of(new TreeMap<>(Map.of("type", "env", "value", "MERCURY_BINDING_SERVICE_HOST=" + sdTypeAsString)),
                        new TreeMap<>(Map.of("type", "env", "value", "MERCURY_BINDING_SERVICE_PORT=" + GRPC_PORT))),
                "dependencies", List.of(Map.of("mvn", "com.redhat.mercury:" + sdTypeAsString + "-integration-camel:" + version),
                        Map.of("mvn", "com.redhat.mercury:mercury-camel:" + version)),
                "flows", yaml.load(sdCamelRouteYaml + "\n" + grpcYaml)));

        if (sdOpenAPIYaml != null) {
            specMap.put("resources", List.of(new TreeMap<>(Map.of("content", sdOpenAPIYaml, "name", sd.getSpec().getType().name() + ".json", "type", "openapi"))));
        }

        data.put("spec", specMap);

        String yamlAsString = yaml.dumpAsMap(data);
        //Workaround since snakeyaml is putting a space after : and in the spec.dependencies section that is invalid
        yamlAsString = yamlAsString.replace("mvn: ", "mvn:");

        return yamlAsString;
    }

    private String createKafkaUser(ServiceDomain sd, String kafkaTopic) {
        final String kafkaUserName = sd.getMetadata().getName() + "-user";
        KafkaUser kafkaUser = client.resources(KafkaUser.class).withName(kafkaUserName).get();

        KafkaUser desiredKafkaUser = new KafkaUserBuilder()
                .withNewMetadata()
                .withName(kafkaUserName)
                .withLabels(Map.of("strimzi.io/cluster", "mercury-kafka"))
                .endMetadata()
                .withNewSpec()
                .withAuthentication(new KafkaUserTlsClientAuthenticationBuilder()
                        .build())
                .withAuthorization(new KafkaUserAuthorizationSimpleBuilder()
                        .withAcls(new AclRuleBuilder()
                                        .withResource(new AclRuleTopicResourceBuilder()
                                                .withName(kafkaTopic)
                                                .withPatternType(AclResourcePatternType.LITERAL)
                                                .build())
                                        .withOperation(AclOperation.READ)
                                        .withHost("*")
                                        .build(),
                                new AclRuleBuilder()
                                        .withResource(new AclRuleTopicResourceBuilder()
                                                .withName(kafkaTopic)
                                                .withPatternType(AclResourcePatternType.LITERAL)
                                                .build())
                                        .withOperation(AclOperation.DESCRIBE)
                                        .withHost("*")
                                        .build(),
                                new AclRuleBuilder()
                                        .withResource(new AclRuleTopicResourceBuilder()
                                                .withName(kafkaTopic)
                                                .withPatternType(AclResourcePatternType.LITERAL)
                                                .build())
                                        .withOperation(AclOperation.READ)
                                        .withHost("*")
                                        .build())
                        .build())
                .endSpec()
                .build();

        desiredKafkaUser.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        if (kafkaUser == null) {
            client.resources(KafkaUser.class).create(desiredKafkaUser);
            LOGGER.debug("{} kafka user was missing, creating it", kafkaUserName);
        } else {
            if (!Objects.equals(kafkaUser.getSpec(), desiredKafkaUser.getSpec()) || !Objects.equals(kafkaUser.getMetadata().getOwnerReferences(), desiredKafkaUser.getMetadata().getOwnerReferences())) {
                client.resources(KafkaUser.class).replace(desiredKafkaUser);
                LOGGER.debug("{} kafka topic was updated", desiredKafkaUser);
            }
        }

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

        if (kafkaTopic == null) {
            client.resources(KafkaTopic.class).create(desiredKafkaTopic);
            LOGGER.debug("{} kafka topic was missing, creating it", kafkaTopicName);
        } else {
            if (!Objects.equals(kafkaTopic.getSpec(), desiredKafkaTopic.getSpec()) || !Objects.equals(kafkaTopic.getMetadata().getOwnerReferences(), desiredKafkaTopic.getMetadata().getOwnerReferences())) {
                client.resources(KafkaTopic.class).replace(desiredKafkaTopic);
                LOGGER.debug("{} kafka topic was updated", kafkaTopicName);
            }
        }

        return kafkaTopicName;
    }

    private void createOrUpdateDeployment(ServiceDomain sd, String kafkaBrokerUrl) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Deployment desiredDeployment = new DeploymentBuilder()
                .withApiVersion("apps/v1")
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
//                                                                    .withServiceAccountName(SERVICE_ACCOUNT_NAME)
                                        .withContainers(new ContainerBuilder()
                                                .withName(BUSINESS_SERVICE_CONTAINER_NAME)
                                                .withImage(sd.getSpec().getBusinessImage())
                                                .withImagePullPolicy(DEPLOYMENT_CONTAINER_IMAGE_PULL_POLICY)
                                                .withPorts(new ContainerPortBuilder()
                                                        .withContainerPort(GRPC_PORT)
                                                        .withName(GRPC_NAME).build())
                                                .withEnv(new EnvVarBuilder()
                                                        .withName(MERCURY_KAFKA_BROKER_ENV_VAR)
                                                        .withValue(kafkaBrokerUrl).build())
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

        if (sdDeployment == null) {
            client.apps().deployments().inNamespace(sdNS).create(desiredDeployment);
            LOGGER.debug("{} deployment was missing, creating it", sdName);
        } else {
            if (!Objects.equals(sdDeployment.getSpec(), desiredDeployment.getSpec()) || !Objects.equals(sdDeployment.getMetadata().getOwnerReferences(), desiredDeployment.getMetadata().getOwnerReferences())) {
                client.apps().deployments().inNamespace(sdNS).replace(desiredDeployment);
                LOGGER.debug("{} deployment was updated", sdName);
            }
        }
    }

    private void createOrUpdateService(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Service desiredService = new ServiceBuilder()
                .withApiVersion("v1")
                .withNewMetadata()
                .withName(sdName)
                .withNamespace(sdNS)
                .withLabels(Map.of(APP_LABEL, "bian-" + sdName, SERVICE_DOMAIN_LABEL, sdName, MERCURY_BINDING_LABEL, INTERNAL))
                .endMetadata()
                .withNewSpec()
                .withPorts(new ServicePortBuilder()
                        .withPort(GRPC_PORT)
                        .withProtocol(TCP_PROTOCOL)
                        .withName(GRPC_NAME).build())
                .withSelector(Map.of(APP_LABEL, "bian-" + sdName))
                .endSpec().build();

        desiredService.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        final Service sdService = client.services().inNamespace(sdNS).withName(sdName).get();

        if (sdService == null) {
            client.services().inNamespace(sdNS).create(desiredService);
            LOGGER.debug("{} service was missing, creating it", sdName);
        } else {
            if (!Objects.equals(sdService.getSpec(), desiredService.getSpec()) || !Objects.equals(sdService.getMetadata().getOwnerReferences(), desiredService.getMetadata().getOwnerReferences())) {
                client.services().inNamespace(sdNS).replace(desiredService);
                LOGGER.debug("{} service was updated", sdName);
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

        if (serviceAccount == null) {
            client.serviceAccounts().inNamespace(sdNS).create(desiredServiceAccount);
            LOGGER.debug("{} service account was missing, creating it", BINDING_SERVICE_SA);
        } else {
            if (!Objects.equals(serviceAccount.getMetadata().getOwnerReferences(), desiredServiceAccount.getMetadata().getOwnerReferences())) {
                client.serviceAccounts().inNamespace(sdNS).replace(desiredServiceAccount);
                LOGGER.debug("{} service account was updated", BINDING_SERVICE_SA);
            }
        }
    }
}
