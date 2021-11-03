package org.bian.protobuf;

import io.quarkus.grpc.runtime.MutinyService;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public interface OutboundBindingService extends MutinyService {

    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request);
    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request);
    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> notify(io.cloudevents.v1.proto.CloudEvent request);
    
    
    

}