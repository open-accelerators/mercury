package com.redhat.mercury.codegen.model;

import com.redhat.mercury.codegen.utils.NamingUtils;

public class MessagingService {

    private final String serviceDomain;
    private final String name;

    public MessagingService(String serviceDomain, String name) {
        this.serviceDomain = serviceDomain;
        this.name = name;
    }
    
    public String getChannelName() {
        return NamingUtils.toChannelName(name);
    }

    public String getChannelId() {
        return NamingUtils.toChannelId(serviceDomain, name);
    }
}
