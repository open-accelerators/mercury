package com.redhat.mercury.operator.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
public class ServiceDomainSpec implements Serializable {
    public enum Type {
        CustomerOffer(),
        CustomerCreditRating(),
        PartyRoutingProfile()
    }

    public enum ExposeType {
        http
    }

    private String businessImage;
    private String serviceDomainInfra;
    private Type type;
    private List<ExposeType> expose;
}
