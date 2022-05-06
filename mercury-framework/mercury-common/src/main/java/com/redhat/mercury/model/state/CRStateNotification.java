package com.redhat.mercury.model.state;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.redhat.mercury.model.ServiceDomain;
import com.redhat.mercury.model.state.ControlRecordState.ControlRecordStateType;

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
@JsonInclude(Include.NON_NULL)
@RegisterForReflection
@Buildable(validationEnabled = true, editableEnabled = false, refs = {@BuildableReference(StateNotification.class)},
        generateBuilderPackage = true, builderPackage = BUILDER_PACKAGE)
public class CRStateNotification extends StateNotification<ControlRecordStateType> {

    @NotNull
    private String referenceId;
    @Valid
    private StateContext context;

    public static ControlRecordStateTypeBuilder builder(ServiceDomain serviceDomain) {
        return new ControlRecordStateTypeBuilder(new CRStateNotificationBuilder().withServiceDomain(serviceDomain));
    }

    public static class ControlRecordStateTypeBuilder {
        private final CRStateNotificationBuilder builder;

        private ControlRecordStateTypeBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public WithReferenceBuilder withReference(String referenceId) {
            return new WithReferenceBuilder(builder.withReferenceId(referenceId));
        }

    }

    public static class WithReferenceBuilder {
        private final CRStateNotificationBuilder builder;

        private WithReferenceBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public InstantiationBuilder instantiation() {
            return new InstantiationBuilder(builder);
        }

        public InvocationBuilder invocation() {
            return new InvocationBuilder(builder);
        }
    }

    public static class InstantiationBuilder {
        private final CRStateNotificationBuilder builder;

        private InstantiationBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder.withType(ControlRecordStateType.INSTANTIATION);
        }

        public ResourcingBuilder resourcing() {
            return new ResourcingBuilder(builder);
        }

        public SubjectQualificationBuilder subjectQualification() {
            return new SubjectQualificationBuilder(builder);
        }

        public ArrangementBuilder arrangement() {
            return new ArrangementBuilder(builder);
        }
    }

    public static class ResourcingBuilder {
        private final CRStateNotificationBuilder builder;

        private ResourcingBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReferenceBuilder unassigned() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.UNASSIGNED));
        }

        public ReferenceBuilder assigned() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.ASSIGNED));
        }

        public ReferenceBuilder chartered() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.CHARTERED));
        }
    }

    public static class SubjectQualificationBuilder {
        private final CRStateNotificationBuilder builder;

        private SubjectQualificationBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReferenceBuilder present() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.PRESENT));
        }

        public ReferenceBuilder recognized() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.RECOGNIZED));
        }

        public ReferenceBuilder classified() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.CLASSIFIED));
        }
    }

    public static class ArrangementBuilder {
        private final CRStateNotificationBuilder builder;

        private ArrangementBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReferenceBuilder eligible() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.ELIGIBLE));
        }

        public ReferenceBuilder initialized() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.INITIALIZED));
        }

        public ReferenceBuilder inForce() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.IN_FORCE));
        }

        public ReferenceBuilder restricted() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.RESTRICTED));
        }

        public ReferenceBuilder closing() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.CLOSING));
        }

        public ReferenceBuilder dormant() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.DORMANT));
        }
    }

    public static class InvocationBuilder {
        private final CRStateNotificationBuilder builder;

        private InvocationBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder.withType(ControlRecordStateType.INVOCATION);
        }

        public IntelligenceDeployedAndAppliedBuilder intelligenceDeployedAndApplied() {
            return new IntelligenceDeployedAndAppliedBuilder(builder);
        }

        public WorkPerformanceBuilder workPerformance() {
            return new WorkPerformanceBuilder(builder);
        }
    }

    public static class IntelligenceDeployedAndAppliedBuilder {
        private final CRStateNotificationBuilder builder;

        private IntelligenceDeployedAndAppliedBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReferenceBuilder sought() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.SOUGHT));
        }

        public ReferenceBuilder defined() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.DEFINED));
        }

        public ReferenceBuilder specified() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.SPECIFIED));
        }

        public ReferenceBuilder implemented() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.IMPLEMENTED));
        }

        public ReferenceBuilder certified() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.CERTIFIED));
        }

        public ReferenceBuilder deployed() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.DEPLOYED));
        }

        public ReferenceBuilder consolidated() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.CONSOLIDATED));
        }

        public ReferenceBuilder applied() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.APPLIED));
        }

        public ReferenceBuilder published() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.PUBLISHED));
        }

        public ReferenceBuilder qualified() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.QUALIFIED));
        }

        public ReferenceBuilder retired() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.RETIRED));
        }
    }

    public static class WorkPerformanceBuilder {
        private final CRStateNotificationBuilder builder;

        private WorkPerformanceBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public ReferenceBuilder available() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.AVAILABLE));
        }

        public ReferenceBuilder initiated() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.INITIATED));
        }

        public ReferenceBuilder processing() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.PROCESSING));
        }

        public ReferenceBuilder engaged() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.ENGAGED));
        }

        public ReferenceBuilder interrupted() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.INTERRUPTED));
        }

        public ReferenceBuilder completed() {
            return new ReferenceBuilder(builder.withState(ControlRecordState.COMPLETED));
        }
    }

    public static class ReferenceBuilder {
        private final CRStateNotificationBuilder builder;

        private ReferenceBuilder(CRStateNotificationBuilder builder) {
            this.builder = builder;
        }

        public CRStateNotification withQualifier(String name, String reference) {
            return this.builder.withNewContext().withName(name).withReference(reference).endContext().build();
        }

        public CRStateNotification build() {
            return this.builder.build();
        }
    }

}
