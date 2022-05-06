package com.redhat.mercury.operator.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import com.redhat.mercury.operator.model.HttpExposeType;
import com.redhat.mercury.operator.model.MercuryConstants;
import com.redhat.mercury.operator.model.ServiceDomain;
import com.redhat.mercury.operator.model.ServiceDomainInfra;
import com.redhat.mercury.operator.model.ServiceDomainSpec;
import com.redhat.mercury.operator.model.ServiceDomainStatus;
import com.redhat.mercury.operator.utils.ResourceUtils;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ConditionBuilder;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
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
import io.fabric8.kubernetes.client.informers.SharedIndexInformer;
import io.fabric8.kubernetes.model.Scope;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceContext;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceInitializer;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.MESSAGE_WAITING;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.REASON_FAILED;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.REASON_WAITING;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_FALSE;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.model.HttpExposeType.DEFAULT_API_VERSION;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_INTEGRATION_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.CONDITION_SERVICE_DOMAIN_INFRA_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_CANT_READ_CONFIG_MAPS_FILE;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_INTEGRATION_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_SDI_NOT_FOUND;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.MESSAGE_SDI_NOT_READY;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.REASON_CANT_READ_CONFIG_MAPS_FILE;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.REASON_INTEGRATION_WAITING;
import static com.redhat.mercury.operator.model.ServiceDomainStatus.REASON_SDI;
import static com.redhat.mercury.operator.utils.ResourceUtils.toLowerHyphen;

@ControllerConfiguration
public class ServiceDomainController extends AbstractController<ServiceDomainSpec, ServiceDomainStatus, ServiceDomain> implements Reconciler<ServiceDomain>, EventSourceInitializer<ServiceDomain> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainController.class);

    public static final String SERVICE_DOMAIN_OWNER_REFERENCES_KIND = ServiceDomain.class.getSimpleName();
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
    private static final String SERVICE_NAME = "grpc";
    private static final int SERVICE_PORT = 9000;
    private static final String COMMENT_LINE_REGEX = "(?m)^#.*";
    private static final String APP_LABEL_BIAN_PREFIX = "bian-";
    public static final String OPENAPI_CM_SUFFIX = "-openapi";
    private static final String INTEGRATION_SPEC_PROPERTY = "spec";
    private static final String INTEGRATION_STATUS_PROPERTY = "status";
    private static final String INTEGRATION_TYPE_PROPERTY = "type";
    private static final String INTEGRATION_CONDITIONS_PROPERTY = "conditions";
    private static final String OPENAPI_FILENAME = "openapi.json";
    private static final String DIRECT_FILENAME = "directs.yaml";
    public static final String OPEN_API_CONFIG_MAP_VERSION = "v10";
    private static final String FILE_DIR_TEMPLATE = "/%s/%s/";

    private static final CustomResourceDefinitionContext CAMEL_RESOURCE_DEFINITION = new CustomResourceDefinitionContext.Builder()
            .withGroup("camel.apache.org")
            .withVersion("v1")
            .withPlural("integrations")
            .withScope(Scope.NAMESPACED.toString())
            .build();

    @ConfigProperty(name = "application.version")
    String version;

    @Override
    public List<EventSource> prepareEventSources(EventSourceContext<ServiceDomain> context) {
        SharedIndexInformer<Deployment> deploymentInformer = client.resources(Deployment.class)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        SharedIndexInformer<GenericKubernetesResource> integrationInformer = client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION)
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        SharedIndexInformer<Service> servicesInformer = client.services()
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        SharedIndexInformer<ConfigMap> routeConfigMapInformer = client.configMaps()
                .inAnyNamespace()
                .withLabel(MANAGED_BY_LABEL, OPERATOR_NAME)
                .runnableInformer(0);

        return List.of(getInformerEventSource(deploymentInformer),
                getInformerEventSource(integrationInformer),
                getInformerEventSource(servicesInformer),
                getInformerEventSource(routeConfigMapInformer));
    }

    @Override
    public UpdateControl<ServiceDomain> reconcile(ServiceDomain sd, Context context) {
        setStatusCondition(sd, new ConditionBuilder()
                .withType(CONDITION_READY)
                .withStatus(STATUS_FALSE)
                .withReason(REASON_WAITING)
                .withMessage(MESSAGE_WAITING)
                .build());
        String sdName = sd.getMetadata().getName();
        final String sdiName = sd.getSpec().getServiceDomainInfra();
        ServiceDomainInfra sdi = client.resources(ServiceDomainInfra.class).inNamespace(sd.getMetadata().getNamespace()).withName(sdiName).get();

        if (sdi == null) {
            LOGGER.error("{} service domain infra not found", sdiName);
            return updateStatusWithCondition(sd, new ConditionBuilder()
                    .withType(CONDITION_SERVICE_DOMAIN_INFRA_READY)
                    .withStatus(STATUS_FALSE)
                    .withReason(REASON_SDI)
                    .withMessage(sdiName + " " + MESSAGE_SDI_NOT_FOUND)
                    .build());
        }

        if (sdi.getStatus().getCondition(CONDITION_READY) == null || Boolean.FALSE.toString().equalsIgnoreCase(sdi.getStatus().getCondition(CONDITION_READY).getStatus())) {
            LOGGER.error("{} service domain infra not ready", sdiName);
            return updateStatusWithCondition(sd, new ConditionBuilder()
                    .withType(CONDITION_SERVICE_DOMAIN_INFRA_READY)
                    .withStatus(STATUS_FALSE)
                    .withReason(REASON_SDI)
                    .withMessage(sdiName + " " + MESSAGE_SDI_NOT_READY)
                    .build())
                    .rescheduleAfter(10, TimeUnit.SECONDS);
        }
        setStatusCondition(sd, new ConditionBuilder()
                .withType(CONDITION_SERVICE_DOMAIN_INFRA_READY)
                .withStatus(STATUS_TRUE)
                .build());

        try {
            createOrUpdateDeployment(sd, sdi.getStatus().getKafkaBroker());
            createOrUpdateService(sd);

            if (sd.getSpec().getExpose() != null && sd.getSpec().getExpose().getHttp() != null) {
                final HttpExposeType httpExposeType = sd.getSpec().getExpose().getHttp();
                final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
                final String sdTypeAsString = toLowerHyphen(sdType.toString());
                final String apiVersion = httpExposeType.getApiVersion();

                if (DEFAULT_API_VERSION.equals(apiVersion)) {
                    final String directConfigMapName = sdTypeAsString + "-rest-" + DEFAULT_API_VERSION;
                    Condition integrationCondition = createConfigMaps(sd, sdTypeAsString, apiVersion, directConfigMapName);
                    if (integrationCondition != null) {
                        return updateStatusWithCondition(sd, integrationCondition);
                    }

                    final ConfigMap sdDirectConfigMap = client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(directConfigMapName).get();
                    String sdCamelRouteYaml = sdDirectConfigMap.getData().get(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY);
                    integrationCondition = createOrUpdateCamelKHttpIntegration(sd, sdCamelRouteYaml);
                    setStatusCondition(sd, integrationCondition);
                    if (STATUS_FALSE.equals(integrationCondition.getStatus())) {
                        return updateStatus(sd).rescheduleAfter(5, TimeUnit.SECONDS);
                    }
                }
            } else {
                deleteCamelHttpIntegration(sd);
                removeStatusCondition(sd, CONDITION_INTEGRATION_READY);
            }

            if (areAllConditionsReady(sd)) {
                return updateStatusWithReadyCondition(sd, CONDITION_READY);
            }
            return updateStatus(sd);
        } catch (Exception e) {
            LOGGER.error("{} service domain failed to be created/updated", sdName, e);
            return updateStatusWithCondition(sd, new ConditionBuilder()
                    .withType(CONDITION_READY)
                    .withStatus(STATUS_FALSE)
                    .withReason(REASON_FAILED)
                    .withMessage(e.getMessage())
                    .build());
        }
    }

    private Condition createConfigMaps(ServiceDomain sd, String sdTypeAsString, String apiVersion, String directConfigMapName) throws IOException {
        final String filesDir = String.format(FILE_DIR_TEMPLATE, apiVersion, sdTypeAsString);
        final String openApiConfigMapName = sdTypeAsString + OPENAPI_CM_SUFFIX + "-" + OPEN_API_CONFIG_MAP_VERSION;
        String sdName = sd.getMetadata().getName();

        final ConfigMap sdOpenApiConfigMap = client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(openApiConfigMapName).get();
        if (sdOpenApiConfigMap == null) {
            final InputStream openApiFileAsStream = getClass().getResourceAsStream(filesDir + OPENAPI_FILENAME);
            if (openApiFileAsStream == null) {
                LOGGER.error("{} service domain cant read openapi mapping config file", sdName);
                return new ConditionBuilder()
                        .withType(CONDITION_INTEGRATION_READY)
                        .withStatus(STATUS_FALSE)
                        .withReason(REASON_CANT_READ_CONFIG_MAPS_FILE)
                        .withMessage(MESSAGE_CANT_READ_CONFIG_MAPS_FILE)
                        .build();
            }

            final ConfigMap openApiCM = new ConfigMapBuilder()
                    .withNewMetadata()
                    .withName(openApiConfigMapName)
                    .withNamespace(sd.getMetadata().getNamespace())
                    .withOwnerReferences(List.of(new OwnerReferenceBuilder()
                            .withName(sd.getMetadata().getName())
                            .withUid(sd.getMetadata().getUid())
                            .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                            .withApiVersion(MercuryConstants.API_VERSION)
                            .build()))
                    .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
                    .endMetadata()
                    .withData(Map.of(OPENAPI_FILENAME, IOUtils.toString(openApiFileAsStream, StandardCharsets.UTF_8)))
                    .build();

            client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(openApiConfigMapName).create(openApiCM);
        }

        ConfigMap sdDirectConfigMap = client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(directConfigMapName).get();
        if (sdDirectConfigMap == null) {
            final InputStream directFileAsStream = getClass().getResourceAsStream(filesDir + DIRECT_FILENAME);
            if (directFileAsStream == null) {
                LOGGER.error("{} service domain cant read direct rest mapping config file", sdName);
                return new ConditionBuilder()
                        .withType(CONDITION_INTEGRATION_READY)
                        .withStatus(STATUS_FALSE)
                        .withReason(REASON_CANT_READ_CONFIG_MAPS_FILE)
                        .withMessage(MESSAGE_CANT_READ_CONFIG_MAPS_FILE)
                        .build();
            }

            final ConfigMap directCM = new ConfigMapBuilder()
                    .withNewMetadata()
                    .withName(directConfigMapName)
                    .withNamespace(sd.getMetadata().getNamespace())
                    .withOwnerReferences(List.of(new OwnerReferenceBuilder()
                            .withName(sd.getMetadata().getName())
                            .withUid(sd.getMetadata().getUid())
                            .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                            .withApiVersion(MercuryConstants.API_VERSION)
                            .build()))
                    .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
                    .endMetadata()
                    .withData(Map.of(CONFIG_MAP_CAMEL_ROUTES_DIRECT_KEY, IOUtils.toString(directFileAsStream, StandardCharsets.UTF_8)))
                    .build();

            client.configMaps().inNamespace(sd.getMetadata().getNamespace()).withName(directConfigMapName).create(directCM);
        }

        return null;
    }

    private void deleteCamelHttpIntegration(ServiceDomain sd) {
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;
        final GenericKubernetesResource integration = client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION).inNamespace(sd.getMetadata().getNamespace()).withName(integrationName).get();
        if (integration != null) {
            client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION).inNamespace(sd.getMetadata().getNamespace()).withName(integrationName).delete();
        }
    }

    private Condition createOrUpdateCamelKHttpIntegration(ServiceDomain sd, String sdCamelRouteYaml) {
        final String integrationName = sd.getMetadata().getName() + INTEGRATION_SUFFIX;

        String yamlString = mergeCamelYamls(sd, integrationName, sdCamelRouteYaml);

        Resource<GenericKubernetesResource> expected = client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION)
                .inNamespace(sd.getMetadata().getNamespace())
                .load(new ByteArrayInputStream(yamlString.getBytes(StandardCharsets.UTF_8)));

        final String sdNamespace = sd.getMetadata().getNamespace();
        GenericKubernetesResource current = client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION)
                .inNamespace(sdNamespace)
                .withName(integrationName)
                .get();

        if (current == null || !Objects.equals(
                current.getAdditionalProperties().get(INTEGRATION_SPEC_PROPERTY),
                expected.get().getAdditionalProperties().get(INTEGRATION_SPEC_PROPERTY))
        ) {
            LOGGER.debug("Creating or replacing Integration {}", integrationName);
            client.genericKubernetesResources(CAMEL_RESOURCE_DEFINITION)
                    .inNamespace(sd.getMetadata().getNamespace())
                    .createOrReplace(expected.get());
            LOGGER.debug("Created or replaced Integration {}", integrationName);
        }

        if (isIntegrationReady(current)) {
            return new ConditionBuilder()
                    .withType(CONDITION_INTEGRATION_READY)
                    .withStatus(STATUS_TRUE)
                    .build();
        }

        return new ConditionBuilder()
                .withType(CONDITION_INTEGRATION_READY)
                .withStatus(STATUS_FALSE)
                .withReason(REASON_INTEGRATION_WAITING)
                .withMessage(MESSAGE_INTEGRATION_NOT_READY)
                .build();
    }

    private boolean isIntegrationReady(GenericKubernetesResource current) {
        if (current != null && current.getAdditionalProperties() != null && current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY) != null && ((Map) current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY)).get(INTEGRATION_CONDITIONS_PROPERTY) != null) {
            final List<Map<String, String>> conditions = (List<Map<String, String>>) ((Map) current.getAdditionalProperties().get(INTEGRATION_STATUS_PROPERTY)).get(INTEGRATION_CONDITIONS_PROPERTY);
            return conditions.stream().anyMatch(c -> CONDITION_READY.equals(c.get(INTEGRATION_TYPE_PROPERTY)) && Boolean.TRUE.toString().equalsIgnoreCase(c.get(INTEGRATION_STATUS_PROPERTY)));
        }

        return false;
    }

    private String mergeCamelYamls(ServiceDomain sd, String integrationName, String sdCamelRouteYaml) {
        final ServiceDomainSpec.Type sdType = sd.getSpec().getType();
        final String sdTypeAsString = toLowerHyphen(sdType.toString());

        sdCamelRouteYaml = sdCamelRouteYaml.replaceAll(COMMENT_LINE_REGEX, "").trim();

        Yaml yaml = new Yaml();
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("apiVersion", "camel.apache.org/v1");
        data.put("kind", "Integration");
        data.put("metadata", Map.of("name", integrationName,
                "namespace", sd.getMetadata().getNamespace(),
                "labels", Map.of(MANAGED_BY_LABEL, OPERATOR_NAME),
                "ownerReferences", List.of(new TreeMap<>(Map.of("apiVersion", MercuryConstants.API_VERSION,
                        "kind", SERVICE_DOMAIN_OWNER_REFERENCES_KIND,
                        "name", sd.getMetadata().getName(),
                        "uid", sd.getMetadata().getUid())))));
        final Map<String, Object> specMap = new TreeMap<>(
                Map.of("traits",
                        Map.of("environment",
                                Map.of("configuration",
                                        Map.of("vars",
                                                List.of("MERCURY_BINDING_SERVICE_HOST=" + sdTypeAsString,
                                                        "MERCURY_BINDING_SERVICE_PORT=" + SERVICE_PORT)
                                        )
                                ),
                                "openapi", Map.of("configuration",
                                        Map.of("configmaps", List.of(sdTypeAsString + OPENAPI_CM_SUFFIX + "-" + OPEN_API_CONFIG_MAP_VERSION))
                                )
                        ),
                        "dependencies",
                        List.of("mvn:com.redhat.mercury:" + sdTypeAsString + "-common:" + version,
                                "camel:protobuf"),
                        "flows", yaml.load(sdCamelRouteYaml)));
        data.put("spec", specMap);
        return yaml.dumpAsMap(data);
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
                                                        .withContainerPort(SERVICE_PORT)
                                                        .withName(SERVICE_NAME).build())
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
                .withApiVersion(MercuryConstants.API_VERSION)
                .build()));

        final Deployment sdDeployment = client.apps().deployments().inNamespace(sdNS).withName(sdName).get();

        if (sdDeployment == null || !Objects.equals(sdDeployment.getSpec(), desiredDeployment.getSpec())) {
            LOGGER.debug("Creating or replacing Deployment {}", sdName);
            client.apps().deployments().inNamespace(sdNS).createOrReplace(desiredDeployment);
            LOGGER.debug("Created or replaced Deployment {}", sdName);
        }
    }

    private void createOrUpdateService(ServiceDomain sd) {
        String sdNS = sd.getMetadata().getNamespace();
        String svcName = ResourceUtils.toLowerHyphen(sd.getSpec().getType().toString());

        Service desiredService = new ServiceBuilder()
                .withApiVersion("v1")
                .withNewMetadata()
                .withName(svcName)
                .withNamespace(sdNS)
                .withLabels(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + svcName, SERVICE_DOMAIN_LABEL,
                        svcName, MERCURY_BINDING_LABEL, INTERNAL,
                        MANAGED_BY_LABEL, OPERATOR_NAME))
                .withOwnerReferences(List.of(new OwnerReferenceBuilder()
                        .withName(sd.getMetadata().getName())
                        .withUid(sd.getMetadata().getUid())
                        .withKind(SERVICE_DOMAIN_OWNER_REFERENCES_KIND)
                        .withApiVersion(MercuryConstants.API_VERSION).build()))
                .endMetadata()
                .withNewSpec()
                .withPorts(new ServicePortBuilder()
                        .withPort(SERVICE_PORT)
                        .withProtocol(TCP_PROTOCOL)
                        .withName(SERVICE_NAME).build())
                .withSelector(Map.of(APP_LABEL, APP_LABEL_BIAN_PREFIX + sd.getMetadata().getName()))
                .endSpec().build();

        final Service sdService = client.services().inNamespace(sdNS).withName(svcName).get();

        if (sdService == null || !Objects.equals(sdService.getSpec(), desiredService.getSpec())) {
            LOGGER.debug("Creating or replacing Service {}", svcName);
            client.services().inNamespace(sdNS).createOrReplace(desiredService);
            LOGGER.debug("Created or replaced Service {}", svcName);
        }
    }
}
