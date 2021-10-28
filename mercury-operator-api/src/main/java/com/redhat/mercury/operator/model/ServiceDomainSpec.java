package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
public class ServiceDomainSpec implements Serializable {
    private String businessImage;
    private String serviceDomainCluster;
    private String bindingServiceImage;

}
