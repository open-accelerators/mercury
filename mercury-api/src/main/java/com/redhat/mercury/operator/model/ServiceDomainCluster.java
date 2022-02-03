package com.redhat.mercury.operator.model;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

@Group(MercuryConstants.GROUP)
@Version(MercuryConstants.VERSION)
@ShortNames("sdc")
public class ServiceDomainCluster extends CustomResource<ServiceDomainClusterSpec, ServiceDomainClusterStatus> implements Namespaced {

    public ServiceDomainCluster() {
        super();
        this.setSpec(new ServiceDomainClusterSpec());
        this.setStatus(new ServiceDomainClusterStatus());
    }

}
