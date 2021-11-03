package org.bian.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: binding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalBindingServiceGrpc {

  private InternalBindingServiceGrpc() {}

  public static final String SERVICE_NAME = "org.bian.protobuf.InternalBindingService";

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
    if ((getQueryMethod = InternalBindingServiceGrpc.getQueryMethod) == null) {
      synchronized (InternalBindingServiceGrpc.class) {
        if ((getQueryMethod = InternalBindingServiceGrpc.getQueryMethod) == null) {
          InternalBindingServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBindingServiceMethodDescriptorSupplier("query"))
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
    if ((getCommandMethod = InternalBindingServiceGrpc.getCommandMethod) == null) {
      synchronized (InternalBindingServiceGrpc.class) {
        if ((getCommandMethod = InternalBindingServiceGrpc.getCommandMethod) == null) {
          InternalBindingServiceGrpc.getCommandMethod = getCommandMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "command"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBindingServiceMethodDescriptorSupplier("command"))
              .build();
        }
      }
    }
    return getCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalBindingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceStub>() {
        @java.lang.Override
        public InternalBindingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBindingServiceStub(channel, callOptions);
        }
      };
    return InternalBindingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalBindingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceBlockingStub>() {
        @java.lang.Override
        public InternalBindingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBindingServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalBindingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalBindingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBindingServiceFutureStub>() {
        @java.lang.Override
        public InternalBindingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBindingServiceFutureStub(channel, callOptions);
        }
      };
    return InternalBindingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InternalBindingServiceImplBase implements io.grpc.BindableService {

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
          .build();
    }
  }

  /**
   */
  public static final class InternalBindingServiceStub extends io.grpc.stub.AbstractAsyncStub<InternalBindingServiceStub> {
    private InternalBindingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBindingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBindingServiceStub(channel, callOptions);
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
  }

  /**
   */
  public static final class InternalBindingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InternalBindingServiceBlockingStub> {
    private InternalBindingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBindingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBindingServiceBlockingStub(channel, callOptions);
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
  }

  /**
   */
  public static final class InternalBindingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InternalBindingServiceFutureStub> {
    private InternalBindingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBindingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBindingServiceFutureStub(channel, callOptions);
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
  }

  private static final int METHODID_QUERY = 0;
  private static final int METHODID_COMMAND = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InternalBindingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InternalBindingServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class InternalBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalBindingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bian.protobuf.Binding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalBindingService");
    }
  }

  private static final class InternalBindingServiceFileDescriptorSupplier
      extends InternalBindingServiceBaseDescriptorSupplier {
    InternalBindingServiceFileDescriptorSupplier() {}
  }

  private static final class InternalBindingServiceMethodDescriptorSupplier
      extends InternalBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalBindingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalBindingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalBindingServiceFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .addMethod(getCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
