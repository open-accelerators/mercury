package com.redhat.productdirectory;

import com.google.gson.Gson;
import com.redhat.bian.servicedomain.models.*;
import org.apache.camel.Exchange;

import java.util.Date;
import java.util.Map;

public class TransformerBean {

    public String retrieveSalesandmarketing(Exchange exchange){
        String referenceId = exchange.getIn().getHeader("sd-reference-id").toString();
        String crReferenceId = exchange.getIn().getHeader("cr-reference-id").toString();
        String bqReferenceId = exchange.getIn().getHeader("bq-reference-id").toString();
        BianResponse bianResponse = new BianResponse();
        BQSalesandMarketingRetrieveOutputModel bqSalesandMarketingRegisterOutputModel = new BQSalesandMarketingRetrieveOutputModel();
        BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord bqSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord = new BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord();
        bqSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord.setProductServiceOfferProcessingRequirements("Active Customer");
        bqSalesandMarketingRegisterOutputModel.setSalesandMarketingInstanceRecord(bqSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord);
        CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord crProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord = new CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord();
        bqSalesandMarketingRegisterOutputModel.setSalesandMarketingRetrieveActionTaskReference("PRODDIR6545");
        bqSalesandMarketingRegisterOutputModel.setProductDirectoryEntryInstanceRecord(crProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord);

        System.out.println("Retrieve Processing Requirements: "+ new Gson().toJson(bqSalesandMarketingRegisterOutputModel));
        bianResponse.setData(bqSalesandMarketingRegisterOutputModel);
        return new Gson().toJson(bianResponse);
    }
}
