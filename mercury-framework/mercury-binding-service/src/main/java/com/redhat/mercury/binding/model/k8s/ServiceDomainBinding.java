package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

@Group(ServiceDomainBinding.GROUP)
@Version(ServiceDomainBinding.VERSION)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @BuildableReference(CustomResource.class)
})
public class ServiceDomainBinding extends CustomResource<ServiceDomainBindingSpec, Void> implements Namespaced {

    public static final String GROUP = "mercury.redhat.io";
    public static final String VERSION = "v1alpha1";

}
