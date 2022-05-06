package com.redhat.mercury.model.state;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.redhat.mercury.model.ServiceDomain;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.redhat.mercury.Constants.BUILDER_PACKAGE;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@Buildable(validationEnabled = true, generateBuilderPackage = true, builderPackage = BUILDER_PACKAGE)
@JsonInclude(Include.NON_NULL)
@RegisterForReflection
public abstract class StateNotification<T> {

    @NotBlank
    private String state;
    @NotNull
    private T type;
    @NotNull
    private ServiceDomain serviceDomain;

}
