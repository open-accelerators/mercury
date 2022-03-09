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
This will be done through a message channel and the clients will subscribe to it.

## Diagram

![mercury framework](../docs/images/mercury%20framework.png)

## *service-domain*-common

This is a common library used by client, events and service libraries. Includes the `.proto` files
and the generated Java model for this specific service domain

It also includes the Notification APIs and ServiceDomain-related constants.

## *service-domain*-client

Client library to be used for gRPC communication with the _Service Domain_. Use this library to your
project if you need to communicate with a specific service domain through gRPC. e.g.

```xml
<dependency>
  <groupId>com.redhat.mercury</groupId>
  <artifactId>customer-offer-client</artifactId>
</dependency>
```

After adding this dependency, you can inject the `CustomerOfferClient` service that includes a set of
`grpcClient` to talk to the different interfaces available in the `CustomerOffer` service domain.

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
## *service-domain*-events

Client library to be used only when need for subscription to the _service-domain_ events. It 
contains tools to automatically subscribe to a messaging channel.

```xml
<dependency>
    <groupId>com.redhat.mercury</groupId>
    <artifactId>customer-offer-events</artifactId>
</dependency>
```
Extend the abstract class `CustomerOfferNotificationService` for handling each specific event

```java
public class MyCustomerOfferNotificationServiceImpl extends CustomerOfferNotificationService {
    
    @Override
    public Uni<Empty> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        Uni.createFrom()
                .item(notification)
                .onItem()
                //notification asynchronous handling
                ;
    }
}
```

## *service-domain*-service

Used for this specific service domain implementation. Contains the gRPC service endpoints, 
the state change notification service and the service interfaces to be implemented following the business needs.

```xml
<dependency>
    <groupId>com.redhat.mercury</groupId>
    <artifactId>customer-offer-service</artifactId>
</dependency>
```

In order to implement a ServiceDomain you have to implement the specific ServiceDomain resource or subresource.
Most ServiceDomains are divided into ControlRecords and multiple Behaviour Qualifiers. This business 
separation of concerns is available in the Mercury framework.

As an example, the CustomerOffer service domain has the CustomerOfferProcedure Control Record, so, it is
possible to just implement the CRCustomerOfferProcedureService interface, but you should also add the `@GrpcService`
annotation to expose the service externally.

After adding this dependency a Quarkus `grpcService` will be added and in your project you will 
only have to implement the methods your business logic requires. If a given method is not implemented
a no-op default implementation will be provided for you.

The `NotificationService` can be injected and will handle all the channel subscription and metadata
for the specific Service Domain.

```java
import io.quarkus.grpc.GrpcService;

@GrpcService
public class MyCOServiceImpl implements CRCustomerOfferProcedureService {
 
    @Inject
    CustomerOfferNotificationService notificationService;

    @Override
    public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
        // my business logic here
        return Uni.createFrom()
                .item(request)
                .invoke(r -> notificationService.onCustomerOfferInitiated(r));
    }
}
```

## Examples

You can find a set of demo integrations in the [examples](./examples) folder:

* Customer Credit Rating
* Party Routing Profile
* Customer Offer
* Customer Offer - Kogito --> deprecated
