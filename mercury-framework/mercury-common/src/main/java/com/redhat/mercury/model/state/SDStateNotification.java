package com.redhat.mercury.model.state;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.ServiceDomainState.ServiceDomainStateType;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.redhat.mercury.Constants.BUILDER_PACKAGE;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@Buildable(validationEnabled = true, editableEnabled = false, refs = {@BuildableReference(StateNotification.class)}, 
        generateBuilderPackage = true, builderPackage = BUILDER_PACKAGE)
@JsonInclude(Include.NON_NULL)
@RegisterForReflection
public class SDStateNotification extends StateNotification<ServiceDomainStateType> {

    public static ServiceDomainStateTypeBuilder builder(ServiceDomain serviceDomain) {
        return new ServiceDomainStateTypeBuilder(new SDStateNotificationBuilder().withServiceDomain(serviceDomain));
    }

    public static class ServiceDomainStateTypeBuilder {
        private final SDStateNotificationBuilder builder;

        private ServiceDomainStateTypeBuilder(SDStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReportingBuilder reporting() {
            return new ReportingBuilder(builder);
        }

        public OperationBuilder operation() {
            return new OperationBuilder(builder);
        }
    }

    public static class ReportingBuilder {
        private final SDStateNotificationBuilder builder;

        private ReportingBuilder(SDStateNotificationBuilder builder) {
            this.builder = builder.withType(ServiceDomainStateType.REPORTING);
        }

        public SDStateNotification running() {
            return builder.withState(ServiceDomainState.RUNNING).build();
        }

        public SDStateNotification subscribed() {
            return builder.withState(ServiceDomainState.SUBSCRIBED).build();
        }

        public SDStateNotification reported() {
            return builder.withState(ServiceDomainState.REPORTED).build();
        }
    }

    public static class OperationBuilder {
        private final SDStateNotificationBuilder builder;

        private OperationBuilder(SDStateNotificationBuilder builder) {
            this.builder = builder.withType(ServiceDomainStateType.OPERATION);
        }

        public SDStateNotification inactive() {
            return builder.withState(ServiceDomainState.INACTIVE).build();
        }

        public SDStateNotification active() {
            return builder.withState(ServiceDomainState.ACTIVE).build();
        }

        public SDStateNotification constrained() {
            return builder.withState(ServiceDomainState.CONSTRAINED).build();
        }

        public SDStateNotification ending() {
            return builder.withState(ServiceDomainState.ENDING).build();
        }
    }

}
