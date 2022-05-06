package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import static com.redhat.mercury.operator.model.MercuryConstants.K8S_BUILDER_PACKAGE;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = K8S_BUILDER_PACKAGE)
public class KafkaConfig {

    private Integer replicas;
    private KafkaStorage storage;

}
