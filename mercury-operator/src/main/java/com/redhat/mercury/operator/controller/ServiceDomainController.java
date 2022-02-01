package com.redhat.mercury.operator.controller;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

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
import io.fabric8.kubernetes.api.model.ServiceBuilder;
import io.fabric8.kubernetes.api.model.ServicePortBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentBuilder;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpecBuilder;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.client.dsl.base.ResourceDefinitionContext;
import io.fabric8.kubernetes.client.informers.SharedIndexInformer;
import io.fabric8.kubernetes.model.Scope;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceContext;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceInitializer;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
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

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.REASON_FAILED;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_INTEGRATION_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_KAFKA_TOPIC_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_SERVICE_DOMAIN_CLUSTER_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_INTEGRATION_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_SDC_NOT_FOUND;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_SDC_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.REASON_INTEGRATION;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.REASON_SDC;

@ControllerConfiguration
public class ServiceDomainController extends AbstractController<ServiceDomainSpec, ServiceDomainStatus, ServiceDomain> implements Reconciler<ServiceDomain>, EventSourceInitializer<ServiceDomain> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);

    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_KIND = "ServiceDomain";
    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION = "mercury.redhat.io/v1alpha1";
    public static final String MERCURY_BINDING_LABEL = "mercury-binding";
    public static final String INTEGRATION_SUFFIX = "-camelk-rest";
    public static final String CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY = "directs.yaml";
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
    private static final String APP_LABEL_BIAN_PREFIX = "bian-";
    private static final String INTEGRATION_SPEC_PROPERTY = "spec";
    private static final String INTEGRATION_STATUS_PROPERTY = "status";
    private static final String INTEGRATION_TYPE_PROPERTY = "type";
    private static final String INTEGRATION_CONDITIONS_PROPERTY = "conditions";

    @ConfigProperty(name = "application.version")
    String version;

    @Override
    public List<EventSource> prepareEventSources(EventSourceContext<ServiceDomain> context) {
        SharedIndexInformer<Deployment> deploymentInformer = client.resources(Deployment.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        CustomResourceDefinitionContext resourceDefinitionContext = new CustomResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withScope(Scope.NAMESPACED.toString())
                .build();

        SharedIndexInformer<GenericKubernetesResource> integrationInformer = client.genericKubernetesResources(resourceDefinitionContext)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        SharedIndexInformer<KafkaTopic> kafkaTopicInformer = client.resources(KafkaTopic.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        SharedIndexInformer<Service> servicesInformer = client.services()
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        return List.of(getInformerEventSource(deploymentInformer),
                       getInformerEventSource(integrationInformer),
                       getInformerEventSource(kafkaTopicInformer),
                       getInformerEventSource(servicesInformer));
    }

    @Override
    public UpdateControl<ServiceDomain> reconcile(ServiceDomain sd, Context context) {
        setStatusCondition(sd, CONDITION_READY, Boolean.FALSE);

        String sdName = sd.getMetadata().getName();
        final String sdcName = sd.getSpec().getServiceDomainCluster();

        ServiceDomainCluster sdc = client.resources(ServiceDomainCluster.class).inNamespace(sd.getMetadata().getNamespace()).withName(sdcName).get();
        if (sdc == null) {
            LOGGER.error("{} service domain cluster not found", sdcName);
            setStatusCondition(sd, CONDITION_READY, Boolean.FALSE);
            setStatusCondition(sd, CONDITION_SERVICE_DOMAIN_CLUSTER_READY, REASON_SDC, sdcName + " " + MESSAGE_SDC_NOT_FOUND, Boolean.FALSE);
            return updateStatus(sd);
        }

        if (sdc.getStatus().getCondition(CONDITION_READY) == null || Boolean.FALSE.toString().equalsIgnoreCase(sdc.getStatus().getCondition(CONDITION_READY).getStatus())) {
            LOGGER.error("{} service domain cluster not ready", sdcName);
            setStatusCondition(sd, CONDITION_READY, Boolean.FALSE);
            setStatusCondition(sd, CONDITION_SERVICE_DOMAIN_CLUSTER_READY, REASON_SDC, sdcName + " " + MESSAGE_SDC_NOT_READY, Boolean.FALSE);
            return updateStatus(sd);
        }

        setStatusCondition(sd, CONDITION_SERVICE_DOMAIN_CLUSTER_READY, Boolean.TRUE);

        try {
            createOrUpdateDeployment(sd, sdc.getStatus().getKafkaBroker());
            createOrUpdateService(sd);
            if (sd.getSpec().getExpose() != null && sd.getSpec().getExpose().contains(ServiceDomainSpec.ExposeType.http)) {
                setStatusCondition(sd, CONDITION_INTEGRATION_READY, REASON_INTEGRATION, MESSAGE_INTEGRATION_NOT_READY, Boolean.FALSE);
                final String sdConfigMapName = "integration-" + CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sd.getSpec().getType().toString()) + "-http";
                ConfigMap sdConfigMap = client.configMaps().inNamespace(client.getNamespace()).withName(sdConfigMapName).get();

                final boolean validateSdConfigMap = validateSdConfigMap(sd, sdConfigMapName, sdConfigMap);
                if (!validateSdConfigMap) {
                    return updateStatus(sd);
                }

                createOrUpdateCamelKHttpIntegration(sd, sdConfigMap);
            } else if (sd.getSpec().getExpose() == null || !sd.getSpec().getExpose().contains(ServiceDomainSpec.ExposeType.http)) {
                deleteCamelHttpIntegration(sd);
            }

            String kafkaTopic = createKafkaTopic(sd, sdc.getMetadata().getNamespace());
            sd.getStatus().setKafkaTopic(kafkaTopic);
        } catch (Exception e) {
            LOGGER.error("{} service domain failed to be created/updated", sdName, e);
            setStatusCondition(sd, CONDITION_READY, REASON_FAILED, e.getMessage(), Boolean.FALSE);
        }

        updateSdReadyCondition(sd);

        return updateStatus(sd);
    }

    private void updateSdReadyCondition(ServiceDomain sd) {
        final boolean isSDReady = sd.getStatus().getConditions().stream()
                .filter(c -> !CONDITION_READY.equals(c.getType()))
                .allMatch(c -> Boolean.TRUE.toString().equalsIgnoreCase(c.getStatus()));

        if(isSDReady){
            setStatusCondition(sd, CONDITION_READY, Boolean.TRUE);
        }
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
            removeStatusCondition(sd, CONDITION_INTEGRATION_READY);
        }
    }

    private void createOrUpdateCamelKHttpIntegration(ServiceDomain sd, ConfigMap configMap) {
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        String sdCamelRouteYaml = configMap.getData().get(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY);

        String yamlString = mergeCamelYamls(sd, integrationName, sdCamelRouteYaml);
        CustomResourceDefinitionContext resourceDefinitionContext = new CustomResourceDefinitionContext.Builder()
                .withGroup("camel.apache.org")
                .withVersion("v1")
                .withPlural("integrations")
                .withScope(Scope.NAMESPACED.toString())
                .build();

        Resource<GenericKubernetesResource> expected = client.genericKubernetesResources(resourceDefinitionContext)
                .inNamespace(sd.getMetadata().getNamespace())
                .load(new ByteArrayInputStream(yamlString.getBytes(StandardCharsets.UTF_8)));

        final String sdNamespace = sd.getMetadata().getNamespace();
        GenericKubernetesResource current = client.genericKubernetesResources(resourceDefinitionContext)
                .inNamespace(sdNamespace)
                .withName(integrationName)
                .get();

        if (current == null || !Objects.equals(current.getAdditionalProperties().get(INTEGRATION_SPEC_PROPERTY), expected.get().getAdditionalProperties().get(INTEGRATION_SPEC_PROPERTY))) {
            current = client.genericKubernetesResources(resourceDefinitionContext)
                    .inNamespace(sd.getMetadata().getNamespace())
                    .createOrReplace(expected.get());
            LOGGER.debug("Integration {} was created or updated", integrationName);
        }

        updateIntegrationReadyCondition(sd, current);
    }

    private void updateIntegrationReadyCondition(ServiceDomain sd, GenericKubernetesResource current) {
        if(current != null && current.getAdditionalProperties() != null && current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY) != null && ((Map) current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY)).get(INTEGRATION_CONDITIONS_PROPERTY) != null){
            final List<Map<String, String>> conditions = (List<Map<String, String>>) ((Map) current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY)).get(INTEGRATION_CONDITIONS_PROPERTY);
            final boolean integrationReady = conditions.stream().anyMatch(c -> CONDITION_READY.equals(c.get(INTEGRATION_TYPE_PROPERTY)) && Boolean.TRUE.toString().equalsIgnoreCase(c.get(INTEGRATION_STATUS_PROPERTY)));
            if(integrationReady) {
                setStatusCondition(sd, CONDITION_INTEGRATION_READY, Boolean.TRUE);
            }
        }
    }

    private boolean validateSdConfigMap(ServiceDomain sd, String sdConfigMapName, ConfigMap camelRoutesConfigMap) {
        final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
        final String sdTypeAsString = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sdType.toString());

        if (camelRoutesConfigMap == null) {
            LOGGER.error("{} config map is missing ", sdConfigMapName);
            return false;
        }

        String sdCamelRouteYaml = camelRoutesConfigMap.getData().get(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY);
        if (sdCamelRouteYaml == null) {
            LOGGER.error("{} config map key with the direct routes is missing", sdTypeAsString + "-direct.yaml");
            return false;
        }
        if (client.configMaps().inNamespace(client.getNamespace()).withName(sdTypeAsString + OPENAPI_CM_SUFFIX).get() == null) {
            LOGGER.error("{} config map with the OpenAPI spec is missing", sdTypeAsString);
            return false;
        }
        return true;
    }

    private String mergeCamelYamls(ServiceDomain sd, String integrationName, String sdCamelRouteYaml) {
        final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
        final String sdTypeAsString = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, sdType.toString());

        sdCamelRouteYaml = sdCamelRouteYaml.replaceAll(COMMENT_LINE_REGEX, "").trim();

        Yaml yaml = new Yaml();
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("apiVersion", "camel.apache.org/v1");
        data.put("kind", "Integration");
        data.put("metadata", Map.of("name", integrationName,
                "namespace", sd.getMetadata().getNamespace(),
                "labels", Map.of(MANAGED_BY_LABEL, OPERATOR_NAME),
                "ownerReferences", List.of(new TreeMap<>(Map.of("apiVersion", SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION,
                        "kind", SERVICE_DOMAIN_OWNER_REFERENCES_KIND,
                        "name", sd.getMetadata().getName(),
                        "uid", sd.getMetadata().getUid())))));
        final Map<String, Object> specMap = new TreeMap<>(
                Map.of("traits",
                        Map.of("environment",
                                Map.of("configuration",
                                        Map.of("vars",
                                                List.of("MERCURY_BINDING_SERVICE_HOST=" + sdTypeAsString,
                                                        "MERCURY_BINDING_SERVICE_PORT=" + GRPC_PORT)
                                        )
                                ),
                                "openapi", Map.of("configuration",
                                        Map.of("configmaps", List.of(sdTypeAsString + OPENAPI_CM_SUFFIX))
                                )
                        ),
                        "dependencies",
                        List.of("mvn:com.redhat.mercury:" + sdTypeAsString + "-common:" + version,
                                "camel:protobuf"),
                        "flows", yaml.load(sdCamelRouteYaml)));
        data.put("spec", specMap);
        return yaml.dumpAsMap(data);
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

        if (kafkaUser == null || !Objects.equals(kafkaUser.getSpec(), desiredKafkaUser.getSpec())) {
            client.resources(KafkaUser.class).create(desiredKafkaUser);
            LOGGER.debug("KafkaUser {} was created or updated", kafkaUserName);
        }
        return kafkaUserName;
    }

    private String createKafkaTopic(ServiceDomain sd, String sdcNamespace) {
        setStatusCondition(sd, CONDITION_KAFKA_TOPIC_READY, Boolean.FALSE);
        final String kafkaTopicName = sd.getMetadata().getName() + "-topic";

        KafkaTopic desiredKafkaTopic = new KafkaTopicBuilder()
                .withNewMetadata()
                .withName(kafkaTopicName)
                .withNamespace(sdcNamespace)
                .withLabels(Map.of("strimzi.io/cluster", sd.getSpec().getServiceDomainCluster(),
                                   MANAGED_BY_LABEL, OPERATOR_NAME))
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

        KafkaTopic kafkaTopic = client.resources(KafkaTopic.class).inNamespace(sdcNamespace).withName(kafkaTopicName).get();

        if (kafkaTopic == null || !Objects.equals(kafkaTopic.getSpec(), desiredKafkaTopic.getSpec())) {
            kafkaTopic = client.resources(KafkaTopic.class).inNamespace(sdcNamespace).create(desiredKafkaTopic);
            LOGGER.debug("KafkaTopic {} was created or updated", kafkaTopicName);
        }

        if(isKafkaTopicReady(kafkaTopic)){
            setStatusCondition(sd, CONDITION_KAFKA_TOPIC_READY, Boolean.TRUE);
        }

        return kafkaTopicName;
    }

    private boolean isKafkaTopicReady(KafkaTopic kafkaTopic) {
        return kafkaTopic != null && kafkaTopic.getStatus() != null && kafkaTopic.getStatus().getConditions().stream().anyMatch(c -> CONDITION_READY.equals(c.getType()) && Boolean.TRUE.toString().equalsIgnoreCase(c.getStatus()));
    }

    private void createOrUpdateDeployment(ServiceDomain sd, String kafkaBrokerUrl) {
        String sdNS = sd.getMetadata().getNamespace();
        String sdName = sd.getMetadata().getName();

        Deployment desiredDeployment = new DeploymentBuilder()
                .withNewMetadata()
                .withName(sdName)
                .withNamespace(sdNS)
                .withLabels(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sdName, SERVICE_DOMAIN_LABEL, sdName,
                                   MANAGED_BY_LABEL, OPERATOR_NAME))
                .endMetadata()
                .withSpec(new DeploymentSpecBuilder()
                        .withSelector(new LabelSelectorBuilder()
                                .withMatchLabels(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sdName))
                                .build())
                        .withTemplate(new PodTemplateSpecBuilder()
                                .withNewMetadata()
                                .withLabels(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sdName, SERVICE_DOMAIN_LABEL, sdName))
                                .endMetadata()
                                .withSpec(new PodSpecBuilder()
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

        if (sdDeployment == null || !Objects.equals(sdDeployment.getSpec(), desiredDeployment.getSpec())) {
            client.apps().deployments().inNamespace(sdNS).createOrReplace(desiredDeployment);
            LOGGER.debug("Deployment {} was created or updated", sdName);
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
                .withLabels(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sdName, SERVICE_DOMAIN_LABEL,
                                   sdName, MERCURY_BINDING_LABEL, INTERNAL,
                                   MANAGED_BY_LABEL, OPERATOR_NAME))
                .endMetadata()
                .withNewSpec()
                .withPorts(new ServicePortBuilder()
                        .withPort(GRPC_PORT)
                        .withProtocol(TCP_PROTOCOL)
                        .withName(GRPC_NAME).build())
                .withSelector(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sdName))
                .endSpec().build();

        desiredService.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sd.getMetadata().getName())
                .withUid(sd.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_OWNER_REFERENCES_API_VERSION)
                .build()));

        final Service sdService = client.services().inNamespace(sdNS).withName(sdName).get();

        if (sdService == null || !Objects.equals(sdService.getSpec(), desiredService.getSpec())) {
            client.services().inNamespace(sdNS).createOrReplace(desiredService);
            LOGGER.debug("Service {} was created or updated", sdName);
        }
    }
}
