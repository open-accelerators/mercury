package com.redhat.mercury.binding.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@Accessors(chain = true)
public class Binding {

    private BindingDefinition definition;
    private String endpoint;

}
