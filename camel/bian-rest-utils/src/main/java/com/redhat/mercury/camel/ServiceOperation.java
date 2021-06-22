package com.redhat.mercury.camel;

import javax.ws.rs.HttpMethod;

public enum ServiceOperation {
    Activate(HttpMethod.POST, "/activation"), 
    Configure(HttpMethod.PUT, "/configuration"),
    Feedback(HttpMethod.PUT, "/feedback"),
    // Create,
    Initiate(HttpMethod.POST, "/initiation"),
    // Register,
    // Evaluate,
    // Provide,
    // Update,
    Control(HttpMethod.PUT, "/control"), 
    Exchange(HttpMethod.PUT, "/exchange"), 
    Capture(HttpMethod.PUT, "/capture"),
    Execute(HttpMethod.PUT, "/execution"), 
    Request(HttpMethod.PUT, "/requisition"),
    // Grant,
    Retrieve(HttpMethod.GET, "");
    // Notify;

    public final String verb;
    public final String path;

    ServiceOperation(String verb, String path) {
        this.verb = verb;
        this.path = path;
    }
}
