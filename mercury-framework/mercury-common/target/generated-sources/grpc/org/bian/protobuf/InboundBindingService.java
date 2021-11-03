package org.bian.protobuf;

import io.quarkus.grpc.runtime.MutinyService;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public interface InboundBindingService extends MutinyService {

    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request);
    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request);
    
    io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> receive(io.cloudevents.v1.proto.CloudEvent request);
    /**
         * <pre>
         *  In order to avoid having the BindingSvc depending on all types only for external requests
         *  this method is used
         * </pre>
         */
    io.smallrye.mutiny.Uni<org.bian.protobuf.ExternalResponse> external(org.bian.protobuf.ExternalRequest request);
    
    
    

}