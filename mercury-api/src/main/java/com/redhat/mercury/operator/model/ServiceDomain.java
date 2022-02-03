package com.redhat.mercury.operator.model;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

@Group(MercuryConstants.GROUP)
@Version(MercuryConstants.VERSION)
@ShortNames("sdr")
public class ServiceDomain extends CustomResource<ServiceDomainSpec, ServiceDomainStatus> implements Namespaced {
    public ServiceDomain() {
        super();
        this.setSpec(new ServiceDomainSpec());
        this.setStatus(new ServiceDomainStatus());
    }
}
