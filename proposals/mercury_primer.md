# Mercury framework Primer

Each Service Domain implements a Fuctional Pattern. If we are able to define the
technical requirements for a given Functional Pattern we can therefore
apply the same logical architecture to any given Service Domain.

## Functional Patterns

- Direct: Define the policies, goals & objectives and strategies for an
  organizational entity or unit.
- Manage: Oversee the working of a business unit, assign work, manage
  against a plan and troubleshoot is sues.
- Administer: Handle and assign the day to day activities, capture time worked,
  costs and income for an operational unit.
- Design: Create and maintain a design for a procedure, product/serv ice model
  or other such entity.
- Develop: To build or enhance something, typically an IT production s ystem.
  Includes development, assessment and deployment.
- Process: Complete work tasks following a proc edure in support of general
  office activities and product and service delivery functions.
- Operate: Operate equipment and/or a largely automated facility.
- Maintain: Provide a maintenance service and repair devices/equipment as necessary.
- Fulfill: Fulfill any scheduled and ad-hoc obligations under a service arrangement,
  most typically for a financial product or facility.
- Transact: Execute a well bounded financial transaction/tas k, typically involving
  largely automated/structured fulfillment processing.
- Advise: Provide specialist advice and/or support as an ongoing service or for a
  specific task/event.
- Monitor: To monitor and define the state/rating of some entity.
- Track: Maintain a log of trans actions or activity, typically a financial
  account/journal or a log of activity to support behavioral analysis.
- Catalog: Capture and maintain reference information about some type of entity.
- Enroll: Maintain a membership for some group or related collection of parties.
- AgreeTerms: Maintain the terms and conditions that apply to a commercial relationship.
- Assess: To test or assess an entity, possibly agains t some formal qualification
  or certification requirement.
- Analyse: To analyse the performance or behavior of some on-going activity or entity.
- Allocate: Maintain an inventory or holding of some resource and make as
  signments/allocations as requested.

### State changes

Each Functional Pattern might or might not have a set of associated states associated
to the Control Record and each of their Behavior(or Sub-Behavior)
Qualifiers. Other Service Domains might or might not be interested in such state changes.

| Functional Pattern | States                        |
| ------------------ | ----------------------------- |
| Process            | Initiated,Completed,Suspended |
| ...                | ...                           |

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

- Message Queue/Event Processing: Used for State transition notification (Events)
  and for asynchronous communication (Commands).
- State Machines/Workflow Management: Used when Business Process Management is
  required in the implementation.
- Rules Engines: When Business Decisions are required.
- Data Management: Data should be persisted and managed internally by the
  Service Domain.
- Analysis & Reporting: Transactions and usage should be monitored for reporting
  and data processing.
- Command & Control: Management information systems around the deployed
  infrastructures and services. Such systems can automate and help technology and
  business experts dimension and adapt business charges depending on existing analytics
  or forecasts.

The translation of these SW utilities into Middleware artifacts could be:

| SW Utility                   | Middleware examples                                |
| ---------------------------- | -------------------------------------------------- |
| Message Queue/Event Driven   | Message Brokers (Kafka, AMQP, JMS, KNative)        |
| State Machines/WF Managemeng | Business Process Management (BPMN)/Case Management |
| Rules Engines                | Business Decisions (DMN)                           |
| Data Management              | DBMS                                               |
| Analysis & Reporting         | Tracing,Monitoring (e.g. Prometheus)               |
| Command & Control            | MIS (Automations, Scalability, Data analysis, ...) |

## Dominant Behaviors

Functional Patterns can also be grouped into a reduced set of Dominant Behaviors that
will simplify the software dependencies each Service Domain has.

- IP/Plan Creation: Project management and plan/performance tracking.
- Processing & Operations: Standard state driven processing logic, plus monitor and alert functions.
- Analysis: Embedded rules engine, data consolidation/maintenance and selectable tests/algorithms.
- Directory: Information catalogue reference and indexing structures.
- Allocation: Inventory tracking and state monitoring.

## Related topics

- [Interoperability](./interoperability.md)
- [Software Dependencies](./software_dependencies.md)
