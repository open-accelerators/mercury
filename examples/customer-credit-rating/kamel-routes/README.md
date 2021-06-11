# Internal and External reporting camel-k routes

## Internal Reporting

The InternalReporting Camel Route will forward all requests to the microservice implemented in my-credit-rating-agency
running in the same namespace, you can use any other endpoint by updating the environment variable.

```shell script
kamel run -e INTERNAL_CRA_ENDPOINT=my-credit-rating-agency:8080 \
 kamel-routes/InternalReporting.java \
 --open-api CustomerCreditRating.json \
 --name internal-reporting-java
```

### Examples

#### Retrieve

```shell script
$ curl http://internal-reporting-java-ruben-ccr.bian-coreless-myorg-example.com/customer-credit-rating/ABC-123-X/customer-credit-rating-state/crRefId/internalreporting/bqRefId
{
  "tin": "ABC-123-X",
  "score": "81"
}
```

#### Capture

```shell script
$ curl -XPUT -H "Content-Type: application/json" -v http://internal-reporting-java-ruben-ccr.bian-coreless-myorg-example.com/customer-credit-rating/ABC-123-X/customer-credit-rating-state/crRefId/internalreporting/bqRefId/capture -d '{"tin": "ABC-123-X", "score": 99}'
HTTP/1.1 202 Accepted
```

## External Reporting

The ExternalReporting Camel Route will forward all requests to a Microcks-based Mock service that also uses the same
OpenApiV3 spec as the InternalReporting microservice.

```shell script
kamel run -e ACME_CRA_ENDPOINT=my-microcks-microcks.bian-coreless-myorg-example.com/rest/ACME+credit+rating+agency/1.0.0 \
 kamel-routes/ExternalReporting.java \
 --open-api CustomerCreditRating.json \
 --name external-reporting-java
```

```shell script
$ curl http://external-reporting-java-ruben-ccr.bian-coreless-myorg-example.com/customer-credit-rating/ABC-123-X/customer-credit-rating-state/crRefId/externalreporting/bqRefId
{
  "tin": "ABC-123-X",
  "score": "81"
}
```

#### Capture

```shell script
$ curl -XPUT -H "Content-Type: application/json" -v http://external-reporting-java-ruben-ccr.bian-coreless-myorg-example.com/customer-credit-rating/ABC-123-X/customer-credit-rating-state/crRefId/externalreporting/bqRefId/capture -d '{"tin": "ABC-123-X", "score": 99}'
HTTP/1.1 202 Accepted
```
