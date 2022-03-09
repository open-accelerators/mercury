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

An asynchronous request/response where the caller knows where the the request has to be
sent and the calle knows where the response is expected.

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

Can be used to retrieve the current state of any record.

### Command

A SD commands another SD to take a specific action (e.g. update a record). This type
of action is recommended to always be asynchronous with a synchronous acknowledgement
(e.g. HTTP 202 Accepted).

The result of the action will be received as an event notification or synchronously polled
as a Query.

Target transactional patterns:

* Real-time command operations. The target SD will process the request immediately.
* Best-time: The target SD will process the request as soon as possible.
* Delayed response: Similarly to the previous case but after the manual intervention has
taken place.
* Background Scheduled synchronization: The intend of synchronization can be considered
a Command that is consumed periodically.

### Event

After a certain record has changed its internal state an event might be emitted. This event
will be received by one or many other SD in order to take a specific action.

* Broadcast notifications on update: After a CR/BQ is updated it can happen that other SD
are interested in such change that's why an event will be broadcasted for example to a
message broker where any other SD can subscribe to.
