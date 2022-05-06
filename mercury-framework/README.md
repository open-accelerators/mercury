# Mercury Framework

The _Mercury Framework_ contains a set of libraries and tools to facilitate the integration between
different _Service Domains_.

Business applications can leverage the _Mercury Framework_ for:

* Application to application communication
* State notification broadcasting (Eventing)

There is a Service Domain specific set of dependencies that can be used depending on the business
needs.
All libraries use the [SmallRye Mutiny](https://smallrye.io/smallrye-mutiny/index.html) 
reactive framework and are implemented using [Quarkus](https://quarkus.io/).

## Application to Application (a2a) Integration

The integration between two different service domains is expected to happen over [gRPC](https://grpc.io/). 
The client service sends a gRPC command/query directly to the target service
and the target service replies with a non-blocking response that can be processed at any point in the time.

Developers will be provided with a set of services that have to be implemented to contain the
business specific logic together with clients to integrate with other Service Domains. 

## State change notifications

After a record is created/updated in a Service Domain the internal state might change and that change
should be broadcasted to other service domains interested in such changes.
This will be done through the specific message channel depending on the context so that clients can subscribe to it.

## Diagram

![mercury framework](../docs/images/mercury%20framework.png)

## Service Domain Common library

This is a common library that contains the generated gRPC services/clients generated from the `.proto` files
and the event model for a given Service Domain.

It also includes the Notification APIs and ServiceDomain-related constants.

```xml
<dependency>
  <groupId>com.redhat.mercury</groupId>
  <artifactId>customer-offer-common</artifactId>
</dependency>
```

## Service Domain Clients

Client library to be used for gRPC communication with the _Service Domain_. Use this library to your
project if you need to communicate with a specific service domain through gRPC. e.g.

```xml
<dependency>
  <groupId>com.redhat.mercury</groupId>
  <artifactId>customer-offer-client</artifactId>
</dependency>
```

After adding this dependency, you can inject the `CustomerOfferClient` service that includes a set of
`grpcClient` to talk to the Control Record and the different Behavior Qualifiers available in the
`CustomerOffer` service domain.

```java
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class MyService {

    @Inject
    CustomerOfferClient client;

    public void myBusinessLogic() {
        // ...
        client.getCrCustomerOfferProcedureService().initiate(initiateRequest)
                .subscribe()
                .with(message::complete, message::completeExceptionally);
        // Process the response message asynchronously
    }
}

```
## State change notification

For messaging we rely on [Quarkus Kafka Reactive Messaging](https://quarkus.io/guides/kafka-reactive-getting-started).

There are two type of State Change notification events that can be emitted.

### SDStateNotification

For ServiceDomain state transitions there are a related to Reporting and Operation.
The messaging channel will only receive the event containing the new state. No other information is needed.

### CRStateNotification

For ControlRecord and Behavior Qualifier state transitions related to Instantiation and Invocation.
The messaging channel specific to the type must have a context so that we know where the message belongs to.

The context will have the `referenceId` of the Control Record and then one or many `sub-referenceId` for the
qualifier and sub-qualifiers the event might have.

### Sending a state change notification

The `@Channel` value must have the target message channel the event is targeted.
The `@Broadcast` annotation means the message can be consumed by multiple recipients.

```java
    @Channel(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE)
    @Broadcast
    MutinyEmitter<CRStateNotification> emitter;

    public Uni<Void> send(CRStateNotification notification) {
        return emitter.send(notification);
    }
```

### Receiving a state change notification

Implement the `CRNotificationSink` or the `SDNotificationSink` interface depending on the scope we're interested in.

Then implement the `onReceive` method and don't forget the `@Incoming` annotation with the name of the Channel
we want to subscribe to.

```java
@ApplicationScoped
public class CustomerOfferProcedureSink implements CRNotificationSink {
    @Override
    @Incoming(CustomerOffer.CHANNEL_CR_CUSTOMER_OFFER_PROCEDURE)
    public void onReceive(CRStateNotification notification) {
        switch (notification.getState()) {
            case ControlRecordState.INITIATED:
                svc.updatePartyRoutingState(INITIATED_STATUS, notification.getReferenceId());
                break;
            case ControlRecordState.COMPLETED:
                svc.updatePartyRoutingState(COMPLETED_STATUS, notification.getReferenceId());
                break;
            default:
                LOGGER.warn("Ignore unsupported status with state: {}", notification.getState());
        }
    }
}
```

## Service Domain Implementation

It is possible to implement partially or fully each Service Domain by implementing the necessary gRPC interfaces.

Add to your project the common model library for your service domain

```xml
<dependency>
    <groupId>com.redhat.mercury</groupId>
    <artifactId>customer-offer-common</artifactId>
</dependency>
```

When implementing one of these interfaces you have to annotate your method with the `@GrpcService` that will
expose your service as a gRPC service so that it can be accessed from another service.

```java
@GrpcService
public class MyPRPServiceImpl implements BQStatusService {
    @Override
    public Uni<RetrieveStatusResponse> retrieveStatus(RetrieveStatusRequest request) {
        return Uni.createFrom().item(() -> {
            String prpId = request.getPartyroutingprofileId();
            LOGGER.info("Retrieving party state status for {}", prpId);
            if (prpId != null) {
                PartyRoutingState state = svc.getState(prpId);
                if (state == null) {
                    return null;
                }
                return RetrieveStatusResponse.newBuilder()
                        .setStatus(Status.newBuilder()
                                .setCustomerRelationshipStatus(state.getStatus())
                                .build())
                        .build();
            }
            return null;
        });
    }
}
```

## Examples

You can find a set of demo integrations in the [examples](./examples) folder:

* Customer Credit Rating
* Party Routing Profile
* Customer Offer
* Customer Offer - Kogito --> deprecated
