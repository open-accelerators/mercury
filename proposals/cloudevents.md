# Proposal: CloudEvents as unified event data format

- See [interoperability](./interoperability.md) for an overview of the motivations of this proposal.

Currently BIAN semantic APIs are defined using OpenAPI specification. This standard focuses on RESTful APIs and describes a synchronous request-response interaction for each operation.

This pattern becomes a challenge when trying to use an asynchronous, event driven communication between a variety of services where each service will have to decide how to organise the metadata and payload for a request/response depending on the protocol and transport used.

Eventually each implementation will come up with a different event payload that will add an unnecessary complexity to any integration.

## Example RESTful operation

Let's say a service exposing the RESTful API for the Customer Credit Rating service domain receives a `initiateCustomerCreditRatingState` command as follows

- Service Domain: Customer Credit Rating
- Operation: initiateCustomerCreditRatingState
- Summary: Initiate credit state monitoring for a customer.
- Service Operation: Initiate
- HTTP Method: `POST`
- HTTP Path: `/customer-credit-rating/{sdReferenceId}/customer-credit-rating-state/initiation`
- Payload

```json
{
  "customerCreditRatingServicingSessionReference": "some text",
  "customerCreditRatingStateInitiateActionRecord": {},
  "customerCreditRatingStateInstanceStatus": "some text",
  "customerCreditRatingStateInstanceRecord": {
    "customerReference": "some text",
    "customerCreditRatingStatusType": "some text",
    "customerCreditRatingSchedule": "some text",
    "customerCreditRatingAssessmentRecord": {
      "assessmentCustomerBehaviorModelReference": "some text",
      "creditRatingAssessmentType": "some text",
      "creditRatingAssessmentDate": "some text",
      "creditRatingAssessmentWorkProducts": "some text",
      "creditRatingAssessmentResult": "some text"
    },
    "customerCreditRatingRecord": {
      "customerCreditRatingDate": "some text"
    }
  }
}
```

The caller of the service, following with the OpenAPI spec, will expect the following response:

- Status code: 201
- Payload

```json
{
  "customerCreditRatingStateInstanceReference": "some text",
  "customerCreditRatingStateInitiateActionReference": "some text",
  "customerCreditRatingStateInitiateActionRecord": {},
  "customerCreditRatingStateInstanceStatus": "some text",
  "customerCreditRatingStateInstanceRecord": {
    "customerCreditRatingSchedule": "some text",
    "customerCreditRatingAssessmentRecord": {
      "assessmentCustomerBehaviorModelReference": "some text",
      "creditRatingAssessmentType": "some text",
      "creditRatingAssessmentDate": "some text",
      "creditRatingAssessmentWorkProducts": "some text",
      "creditRatingAssessmentResult": "some text"
    },
    "customerCreditRatingRecord": {
      "customerCreditRatingState": "some text",
      "customerCreditRatingAssessment": "some text",
      "customerCreditRatingNarrative": "some text",
      "customerCreditRatingDate": "some text"
    }
  }
}
```

If the chosen transport is Kafka, the message payload would remain the same but the metadata provided in the request path might be
provided as custom Kafka headers or by using a specific topic or by wrapping the payload inside a custom payload. Even if custom headers
are used, the name and values are open to interpretation and will be defined differently by each implementation.

```properties
org.bian.servicedomain=CustomerCreditRating
org.bian.customercreditrating.reference=0001
org.bian.customercreditrating.controlrecord=State
orb.bian.customercreditrating.state.command=Initiate
```

## The proposed solution

[CloudEvents](https://github.com/cloudevents/spec) is a CNCF specification for describing event data in common formats to provide interoperability across services, platforms and systems.

Mapping each incoming and outgoing message for each RESTful operation defined in the BIAN Semantic APIs will allow to decouple the protocol from the message enabling any type of communication pattern.

Moreover by using an agreed CloudEvent structure as the payload, the conversion between different transports will become much easier.

![cloudevents payload](./images/cloudevents-payload.png)

### Mapping a RESTful operation to a CloudEvent

Given a RESTful operation we can uniquely map it to a CloudEvent and vice-versa.

The HTTP method together with the request path identifies the service domain, the control record, the behavior qualifiers and the service operation:

Taking the previous operation as example the following mapping can be defined:

```bash
POST /customer-credit-rating/sd-ref-001/customer-credit-rating-state/initiation
```

- Service Domain: Customer Credit Rating
- Control Record: State
- Service Operation: Initiate

This could be converted into a CloudEvent like this:

```json
{
  "specversion": "1.0",
  "id": "c6ca6b2f-78be-48ed-a68b-fdaecd20082a",
  "source": "com.example/my-example-service",
  "type": "org.bian.customercreditrating.state.initiate",
  "subject": "cr-ref-001",
  "biansdrefid": "sd-ref-001"
}
```

After the CreditRatingState has been initiated an Event will be broadcasted so that the involved parties can react upon.
The `subject` can be used to correlate `Commands` and `Events` or to perform `polling` to the target ServiceDomain in order
to get the current state of the operation. The result event can be as follows:

```json
{
  "specversion": "1.0",
  "id": "c6ca6b2f-78be-48ed-a68b-fdaecd20082a",
  "source": "http://customercreditrating-svc.acme.com/",
  "type": "org.bian.customercreditrating.state.initiated",
  "subject": "cr-ref-001",
  "biansdrefid": "sd-ref-001",
  "biancrrefid": "cr-ref-001",
  "data": {
    "customerCreditRatingStateInstanceReference": "some text",
    "customerCreditRatingStateInitiateActionReference": "some text",
    "customerCreditRatingStateInitiateActionRecord": {},
    "customerCreditRatingStateInstanceStatus": "some text",
    "customerCreditRatingStateInstanceRecord": {
      "customerCreditRatingSchedule": "some text",
      "customerCreditRatingAssessmentRecord": {
        "assessmentCustomerBehaviorModelReference": "some text",
        "creditRatingAssessmentType": "some text",
        "creditRatingAssessmentDate": "some text",
        "creditRatingAssessmentWorkProducts": "some text",
        "creditRatingAssessmentResult": "some text"
      },
      "customerCreditRatingRecord": {
        "customerCreditRatingState": "some text",
        "customerCreditRatingAssessment": "some text",
        "customerCreditRatingNarrative": "some text",
        "customerCreditRatingDate": "some text"
      }
    }
  }
}
```

With this approach it will be possible to abstract serialization and transport from the Service Domain type definitions
and focus on the metadata and the payload. The cloudevents specification already addresses the most important
transport protocols (AMQP, HTTP, Kafka, MQTT, NATS, WebSockets) including multiple serializations and encodings
(AVRO, Protobuf, JSON).

## RESTful API to CloudEvent Mapping

CloudEvents are better suited for asynchronous processing so only `Commands` and `Events` should be encoded using
this specification.

### The `type` parameter

The most important part of a CloudEvent is the `type` attribute that is usually used for filtering. Other attributes
might be used for filtering as well but might not be supported by all solutions.

The proposed `type` attribute format is:

`org.bian.<service-domain>.<control-record>.[<behavior-qualifier>].[<sub-behavior-qualifier>].<service-operation>`

Examples:

```yaml
# RESTful Request
PUT /customer-credit-rating/{sdReferenceId}/customer-credit-rating-state/{crReferenceId}/alerts/{bqReferenceId}/capture
# CloudEvent request
org.bian.customer-credit-rating.state.alerts.capture
```

### The `subject` parameter

This parameter is intended to be used as a correlation-id so that `Events` can be correlated to `Commands` and also
be polled by the service that triggered the command.

### Context attributes

CloudEvents support the use of custom context attributes similar to custom HTTP headers
that are context specific, in this case, for BIAN the following attributes are proposed:

- `biansdrefid`: Servicing Session Reference
- `biancrrefid`: Control Record Instance Reference
- `bianbqrefid`: Behavior Qualifier Instance Reference
