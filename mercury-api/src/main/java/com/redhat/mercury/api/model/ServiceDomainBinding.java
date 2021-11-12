package com.redhat.mercury.api.model;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("mercury.redhat.io")
@Version("v1alpha1")
@ShortNames("sdb")
public class ServiceDomainBinding extends CustomResource<ServiceDomainBindingSpec, ServiceDomainBindingStatus> implements Namespaced {
}
