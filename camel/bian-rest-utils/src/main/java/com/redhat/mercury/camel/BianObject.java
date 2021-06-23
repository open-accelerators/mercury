package com.redhat.mercury.camel;

public class BianObject {

    private ServiceDomain serviceDomain;
    private ServiceOperation serviceOperation;
    private String functionalPattern;
    private String behaviorQualifier;
    private String sdReferenceId;
    private String crReferenceId;
    private String bqReferenceId;

    public ServiceDomain getServiceDomain() {
        return serviceDomain;
    }

    public BianObject setServiceDomain(ServiceDomain serviceDomain) {
        this.serviceDomain = serviceDomain;
        return this;
    }

    public ServiceOperation getServiceOperation() {
        return serviceOperation;
    }

    public BianObject setServiceOperation(ServiceOperation serviceOperation) {
        this.serviceOperation = serviceOperation;
        return this;
    }

    public String getFunctionalPattern() {
        return functionalPattern;
    }

    public BianObject setFunctionalPattern(String functionalPattern) {
        this.functionalPattern = functionalPattern;
        return this;
    }

    public String getBehaviorQualifier() {
        return behaviorQualifier;
    }

    public BianObject setBehaviorQualifier(String behaviorQualifier) {
        this.behaviorQualifier = behaviorQualifier;
        return this;
    }

    public String getSdReferenceId() {
        return sdReferenceId;
    }

    public BianObject setSdReferenceId(String sdReferenceId) {
        this.sdReferenceId = sdReferenceId;
        return this;
    }

    public String getCrReferenceId() {
        return crReferenceId;
    }

    public BianObject setCrReferenceId(String crReferenceId) {
        this.crReferenceId = crReferenceId;
        return this;
    }

    public String getBqReferenceId() {
        return bqReferenceId;
    }

    public BianObject setBqReferenceId(String bqReferenceId) {
        this.bqReferenceId = bqReferenceId;
        return this;
    }

}
