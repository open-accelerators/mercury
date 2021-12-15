# Mercury Operator

## Prerequisites:
**- Kafka operator installed (minimum strimzi version 0.26.0)**

**- Camel-K operator installed (version 1.7.0)**

**- A ConfigMap per service domain that exposes an http route
(with the name integration-<service-domain-name>-http e.g integration-customer-offer-http)
containing definitions of camel routes(e.g directs.yaml, grpc.yaml, openapi.json)**

## Functionality:
This operator is the one responsible for the deployment of the Mercury clusters by creating the necessary objects.
* When a Service Domain Cluster object is created the operator will try to create a Role, RoleBinding a Kafka broker in case they do not exist already.
* When the Kafka broker is deployed successfully its url will be displayed in the Service Domain Cluster status.
* When a Service Domain object is created the operator will try to create a ServiceAccount, a Deployment, a Service, and Kafka Topic in case they do not exist already, in addition if the expose parameter list has an http value then it creates an http Route.
* When the Kafka Topic is created successfully its name will be displayed in the Service Domain status.
