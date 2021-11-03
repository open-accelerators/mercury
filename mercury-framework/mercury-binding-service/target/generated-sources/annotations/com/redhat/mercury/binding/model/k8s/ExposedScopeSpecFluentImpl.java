package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ExposedScopeSpecFluentImpl<A extends ExposedScopeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExposedScopeSpecFluent<A> {

    private String scopeRef;
    private String action;

    public ExposedScopeSpecFluentImpl() {
    }

    public ExposedScopeSpecFluentImpl(ExposedScopeSpec instance) {
        this.withScopeRef(instance.getScopeRef());
        
        this.withAction(instance.getAction());
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
        ExposedScopeSpecFluentImpl that = (ExposedScopeSpecFluentImpl) o;
        if (scopeRef != null ? !scopeRef.equals(that.scopeRef) :that.scopeRef != null) return false;
        if (action != null ? !action.equals(that.action) :that.action != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(scopeRef,  action,  super.hashCode());
    }

}
