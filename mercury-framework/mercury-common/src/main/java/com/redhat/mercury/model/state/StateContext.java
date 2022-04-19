package com.redhat.mercury.model.state;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@Buildable(validationEnabled = true)
@JsonInclude(Include.NON_NULL)
@RegisterForReflection
public class StateContext {

    @NotBlank
    private String name;
    @NotBlank
    private String reference;
    @Valid
    private StateContext subcontext;

}
