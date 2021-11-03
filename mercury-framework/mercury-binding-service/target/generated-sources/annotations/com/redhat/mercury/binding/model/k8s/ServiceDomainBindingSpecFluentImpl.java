package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuilder;
import java.lang.String;
import java.lang.StringBuffer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.lang.Boolean;

public class ServiceDomainBindingSpecFluentImpl<A extends ServiceDomainBindingSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceDomainBindingSpecFluent<A> {

    private String serviceDomain;
    private Collection<BindingSpec> bindings;
    private Collection<ExposedScopeSpec> exposedScopes;
    private Collection<SubscriptionSpec> subscriptions;

    public ServiceDomainBindingSpecFluentImpl() {
    }

    public ServiceDomainBindingSpecFluentImpl(ServiceDomainBindingSpec instance) {
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withBindings(instance.getBindings());
        
        this.withExposedScopes(instance.getExposedScopes());
        
        this.withSubscriptions(instance.getSubscriptions());
    }

    public String getServiceDomain() {
        return this.serviceDomain;
    }

    public A withServiceDomain(String serviceDomain) {
        this.serviceDomain=serviceDomain; return (A) this;
    }

    public Boolean hasServiceDomain() {
        return this.serviceDomain != null;
    }

    public A withNewServiceDomain(String arg1) {
        return (A)withServiceDomain(new String(arg1));
    }

    public A withNewServiceDomain(StringBuilder arg1) {
        return (A)withServiceDomain(new String(arg1));
    }

    public A withNewServiceDomain(StringBuffer arg1) {
        return (A)withServiceDomain(new String(arg1));
    }

    public Collection<BindingSpec> getBindings() {
        return this.bindings;
    }

    public A withBindings(Collection<BindingSpec> bindings) {
        this.bindings=bindings; return (A) this;
    }

    public Boolean hasBindings() {
        return this.bindings != null;
    }

    public Collection<ExposedScopeSpec> getExposedScopes() {
        return this.exposedScopes;
    }

    public A withExposedScopes(Collection<ExposedScopeSpec> exposedScopes) {
        this.exposedScopes=exposedScopes; return (A) this;
    }

    public Boolean hasExposedScopes() {
        return this.exposedScopes != null;
    }

    public Collection<SubscriptionSpec> getSubscriptions() {
        return this.subscriptions;
    }

    public A withSubscriptions(Collection<SubscriptionSpec> subscriptions) {
        this.subscriptions=subscriptions; return (A) this;
    }

    public Boolean hasSubscriptions() {
        return this.subscriptions != null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceDomainBindingSpecFluentImpl that = (ServiceDomainBindingSpecFluentImpl) o;
        if (serviceDomain != null ? !serviceDomain.equals(that.serviceDomain) :that.serviceDomain != null) return false;
        if (bindings != null ? !bindings.equals(that.bindings) :that.bindings != null) return false;
        if (exposedScopes != null ? !exposedScopes.equals(that.exposedScopes) :that.exposedScopes != null) return false;
        if (subscriptions != null ? !subscriptions.equals(that.subscriptions) :that.subscriptions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(serviceDomain,  bindings,  exposedScopes,  subscriptions,  super.hashCode());
    }

}
