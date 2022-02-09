# Mercury Operator (Beta)
## Prerequisites:

- Kafka operator installed (minimum Strimzi version 0.26.x or 0.27.x)
- Camel-K operator installed (version 1.8.x)

## Preparation

Create the following configuration resources that will be used by the operator:

- A ConfigMap per service domain that exposes a http route
  (with the name integration-<service-domain-name>-http e.g. integration-customer-offer-http)
  containing definitions of camel routes(e.g. directs.yaml)

```shell
kubectl apply -f ../deploy/config/integrations
```

- A ConfigMap per service domain that defines the OpenApi used to map REST requests to the
  _directs_ routes

```shell
kubectl apply -f ../deploy/config/openapi
```

- A configMap containing a Maven settings, before doing so, replace the user/token 
with permissions to READ packages because our integrations depend on custom Maven 
dependencies published on GitHub Packages.

```shell
kubectl create cm mercury-mvn-settings --from-file ../deploy/config/camel-k/mercury-mvn-settings.xml
```

- An Integration Platform pointing to this configMap

```shell
kubectl apply -f ../deploy/config/camel-k/integration-platform.yaml
```

## Simple Installation

The operator will be created in the mercury namespace so make sure the `mercury` namespace exists.

To install the operator run:

```shell
kubectl apply -n mercury -f ../deploy/
```

## Installation with OLM

We have created a Catalog containing the Mercury Operator. You can install this catalog on the 
Operator Lifecycle Manager and then just create a Subscription via the user interface.

```shell
kubectl apply -n olm -f ../deploy/olm-catalog/1.0.1/catalog-source.yaml
```

## Functionality:
This operator is the one responsible for the deployment of the Mercury clusters by creating the necessary objects.
* On Service Domain Cluster object creation the operator will create a Role, a RoleBinding and a Kafka broker in case they do not exist already.
* Upon the successful creation of the Kafka broker, its url will be displayed in the Service Domain Cluster status object.
* On Service Domain object creation the operator will create a ServiceAccount, a Deployment, a Service, a Kafka Topic and a Camel K Integration in case they do not exist already.
* On Service Domain object creation if the expose parameter list has an http value in it, it will create an http Route.
* On Kafka Topic successful creation, its name will be displayed in the Service Domain status.

![Mercury Operator System](images/mercury-operator.png)

The Operator is Watching 2 kinds of entities:

##### Service Domain Cluster
The service domain cluster custom resource represents a cluster of service domains with a Kafka broker deployment.
E.g.
```yaml
apiVersion: mercury.redhat.io/v1alpha1
kind: ServiceDomainCluster
metadata:
  name: service-domain-cluster
  labels:
    service-domain-cluster: service-domain-cluster
```

A cluster of service domains consists of a single service domain cluster cr.
To create a service domain cluster run the following command
```shell
kubectl create -f service-domain-cluster.yaml
```

##### Service Domain
The service domain custom resource represents a service, a gRPC service will be created by default for inter service domain communication. 
If external access is required then use the expose parameter.
```yaml
apiVersion: mercury.redhat.io/v1alpha1
kind: ServiceDomain
metadata:
  name: customer-offer
  labels:
    service-domain: customer-offer
spec:
  businessImage: quay.io/ecosystem-appeng/customer-offer-example:1.0.1
  serviceDomainCluster: service-domain-cluster
  type: CustomerOffer
  expose:
    - http
```
* businessImage - the image to create the service container from.
* serviceDomainCluster - the name of the cluster this service domain is a part of.
* type - the type of the service domain.
* expose - a list of ways this service domain is exposed, currently we support only http, it will create a http route 

To create a service domain run the following command
```shell
kubectl create -f customer-offer-service-domain.yaml
```
