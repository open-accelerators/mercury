package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @BuildableReference(AbstractResourceStatus.class),
})
public class ServiceDomainStatus extends AbstractResourceStatus {

    public static final String REASON_SDI = "ServiceDomainInfra";
    public static final String REASON_INTEGRATION = "Integration";
    public static final String REASON_INTEGRATION_WAITING = "WaitingForIntegration";
    public static final String REASON_KAFKA_TOPIC_WAITING = "WaitingForKafkaTopic";
    public static final String REASON_INVALID_CONFIG_MAPS_CONFIGURATION = "InvalidConfigMapsConfiguration";
    public static final String REASON_CANT_READ_CONFIG_MAPS_FILE = "CantReadConfigMapFile";

    public static final String MESSAGE_SDI_NOT_FOUND = "Service Domain Infra not found";
    public static final String MESSAGE_SDI_NOT_READY = "Service Domain Infra is not ready";
    public static final String MESSAGE_INTEGRATION_NOT_READY = "Integration not ready";
    public static final String MESSAGE_KAFKA_TOPIC_NOT_READY = "Kafka Topic not ready";
    public static final String MESSAGE_CONFIG_MAP_MISSING = "config map is missing";
    public static final String MESSAGE_OPENAPI_CONFIG_MAP_FILE_MISSING = "openapi config map file missing";
    public static final String MESSAGE_CONFIG_MAP_KEY_MISSING = "config map key with the direct routes is missing";
    public static final String MESSAGE_CANT_READ_CONFIG_MAPS_FILE = "config map file cant be read";

    public static final String CONDITION_SERVICE_DOMAIN_INFRA_READY = "ServiceDomainInfraReady";
    public static final String CONDITION_KAFKA_TOPIC_READY = "KafkaTopicReady";
    public static final String CONDITION_INTEGRATION_READY = "IntegrationReady";

    private String kafkaTopic;
    private String kafkaUser;
}