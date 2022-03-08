package com.redhat.mercury.customercreditrating.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.customercreditrating.CustomerCreditRating;
import com.redhat.mercury.customercreditrating.services.CustomerCreditRatingNotificationService;

@ApplicationScoped
public class CustomerCreditRatingNotificationServiceImpl implements CustomerCreditRatingNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreditRatingNotificationServiceImpl.class);

    @Inject
    @Channel(CustomerCreditRating.DOMAIN_NAME)
    Emitter<Message> emitter;
}
