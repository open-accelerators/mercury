package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BindingSpecFluentImpl<A extends BindingSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BindingSpecFluent<A> {

    private String serviceDomain;
    private String scopeRef;
    private String action;

    public BindingSpecFluentImpl() {
    }

    public BindingSpecFluentImpl(BindingSpec instance) {
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withScopeRef(instance.getScopeRef());
        
        this.withAction(instance.getAction());
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

    public String getScopeRef() {
        return this.scopeRef;
    }

    public A withScopeRef(String scopeRef) {
        this.scopeRef=scopeRef; return (A) this;
    }

    public Boolean hasScopeRef() {
        return this.scopeRef != null;
    }

    public A withNewScopeRef(String arg1) {
        return (A)withScopeRef(new String(arg1));
    }

    public A withNewScopeRef(StringBuilder arg1) {
        return (A)withScopeRef(new String(arg1));
    }

    public A withNewScopeRef(StringBuffer arg1) {
        return (A)withScopeRef(new String(arg1));
    }

    public String getAction() {
        return this.action;
    }

    public A withAction(String action) {
        this.action=action; return (A) this;
    }

    public Boolean hasAction() {
        return this.action != null;
    }

    public A withNewAction(String arg1) {
        return (A)withAction(new String(arg1));
    }

    public A withNewAction(StringBuilder arg1) {
        return (A)withAction(new String(arg1));
    }

    public A withNewAction(StringBuffer arg1) {
        return (A)withAction(new String(arg1));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BindingSpecFluentImpl that = (BindingSpecFluentImpl) o;
        if (serviceDomain != null ? !serviceDomain.equals(that.serviceDomain) :that.serviceDomain != null) return false;
        if (scopeRef != null ? !scopeRef.equals(that.scopeRef) :that.scopeRef != null) return false;
        if (action != null ? !action.equals(that.action) :that.action != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(serviceDomain,  scopeRef,  action,  super.hashCode());
    }

}
