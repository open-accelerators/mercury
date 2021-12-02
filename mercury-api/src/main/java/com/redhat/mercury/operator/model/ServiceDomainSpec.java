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
import java.util.List;

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
        CustomerOffer("customer-offer"),
        CustomerCreditRating("customer-credit-rating"),
        PartyRoutingProfile("party-routing-profile");

        private String typeAsString;

        Type(String typeAsString){
            this.typeAsString = typeAsString;
        }

        public String getTypeAsString(){
            return typeAsString;
        }
    }

    public enum ExposeType{
        Http
    }

    private String businessImage;
    private String serviceDomainCluster;
    private Type type;
    private ExposeType expose;
    private List<Binding> binding;
}
