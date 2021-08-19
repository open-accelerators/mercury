# Service Domain interoperability

## Exchange patterns

In BIAN there are 6 types of exchange patterns defined depending of their nature or expectations.

### Transactional

#### Instantaneous

Using shared physical storage. Concurrent data access managed by the physical database
mechanisms to maintain conceptual partitions/data integrity. This type of exchange is
usually implemented within the same deployment/application.

#### Real-time

Response expected in sub-second time. Fast hand-shake message exchange queue/event mechanism established between Service Domains. Caller waits on response.

A synchronous request/response where the caller knows where the callee is located and how to interact with it.
e.g. HTTP Restful request/response.

#### Best-time

Response expected after source has time to process an automated request. Timely exchange queue/message mechanism, but caller may multi-thread activity.

Potentially asynchronous request/response where the caller knows where the request has to be sent and the callee
knows where the response is expected.

#### Delayed response

Response expected after manual intervention. Request and response completely decoupled. Caller must either poll
for or be notified of the eventual response (in the latter case this could be considered as a referential exchange
implementation).

### Referential

#### Broadcast notification on update

A timely/instant notification. State transition initiates a notification message to a pre-configured subscription (scope defined by CR/BQ/SBQ level and optionally instance reference)

#### Background Scheduled synchronization

The scheduled synchronization of non-volatile information – Scheduled data-set/file transfer for ‘enterprise reference’ information. Managed by directory type Service Domains…

## Communication patterns

We can assume 3 different type of communication patterns between different Service Domains:

### Query

When a given service domain requests information from a different domain. This is usually a
synchronous request. The caller knows the coordinates of the callee and how to interact with it.

Can be applied to transactional patterns:

* Real-time
* Polled delayed response

### Command

When a SD commands another SD to take a specific action (e.g. update a record). This type
of request can be either synchronous or asynchronous, depending on the system requirements.
In a synchronous scenario the command would ideally receive the result of the command, if any.
However when the result is not required or it can be polled or it will be received via an
event, the command can be sent asynchronously.

Target transactional patterns:

* Best-time: If the command is accepted by the target (message queue, kafka topic, http 201
created or 202 accepted). The target SD will process the request as soon as possible and if
needed emit an event with the new state of the affected record.
* Delayed response: Similarly to the previous case but after the manual intervention has
taken place.
* Background Scheduled synchronization: The intend of synchronization can be considered
a Command that is consumed periodically. The result can be emitted as an Event or Query-ed.

### Event

After a certain record has changed its internal state an event might be emitted. This event
will be received by one or many other SD in order to take a specific action.

* Broadcast notifications on update: After a CR/BQ is updated it can happen that other SD
are interested in such change that's why an event will be broadcasted for example to a
message broker where any other SD can subscribe to.

## Domain Object definition

### Service Domain definition

A Service Domain entity must be defined in order to create bindings. Service Domain definitions focus
on how their endpoints will be exposed in terms of protocols and security. Besides such definitions can
be used by an application to deploy any infrastructure components required for a specific service domain.
E.g. persistence, monitoring.

This is the `CustomerOffer` service domain definition where an HTTPS endpoint named `httpsEndpoint` will be
exposed. This endpoint is might be used only for query. Besides notifications will be sent to the defined
Kafka server and topic.

```yaml
type: ServiceDomain
name: customerOfferDomain
spec:
  serviceDomain: CustomerOffer
  endpoints:
    - name: httpsEndpoint
      http:
        allowHttps: only
  notifications: 
    kafka:
      brokers: kafka.example.com:9092
      topic: customer_offer
```

In this case, the `ConsumerLoan` service domain exposes an `amqp` endpoint. That means that the Service Domain
will receive requests through an external AMQP broker.

```yaml
type: ServiceDomain
name: consumerLoanDomain
spec:
  serviceDomain: ConsumerLoan
  endpoints:
    - name: asynCommand
      amqp:
        remoteUri: amqp://some.server.example.com:5672
        topic: consumer_loan_commands
```

Finally The `PartyRoutingProfile` does not require to expose any endpoint.

```yaml
type: ServiceDomain
name: partyRoutingProfileDomain
spec:
  serviceDomain: PartyRoutingProfile
```

### Service Domain Binding definition

When a Service Domain wants to communicate with another SD it has to specify the target SD and the endpoint
name. The application monitoring the service domain bindings will create the necessary infrastructure
resources to allow both service domains to interact through the named endpoints.

```yaml
type: ServiceDomainBinding
name: partyRoutingQueryBinding
spec:
  source: partyRoutingProfileDomain
  target: customerOfferDomain
  name: httpsEndpoint

type: ServiceDomainBinding
name: customerOfferCommandBinding
spec:
  source: customerOfferDomain
  target: prodDirectoryDomain
  name: asynCommand
```

### Event Subscription definition

A Service Domain interested in state change notifications generated by other Service Domain
will define an `EventSubscription`. Certain filtering capabilities will be provided like
event type.

```yaml
type: EventSubscription
name: customerOfferEventSub
spec:
  subscriber: partyRoutingProfileDomain
  serviceDomain: customerOfferDomain
  filter:
    types:
      - org.bian.customeroffer.initiated
      - org.bian.customeroffer.completed
```
