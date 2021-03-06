package com.redhat.mercury.accountrecovery.camel;

import javax.annotation.Generated;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;

/**
 * Generated from OpenApi specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.openapi.PathGenerator")
public final class AccountRecoveryRoute extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {
        rest()
            .post("/account-recovery/activation")
                .id("activateSDAccountRecovery")
                .description("Activate  a  SDAccountRecovery servicing session")
                .produces("application/json")
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("SDAccountRecovery Request Payload")
                .endParam()
                .to("direct:activateSDAccountRecovery")
            .put("/account-recovery/{sd-reference-id}/configuration")
                .id("configureSDAccountRecovery")
                .description("Update an active SDAccountRecovery session configuration")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("SDAccountRecovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("SDAccountRecovery Configure Request Payload")
                .endParam()
                .to("direct:configureSDAccountRecovery")
            .put("/account-recovery/{sd-reference-id}/feedback")
                .id("feedbackSDAccountRecovery")
                .description("Capturing feedback against the SDAccountRecovery service that can target different levels of detail: SD/CR/BQ")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("SDAccountRecovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("SDAccountRecovery Feedback Request Payload")
                .endParam()
                .to("direct:feedbackSDAccountRecovery")
            .get("/account-recovery/{sd-reference-id}")
                .id("retrieveSDAccountRecovery")
                .description("Analytical views maintained by the SDAccountRecovery service center for management reporting and analysis purposes")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("SDAccountRecovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/SDAccountRecoveryRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveSDAccountRecovery")
            .post("/account-recovery/{sd-reference-id}/account-recovery-procedure/initiation")
                .id("initiateAccountRecoveryProcedure")
                .description("Initiate the account recovery procedure")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("AccountRecoveryProcedure Request Payload")
                .endParam()
                .to("direct:initiateAccountRecoveryProcedure")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/update")
                .id("updateAccountRecoveryProcedure")
                .description("Update details of an active account recovery case")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("AccountRecoveryProcedure Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedure")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/exchange")
                .id("exchangeAccountRecoveryProcedureUpdate")
                .description("Accept, reject, verify etc. an active account recovery case")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("AccountRecoveryProcedure Request Payload")
                .endParam()
                .to("direct:exchangeAccountRecoveryProcedureUpdate")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}")
                .id("retrieveAccountRecovery")
                .description("Retrieve details about an active account recovery case")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/CRAccountRecoveryProcedureRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecovery")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/assessment/{bq-reference-id}/update")
                .id("updateAccountRecoveryProcedureAssessment")
                .description("Update details of an active case assessment")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Assessment Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Assessment Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedureAssessment")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/assessment/{bq-reference-id}/")
                .id("retrieveAccountRecoveryProcedureAssessment")
                .description("Retrieve details of an active case assessment .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Assessment Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/BQAssessmentRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecoveryProcedureAssessment")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/writedown/{bq-reference-id}/update")
                .id("updateAccountRecoveryProcedureWritedown")
                .description("Update details of an active case write-down")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Writedown Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Writedown Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedureWritedown")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/writedown/{bq-reference-id}/exchange")
                .id("exchangeAccountRecoveryProcedureWritedownUpdate")
                .description("Accept, reject, verify etc. an active case write-down")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Writedown Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Writedown request payload")
                .endParam()
                .to("direct:exchangeAccountRecoveryProcedureWritedownUpdate")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/writedown/{bq-reference-id}/")
                .id("retrieveAccountRecoveryProcedureWritedown")
                .description("Retrieve details of an active case assessment .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Writedown Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/BQWritedownRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecoveryProcedureWritedown")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/planning/{bq-reference-id}/update")
                .id("updateAccountRecoveryProcedurePlanning")
                .description("Update details of an active case recovery plan")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Planning Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Planning Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedurePlanning")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/planning/{bq-reference-id}/")
                .id("retrieveAccountRecoveryProcedurePlanning")
                .description("Retrieve details of an active case recovery plan .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Planning Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/BQPlanningRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecoveryProcedurePlanning")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/negotiation/{bq-reference-id}/update")
                .id("updateAccountRecoveryProcedureNegotiation")
                .description("Update details of an active case negotiation")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Negotiation Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Negotiation Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedureNegotiation")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/negotiation/{bq-reference-id}/exchange")
                .id("exchangeAccountRecoveryProcedureNegotiationUpdate")
                .description("Accept, reject, verify etc. an active case negotiation")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Negotiation Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Negotiation request payload")
                .endParam()
                .to("direct:exchangeAccountRecoveryProcedureNegotiationUpdate")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/negotiation/{bq-reference-id}/requisition")
                .id("requestAccountRecoveryProcedureNegotiationUpdate")
                .description("Request a negotiation for an active recovery case")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Negotiation Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Negotiation request payload")
                .endParam()
                .to("direct:requestAccountRecoveryProcedureNegotiationUpdate")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/negotiation/{bq-reference-id}/")
                .id("retrieveAccountRecoveryProcedureNegotiation")
                .description("Retrieve details of an active case negotiation .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Negotiation Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/BQNegotiationRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecoveryProcedureNegotiation")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/restructuring/{bq-reference-id}/update")
                .id("updateAccountRecoveryProcedureRestructuring")
                .description("Update details of case restructuring tasks")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Restructuring Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Restructuring Request Payload")
                .endParam()
                .to("direct:updateAccountRecoveryProcedureRestructuring")
            .put("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/restructuring/{bq-reference-id}/exchange")
                .id("exchangeAccountRecoveryProcedureRestructuringUpdate")
                .description("Accept, reject, verify etc. case restructuring task")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Restructuring Instance Reference")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Restructuring request payload")
                .endParam()
                .to("direct:exchangeAccountRecoveryProcedureRestructuringUpdate")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/restructuring/{bq-reference-id}/")
                .id("retrieveAccountRecoveryProcedureRestructuring")
                .description("Retrieve details of case restructuring tasks .The retrieve operation can have sub qualifiers beyond BQ level, please reffer to the model heriarchy to extend beyond BQ level into APIs retrieving sub-qualifier level information.")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("bq-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Restructuring Instance Reference")
                .endParam()
                .param()
                    .name("queryparams")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Query params from schema '#/definitions/BQRestructuringRetrieveInputModel'")
                .endParam()
                .to("direct:retrieveAccountRecoveryProcedureRestructuring")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure")
                .id("RetrieveAccountRecoveryReferenceIds")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("collection-filter")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Filter to refine the result set. ex- AccountRecovery Instance Status='active'")
                .endParam()
                .to("direct:RetrieveAccountRecoveryReferenceIds")
            .get("/account-recovery/account-recovery-procedure/behavior-qualifiers/")
                .id("RetrieveAccountRecoveryBehaviorQualifiers")
                .produces("application/json")
                .to("direct:RetrieveAccountRecoveryBehaviorQualifiers")
            .get("/account-recovery/{sd-reference-id}/account-recovery-procedure/{cr-reference-id}/{behavior-qualifier}/")
                .id("RetrieveAccountRecoveryBehaviorQualifierReferenceIds")
                .produces("application/json")
                .param()
                    .name("sd-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Account Recovery Servicing Session Reference")
                .endParam()
                .param()
                    .name("cr-reference-id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("AccountRecoveryProcedure Instance Reference")
                .endParam()
                .param()
                    .name("behavior-qualifier")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Behavior Qualifier Name. ex- Restructuring")
                .endParam()
                .param()
                    .name("collection-filter")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Filter to refine the result set. ex- Restructuring Instance Status = 'pending'")
                .endParam()
                .to("direct:RetrieveAccountRecoveryBehaviorQualifierReferenceIds");
    }
}
