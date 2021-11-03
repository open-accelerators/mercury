package org.bian.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: binding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InboundBindingServiceGrpc {

  private InboundBindingServiceGrpc() {}

  public static final String SERVICE_NAME = "org.bian.protobuf.InboundBindingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "query",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getQueryMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getQueryMethod;
    if ((getQueryMethod = InboundBindingServiceGrpc.getQueryMethod) == null) {
      synchronized (InboundBindingServiceGrpc.class) {
        if ((getQueryMethod = InboundBindingServiceGrpc.getQueryMethod) == null) {
          InboundBindingServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new InboundBindingServiceMethodDescriptorSupplier("query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "command",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getCommandMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getCommandMethod;
    if ((getCommandMethod = InboundBindingServiceGrpc.getCommandMethod) == null) {
      synchronized (InboundBindingServiceGrpc.class) {
        if ((getCommandMethod = InboundBindingServiceGrpc.getCommandMethod) == null) {
          InboundBindingServiceGrpc.getCommandMethod = getCommandMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "command"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new InboundBindingServiceMethodDescriptorSupplier("command"))
              .build();
        }
      }
    }
    return getCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getReceiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receive",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getReceiveMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getReceiveMethod;
    if ((getReceiveMethod = InboundBindingServiceGrpc.getReceiveMethod) == null) {
      synchronized (InboundBindingServiceGrpc.class) {
        if ((getReceiveMethod = InboundBindingServiceGrpc.getReceiveMethod) == null) {
          InboundBindingServiceGrpc.getReceiveMethod = getReceiveMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "receive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new InboundBindingServiceMethodDescriptorSupplier("receive"))
              .build();
        }
      }
    }
    return getReceiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.bian.protobuf.ExternalRequest,
      org.bian.protobuf.ExternalResponse> getExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "external",
      requestType = org.bian.protobuf.ExternalRequest.class,
      responseType = org.bian.protobuf.ExternalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.bian.protobuf.ExternalRequest,
      org.bian.protobuf.ExternalResponse> getExternalMethod() {
    io.grpc.MethodDescriptor<org.bian.protobuf.ExternalRequest, org.bian.protobuf.ExternalResponse> getExternalMethod;
    if ((getExternalMethod = InboundBindingServiceGrpc.getExternalMethod) == null) {
      synchronized (InboundBindingServiceGrpc.class) {
        if ((getExternalMethod = InboundBindingServiceGrpc.getExternalMethod) == null) {
          InboundBindingServiceGrpc.getExternalMethod = getExternalMethod =
              io.grpc.MethodDescriptor.<org.bian.protobuf.ExternalRequest, org.bian.protobuf.ExternalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "external"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bian.protobuf.ExternalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bian.protobuf.ExternalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboundBindingServiceMethodDescriptorSupplier("external"))
              .build();
        }
      }
    }
    return getExternalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InboundBindingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceStub>() {
        @java.lang.Override
        public InboundBindingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboundBindingServiceStub(channel, callOptions);
        }
      };
    return InboundBindingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InboundBindingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceBlockingStub>() {
        @java.lang.Override
        public InboundBindingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboundBindingServiceBlockingStub(channel, callOptions);
        }
      };
    return InboundBindingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InboundBindingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboundBindingServiceFutureStub>() {
        @java.lang.Override
        public InboundBindingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboundBindingServiceFutureStub(channel, callOptions);
        }
      };
    return InboundBindingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InboundBindingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void query(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    public void command(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommandMethod(), responseObserver);
    }

    /**
     */
    public void receive(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * In order to avoid having the BindingSvc depending on all types only for external requests
     * this method is used
     * </pre>
     */
    public void external(org.bian.protobuf.ExternalRequest request,
        io.grpc.stub.StreamObserver<org.bian.protobuf.ExternalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_QUERY)))
          .addMethod(
            getCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_COMMAND)))
          .addMethod(
            getReceiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_RECEIVE)))
          .addMethod(
            getExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.bian.protobuf.ExternalRequest,
                org.bian.protobuf.ExternalResponse>(
                  this, METHODID_EXTERNAL)))
          .build();
    }
  }

  /**
   */
  public static final class InboundBindingServiceStub extends io.grpc.stub.AbstractAsyncStub<InboundBindingServiceStub> {
    private InboundBindingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboundBindingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboundBindingServiceStub(channel, callOptions);
    }

    /**
     */
    public void query(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void command(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void receive(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * In order to avoid having the BindingSvc depending on all types only for external requests
     * this method is used
     * </pre>
     */
    public void external(org.bian.protobuf.ExternalRequest request,
        io.grpc.stub.StreamObserver<org.bian.protobuf.ExternalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InboundBindingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InboundBindingServiceBlockingStub> {
    private InboundBindingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboundBindingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboundBindingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent query(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent command(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent receive(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * In order to avoid having the BindingSvc depending on all types only for external requests
     * this method is used
     * </pre>
     */
    public org.bian.protobuf.ExternalResponse external(org.bian.protobuf.ExternalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InboundBindingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InboundBindingServiceFutureStub> {
    private InboundBindingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboundBindingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboundBindingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> query(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> command(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> receive(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * In order to avoid having the BindingSvc depending on all types only for external requests
     * this method is used
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.bian.protobuf.ExternalResponse> external(
        org.bian.protobuf.ExternalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;
  private static final int METHODID_COMMAND = 1;
  private static final int METHODID_RECEIVE = 2;
  private static final int METHODID_EXTERNAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InboundBindingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InboundBindingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        case METHODID_COMMAND:
          serviceImpl.command((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        case METHODID_RECEIVE:
          serviceImpl.receive((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        case METHODID_EXTERNAL:
          serviceImpl.external((org.bian.protobuf.ExternalRequest) request,
              (io.grpc.stub.StreamObserver<org.bian.protobuf.ExternalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InboundBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InboundBindingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bian.protobuf.Binding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InboundBindingService");
    }
  }

  private static final class InboundBindingServiceFileDescriptorSupplier
      extends InboundBindingServiceBaseDescriptorSupplier {
    InboundBindingServiceFileDescriptorSupplier() {}
  }

  private static final class InboundBindingServiceMethodDescriptorSupplier
      extends InboundBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InboundBindingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InboundBindingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InboundBindingServiceFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .addMethod(getCommandMethod())
              .addMethod(getReceiveMethod())
              .addMethod(getExternalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
