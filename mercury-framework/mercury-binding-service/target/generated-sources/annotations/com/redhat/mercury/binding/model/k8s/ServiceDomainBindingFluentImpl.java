package com.redhat.mercury.binding.model.k8s;

import java.lang.Object;
import java.lang.Void;
import io.fabric8.kubernetes.client.CustomResourceFluentImpl;

public class ServiceDomainBindingFluentImpl<A extends ServiceDomainBindingFluent<A>> extends CustomResourceFluentImpl<ServiceDomainBindingSpec,Void,A> implements ServiceDomainBindingFluent<A> {


    public ServiceDomainBindingFluentImpl() {
    }

    public ServiceDomainBindingFluentImpl(ServiceDomainBinding instance) {
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.withKind(instance.getKind());
        
        this.withApiVersion(instance.getApiVersion());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceDomainBindingFluentImpl that = (ServiceDomainBindingFluentImpl) o;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode());
    }

}
