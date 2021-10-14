package com.redhat.mercury.reflection;

import com.google.protobuf.Any;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {Any.class})
public class MercuryReflectionConfiguration {
}
