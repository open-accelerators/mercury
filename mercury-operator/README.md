# Mercury Operator (Beta)
##Prerequisites:

- Kafka operator installed (minimum strimzi version 0.26.0)

- Camel-K operator installed (version 1.7.0)

- A ConfigMap per service domain that exposes an http route
(with the name integration-<service-domain-name>-http e.g integration-customer-offer-http)
containing definitions of camel routes(e.g directs.yaml, grpc.yaml, openapi.json)

## Functionality:
This operator is the one responsible for the deployment of the Mercury clusters by creating the necessary objects.
* On Service Domain Cluster object creation the operator will create a Role, a RoleBinding and a Kafka broker in case they do not exist already.
* Upon the successful creation of the Kafka broker, its url will be displayed in the Service Domain Cluster status object.
* On Service Domain object creation the operator will create a ServiceAccount, a Deployment, a Service, a Kafka Topic and a Camel K Integration in case they do not exist already.
* On Service Domain object creation if the expose parameter list has an http value in it, it will create an http Route.
* On Kafka Topic successful creation, its name will be displayed in the Service Domain status.

![Mercury Operator System](images/mercury-operator.png)
