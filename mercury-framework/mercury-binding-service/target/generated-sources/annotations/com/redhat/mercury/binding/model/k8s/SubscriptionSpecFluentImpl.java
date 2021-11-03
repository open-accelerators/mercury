package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SubscriptionSpecFluentImpl<A extends SubscriptionSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubscriptionSpecFluent<A> {

    private String serviceDomain;
    private Collection<String> events;

    public SubscriptionSpecFluentImpl() {
    }

    public SubscriptionSpecFluentImpl(SubscriptionSpec instance) {
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withEvents(instance.getEvents());
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

    public Collection<String> getEvents() {
        return this.events;
    }

    public A withEvents(Collection<String> events) {
        this.events=events; return (A) this;
    }

    public Boolean hasEvents() {
        return this.events != null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionSpecFluentImpl that = (SubscriptionSpecFluentImpl) o;
        if (serviceDomain != null ? !serviceDomain.equals(that.serviceDomain) :that.serviceDomain != null) return false;
        if (events != null ? !events.equals(that.events) :that.events != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(serviceDomain,  events,  super.hashCode());
    }

}
