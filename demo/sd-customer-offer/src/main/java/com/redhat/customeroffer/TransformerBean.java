package com.redhat.customeroffer;

import com.google.gson.Gson;
import com.redhat.bian.servicedomain.models.*;
import org.apache.camel.Exchange;

import java.util.Date;
import java.util.Map;

public class TransformerBean {

    public String extractRequest(Exchange exchange) {
        BianResponse bianResponse = new BianResponse();

        BianRequest bianRequest = new Gson().fromJson(exchange.getIn().getBody().toString(),BianRequest.class);
        Map dataMap = (Map) bianRequest.getData();
        String refInstance = new Gson().fromJson(dataMap.get("customerOfferServicingSessionReference").toString(),String.class);

        CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord crRecord = new Gson().fromJson(dataMap.get("customerOfferProcedureInstanceRecord").toString(),CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord.class);
        String retrieveURL="product-directory/"+exchange.getIn().getHeader("sd-reference-id")+ "/product-directory-entry/" + refInstance + "/salesandmarketing/MARKETING12345";
        exchange.setProperty("crRecord",crRecord);
        exchange.setProperty("crRefId",exchange.getIn().getHeader("cr-reference-id"));
        exchange.setProperty("sdRefId",exchange.getIn().getHeader("sd-reference-id"));
        exchange.setProperty("sessionref",refInstance);
        exchange.setProperty("retrieveURL",retrieveURL);


        return retrieveURL;
    }

    public String initiateAppDownload(Exchange exchange) {

        CRProductOrServiceDeploymentProjectCreateInputModel crProductOrServiceDeploymentProjectCreateInputModel = new CRProductOrServiceDeploymentProjectCreateInputModel();
        CRCustomerProductDeploymentInstanceRecord crCustomerProductDeploymentInstanceRecord = new CRCustomerProductDeploymentInstanceRecord();
        CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord controlRecord = (CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord)exchange.getProperty("crRecord");
        crCustomerProductDeploymentInstanceRecord.setCustomerReference(controlRecord.getCustomerReference());
        crCustomerProductDeploymentInstanceRecord.setProductType(controlRecord.getProductServiceType());
        crProductOrServiceDeploymentProjectCreateInputModel.setCrCustomerProductDeploymentInstanceRecord(crCustomerProductDeploymentInstanceRecord);
        crProductOrServiceDeploymentProjectCreateInputModel.setProductDeploymentServicingSessionReference("PROD2677");

        BianRequest bianRequest = new BianRequest(crProductOrServiceDeploymentProjectCreateInputModel);
        return new Gson().toJson(bianRequest);
    }

    public String updateProductEligibility(Exchange exchange) {
        CRCustomerEligibilityAssessmentUpdateInputModel crCustomerEligibilityAssessmentUpdateInputModel = new CRCustomerEligibilityAssessmentUpdateInputModel();
        crCustomerEligibilityAssessmentUpdateInputModel.setCustomerProductServiceEligibilityServicingSessionReference("UPDATE67678");
        crCustomerEligibilityAssessmentUpdateInputModel.setCustomerEligibilityAssessmentInstanceReference("UPDATEASSES67767");
        crCustomerEligibilityAssessmentUpdateInputModel.setDate(new Date().toString());
        CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord controlRecord = (CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord)exchange.getProperty("crRecord");

        crCustomerEligibilityAssessmentUpdateInputModel.setCustomerEligibilityAssessmentUpdateActionTaskRecord(controlRecord);
        BianRequest bianRequest = new BianRequest(crCustomerEligibilityAssessmentUpdateInputModel);
        return new Gson().toJson(bianRequest);

    }

    public String prepareOfferInitiationResponse(Exchange exchange) {
        CRCustomerOfferProcedureInitiateOutputModel crCustomerOfferProcedureInitiateOutputModel = new CRCustomerOfferProcedureInitiateOutputModel();
        crCustomerOfferProcedureInitiateOutputModel.setCustomerOfferProcedureInitiateActionReference("PRODINIT2832");
        CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord = new CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord();
        CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask crTask = new CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask();
        crTask.setCustomerOfferProcessingTaskResult("SUCCESS");
        CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord controlRecord = (CRCustomerOfferProcedureInitiateInputModelCustomerOfferProcedureInstanceRecord)exchange.getProperty("crRecord");

        crTask.setCustomerOfferProcessingTaskWorkProducts(controlRecord.getProductServiceType());
        crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord.setCustomerOfferProcessingTask(crTask);
        crCustomerOfferProcedureInitiateOutputModel.setCustomerOfferProcedureInstanceRecord(crCustomerOfferProcedureInitiateOutputModelProductInstanceRecord);
        BianResponse bianResponse = new BianResponse();
        bianResponse.setData(crCustomerOfferProcedureInitiateOutputModel);
        return new Gson().toJson(bianResponse);

    }
}
