package com.redhat.productdeployment;

import com.google.gson.Gson;
import com.redhat.bian.servicedomain.models.*;
import org.apache.camel.Exchange;

import java.util.Map;

public class TransformerBean {

    public String create(Exchange exchange){
        BianResponse bianResponse = new BianResponse();
        BianRequest bianRequest = new Gson().fromJson(exchange.getIn().getBody().toString(),BianRequest.class);
        Map dataMap = (Map) bianRequest.getData();
        CRCustomerProductDeploymentInstanceRecord crRecord = new Gson().fromJson(dataMap.get("crCustomerProductDeploymentInstanceRecord").toString(),CRCustomerProductDeploymentInstanceRecord.class);
        CRProductOrServiceDeploymentProjectCreateOutputModel crProductOrServiceDeploymentProjectCreateOutputModel = new CRProductOrServiceDeploymentProjectCreateOutputModel();
        CRCustomerProductDeploymentInstanceRecord crCustomerProductDeploymentInstanceRecord = new CRCustomerProductDeploymentInstanceRecord();
        crCustomerProductDeploymentInstanceRecord.setProductType(crRecord.getProductType());
        crCustomerProductDeploymentInstanceRecord.setCustomerReference(crRecord.getCustomerReference());
        crCustomerProductDeploymentInstanceRecord.setStatus("SUCCESS");
        crProductOrServiceDeploymentProjectCreateOutputModel.setCrCustomerProductDeploymentInstanceRecord(crCustomerProductDeploymentInstanceRecord);
        System.out.println("Create Product Deployment: "+ new Gson().toJson(crProductOrServiceDeploymentProjectCreateOutputModel));
        // bianResponse.setData(crProductOrServiceDeploymentProjectCreateOutputModel);
        return new Gson().toJson(bianResponse);


    }
}
