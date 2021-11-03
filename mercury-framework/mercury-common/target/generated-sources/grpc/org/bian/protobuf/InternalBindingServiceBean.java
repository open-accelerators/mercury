package org.bian.protobuf;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.runtime.MutinyBean;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public class InternalBindingServiceBean extends MutinyInternalBindingServiceGrpc.InternalBindingServiceImplBase implements BindableService, MutinyBean {

    private final InternalBindingService delegate;

    InternalBindingServiceBean(@GrpcService InternalBindingService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
       try {
         return delegate.query(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
       try {
         return delegate.command(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}