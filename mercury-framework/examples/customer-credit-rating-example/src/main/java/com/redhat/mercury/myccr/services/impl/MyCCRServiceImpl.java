package com.redhat.mercury.myccr.services.impl;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customercreditrating.model.RetrieveCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.model.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1;
import com.redhat.mercury.customercreditrating.model.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1CustomerCreditRatingAssessmentRecord;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCCRServiceImpl implements CustomerCreditRatingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCCRServiceImpl.class);
    private static final String FIXED_RATING = "802";

    @Override
    public Uni<RetrieveCustomerCreditRatingStateResponse> retrieve(String cr) {
        LOGGER.info("retrieveCustomerCreditRating received");
        return Uni.createFrom().item(() -> {
            RetrieveCustomerCreditRatingStateResponse rating = new RetrieveCustomerCreditRatingStateResponse();
            CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1 instanceRecord =
                    new CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1();
            CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1CustomerCreditRatingAssessmentRecord assessment =
                    new CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord1CustomerCreditRatingAssessmentRecord();
            assessment.setCreditRatingAssessmentResult(FIXED_RATING);
            instanceRecord.setCustomerCreditRatingAssessmentRecord(assessment);
            rating.setCustomerCreditRatingStateInstanceRecord(instanceRecord);
            return rating;
        });
    }
}
