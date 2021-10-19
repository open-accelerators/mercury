package com.redhat.mercury.advertising.services.impl;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.advertising.services.AdvertisingNotificationService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class AdvertisingNotificationServiceImpl extends AdvertisingNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertisingNotificationServiceImpl.class);

    @GrpcClient("outboundBindingService")
    OutboundBindingService outbound;

}
