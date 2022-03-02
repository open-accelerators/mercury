# Mercury Operator (Beta)
## Prerequisites:

- Kafka operator installed (minimum Strimzi version 0.26.x or 0.27.x)
- Camel-K operator installed (version 1.8.x)

## Preparation

### Common

Create the following configuration resources that will be used by the operator (make sure
they are created in the same namespace as the operator):

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

The following resources must be created where the integrations are going to be built.

- A configMap containing a Maven settings, before doing so, export the user/token 
with permissions to READ packages because our integrations depend on custom Maven 
dependencies published on GitHub Packages.

```shell
export GITHUB_USER=my-user
export GITHUB_TOKEN=my-github-token-with-read-packages-permission
SETTINGS=$(sed -e "s/github_user/$GITHUB_USER/" -e "s/github_password/$GITHUB_TOKEN/" ../deploy/config/camel-k/mercury-mvn-settings.xml) && kubectl create cm mercury-mvn-settings --from-literal=settings.xml=$SETTINGS
```

- An Integration Platform pointing to this configMap.

### On Minikube

You will require the `registry` addon and then create the IntegrationPlatform
pointing to the local registry. Check the [Camel-K documentation](https://camel.apache.org/camel-k/1.8.x/installation/registry/registry.html)
to set up a different registry

First extract the registry address:

```shell
export REGISTRY_ADDRESS=$(kubectl -n kube-system get service registry -o jsonpath='{.spec.clusterIP}')
```
Then use the existing integration platform definition with your internal registry configuration:

```shell
faq -f yaml -o yaml --args $REGISTRY_ADDRESS '.spec.build.registry = {address: $ARGS.positional[0], insecure: true}' ../deploy/config/camel-k/integration-platform.yaml | kubectl create -f -
```

### On Openshift
Just create the integration platform:

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
* On Service Domain Infra object creation the operator will create a Role, a RoleBinding and a Kafka broker in case they do not exist already.
* Upon the successful creation of the Kafka broker, its url will be displayed in the Service Domain Infra status object.
* On Service Domain object creation the operator will create a ServiceAccount, a Deployment, a Service, a Kafka Topic and a Camel K Integration in case they do not exist already.
* On Service Domain object creation if the expose parameter list has an http value in it, it will create an http Route.
* On Kafka Topic successful creation, its name will be displayed in the Service Domain status.

![Mercury Operator System](images/mercury-operator.png)

The Operator is Watching 2 kinds of entities:

##### Service Domain Infra
The service domain infra custom resource represents a cluster of service domains with a Kafka broker deployment.
E.g.
```yaml
apiVersion: mercury.redhat.io/v1alpha1
kind: ServiceDomainInfra
metadata:
  name: service-domain-infra
  labels:
    service-domain-infra: service-domain-infra
```

A cluster of service domains consists of a single service domain infra cr.
To create a service domain infra run the following command
```shell
kubectl create -f service-domain-infra.yaml
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
  serviceDomainInfra: service-domain-infra
  type: CustomerOffer
  expose:
    - http
```
* businessImage - the image to create the service container from.
* serviceDomainInfra - the name of the service domain infra this service domain is a part of.
* type - the type of the service domain.
* expose - a list of ways this service domain is exposed, currently we support only http, it will create a http route 

To create a service domain run the following command
```shell
kubectl create -f customer-offer-service-domain.yaml
```
