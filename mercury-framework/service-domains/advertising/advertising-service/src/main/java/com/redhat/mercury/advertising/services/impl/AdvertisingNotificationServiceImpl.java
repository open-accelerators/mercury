package com.redhat.mercury.advertising.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.advertising.Advertising;
import com.redhat.mercury.advertising.services.AdvertisingNotificationService;

@ApplicationScoped
public class AdvertisingNotificationServiceImpl extends AdvertisingNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertisingNotificationServiceImpl.class);

    @Inject
    @Channel(Advertising.DOMAIN_NAME)
    Emitter<Message> emitter;
}
