# Mercury framework Primer

Each Service Domain implements a Fuctional Pattern. If we are able to define the
technical requirements for a given Functional Pattern we can therefore
apply the same logical architecture to any given Service Domain.

## Functional Patterns

* Direct: Define the policies, goals & objectives and strategies for an
organizational entity or unit.
* Manage: Oversee the working of a business unit, assign work, manage
against a plan and troubleshoot is sues.
* Administer: Handle and assign the day to day activities, capture time worked,
costs and income for an operational unit.
* Design: Create and maintain a design for a procedure, product/serv ice model
or other such entity.
* Develop: To build or enhance something, typically  an IT production s ystem.
Includes development, assessment and deployment.
* Process: Complete work tasks following a proc edure in support of general
office activities and product and service delivery functions.
* Operate: Operate equipment and/or a largely automated facility.
* Maintain: Provide a maintenance service and repair devices/equipment as necessary.
* Fulfill: Fulfill any scheduled and ad-hoc obligations under a service arrangement,
most typically for a financial product or facility.
* Transact: Execute a well bounded financial transaction/tas k, typically involving
largely automated/structured fulfillment processing.
* Advise: Provide specialist advice and/or support as an ongoing service or for a
specific task/event.
* Monitor: To monitor and define the state/rating of some entity.
* Track: Maintain a log of trans actions or activity, typically a financial
account/journal or a log of activity to support behavioral analysis.
* Catalog: Capture and maintain reference information about some type of entity.
* Enroll: Maintain a membership for some group or related collection of parties.
* AgreeTerms: Maintain the terms and conditions that apply to a commercial relationship.
* Assess: To test or assess an entity, possibly agains t some formal qualification
or certification requirement.
* Analyse: To analyse the performance or behavior of some on-going activity or entity.
* Allocate: Maintain an inventory or holding of some resource and make as
signments/allocations as requested.

### State changes

Each Functional Pattern might or might not have a set of associated states associated
to the Control Record and each of their Behavior(or Sub-Behavior)
Qualifiers. Other Service Domains might or might not be interested in such state changes.

|Functional Pattern|States|
|---|---|
|Process|Initiated,Completed,Suspended|
|...|...|

It is important to define what states are defined in each Functional Pattern.

### Software Utilities

Depending on the nature of each Functional Pattern there will be defined different
Software Utilities. This document aims to define
what Functional Patterns require which Software Utilities as detailed as possible.

When defining a Service Domain, these software utilities dependencies will
be used to decide what infrastucture elements are required and how to
provision them. That provision can be a `link` to an existing utility or a `provision`
of a new one.

These are the possible Software utilities defined:

* Message Queue/Event Processing: Used for State transition notification (Events)
and for asynchronous communication (Commands).
* State Machines/Workflow Management: Used when Business Process Management is
required in the implementation.
* Rules Engines: When Business Decisions are required.
* Data Management: Data should be persisted and managed internally by the
Service Domain.
* Analysis & Reporting: Transactions and usage should be monitored for reporting
and data processing.
* Command & Control: Management information systems around the deployed
infrastructures and services. Such systems can automate and help technology and
business experts dimension and adapt business charges depending on existing analytics
or forecasts.

The translation of these SW utilities into Middleware artifacts could be:

|SW Utility|Middleware examples|
|---|---|
|Message Queue/Event Driven|Message Brokers (Kafka, AMQP, JMS, KNative)|
|State Machines/WF Managemeng|Business Process Management (BPMN)/Case Management|
|Rules Engines|Business Decisions (DMN)|
|Data Management|DBMS|
|Analysis & Reporting|Tracing,Monitoring (e.g. Prometheus)|
|Command & Control|MIS (Automations, Scalability, Data analysis, ...)|

## Dominant Behaviors

Functional Patterns can also be grouped into a reduced set of Dominant Behaviors that
will simplify the software dependencies each Service Domain has.

//TBD: The 4/5 dominant behaviours and their SW dependencies

## Software Dependencies

As explained before, each Service Domain has a set of software dependencies defined
in the [Dominant Behaviors](#dominant-behaviors).

### Common Dependencies

Any given Service Domain requires:

* `messaging`: For State Change notification and asynchornous first order connections
* `analysis-reporting`: For data monitoring of the business activity
* `command-control`: //TBD

### Specific Dependencies

* `rules-management`: Decision based behavior (DMN)
* `workflow-management` and `state-machine`: Business Process Management (BPM)
* `data-management`: Each service owns their own data repository.

## Service Domain interoperability

We can assume 3 different type of interconnections between two different Service Domains:

* Query: When a given service domain requests information from a different domain. This is usually a
synchronous request.
* Command: When a SD commands another SD to take a specific action (e.g. update a record). This type
of request can be either synchronous or asynchronous, depending on the system requirements.
* Event: After a certain record has changed its internal state an event might be emitted. This event
will be received by a different SD and take a specific action.

Each Service Domain will be able to create a binding of each of these types to/from another SD.

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
