package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize()
@ToString
public enum ApiVersion {
    v1;
}
