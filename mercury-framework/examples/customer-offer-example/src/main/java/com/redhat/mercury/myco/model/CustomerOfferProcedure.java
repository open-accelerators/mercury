package com.redhat.mercury.myco.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@RegisterForReflection
public class CustomerOfferProcedure {

    Integer id;
    String customerReference;
    String status;

}
