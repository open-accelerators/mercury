package com.redhat.mercury.operator.model;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import static com.redhat.mercury.operator.model.MercuryConstants.K8S_BUILDER_PACKAGE;

@Group(MercuryConstants.GROUP)
@Version(MercuryConstants.VERSION)
@ShortNames("sdi")
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = K8S_BUILDER_PACKAGE, refs = {
        @BuildableReference(CustomResource.class),
})
public class ServiceDomainInfra extends CustomResource<ServiceDomainInfraSpec, ServiceDomainInfraStatus> implements Namespaced {

    public ServiceDomainInfra() {
        super();
        this.setSpec(new ServiceDomainInfraSpec());
        this.setStatus(new ServiceDomainInfraStatus());
    }

}
