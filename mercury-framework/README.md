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

The integration between two different service domains is expected to happen using [CloudEvents](https://cloudevents.io/)
over [gRPC](https://grpc.io/). The client service sends a CloudEvent to the target service
and the target service understands the command or query received from the CloudEvent Type. The
context is extracted from the extension attributes (Service Domain Reference, Control Record, 
Behaviour Qualifiers, ...) and the service implements the business logic for this Query/Command.

## State change notifications

After a record is created/updated in a Service Domain the internal state might change and that change
should be broadcasted to other service domains interested in such changes.
This will be done through a message channel and the clients will subscribe to it.

## Diagram

![mercury framework](./docs/mercury%20framework.png)

## <service-domain>-common

This is a common library used by client, events and service libraries. Includes the `.proto` files
and the generated Java model for this specific service domain

It also includes the Service and Notification APIs.

## <service-domain>-client

Client library to be used for gRPC communication with the _Service Domain_. Use this library to your
project if you need to communicate with a specific service domain through gRPC. e.g.

```xml
<dependency>
  <groupId>com.redhat.mercury</groupId>
  <artifactId>customer-offer-client</artifactId>
</dependency>
```

After adding this dependency, you can inject the `CustomerOfferClient` service that includes a 
`grpcClient` and talk to the `CustomerOffer` service domain.

```java
public class MyService {
    
    @Inject
    CustomerOfferClient client;

    public void myBusinessLogic() {
        client.retrieveCustomerOffer(sdRef, crRef);
    }
}
```
## <service-domain>-events

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
public MyCustomerOfferNotificationServiceImpl extends CustomerOfferNotificationService {
    
    @Override
    public void onCustomerOfferInitiated(CustomerOfferNotification notification) {
        // do something
    }
}
```

## <service-domain>-service

Used for this specific service domain implementation. Contains the gRPC service endpoints, 
the state change notification service and the service interfaces to be implemented following the business needs.

```xml
<dependency>
    <groupId>com.redhat.mercury</groupId>
    <artifactId>customer-offer-service</artifactId>
</dependency>
```

After adding this dependency a Quarkus `grpcService` will be added and in your project you will 
only have to implement the methods your business logic requires. If a given method is not implemented
a no-op default implementation will be provided for you.

```java
public MyCustomerOffer implements CustomerOfferService {
    
    @Inject
    CustomerOfferNotificationService notificationService;
    
    @Override
    public Uni<Message> retrieveCustomerOffer(String sdRefId, String crRefId) {
        // my business logic here
    }
}
```

## Examples

You can find a set of demo integrations in the [examples](./examples) folder:

* Customer Credit Rating
* Party Routing Profile
* Customer Offer
* Customer Offer - Kogito
