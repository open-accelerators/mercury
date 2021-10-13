package com.redhat.mercury.myccr.services.impl;

import org.bian.protobuf.customercreditrating.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingService;

import javax.enterprise.context.ApplicationScoped;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MyCCRServiceImpl extends CustomerCreditRatingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCCRServiceImpl.class);
    private static final Integer FIXED_RATING = 802;

    @Override
    public Uni<Rating> retrieveCustomerCreditRatingState(String sd, String cr) {
        LOGGER.info("retrieveCustomerCreditRatingState received");
        return Uni.createFrom().item(() -> Rating.newBuilder()
                .setRating(FIXED_RATING)
                .build());
    }
}
