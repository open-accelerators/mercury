# Examples

The provided set of examples describe the following participants:

* Customer Offer: Management of any type of product offers for customers.
* Party Routing Profile: Data directory containing the Profile information for different parties
* Customer Credit Rating: Provides information about Credit Score Ratings

## Initiate Customer Offer

1. _Customer Offer_ receives a request to initiate a `CustomerOffer` for a given customer.
2. The `CustomerOfferInitiated` event is emitted
3. _Customer Offer_ retrieves the Score Rating from the _Customer Credit Rating_ Service Domain.
   1. If the retrieved score is over 700 the `CustomerOfferProcedure` will transition to `processing`
   2. If is lower, it will transition to `incomplete`
4. An event is emitted regarding the new state transition
5. The _Party Routing Profile_ receives the events and updates its internal state.
6. The _Party Routing Provile_ shows only active procedures.
7. The _Party Routing Profile_ can be queried to retrieve the current profile

## Retrieve Customer Credit Rating

The customer credit rating service domain always returns the same value for a given set of customerReferences.

|customerReference|score|
|-----|----|
|bob|600|
|anna|802|
|jane|760|
|frank|500|

## How to use the examples

1. Create a Minikube cluster with the Mercury Operator and all the dependencies. Look at
   the [Mercury Operator installation instructions](../../mercury-operator/README.md)
2. Create a Service Domain Infra Resource

```shell
kubectl create -f deploy/service-domain-infra.yaml
```

3. Create the different Service Domains (Customer Offer, Party Routing Profile and Customer Credit Rating)

* Create Customer Offer Service Domain Resource

```shell
kubectl create -f deploy/customer-offer-service-domain.yaml
```

* Create Party Routing Profile Service Domain Resource

```shell
kubectl create -f deploy/party-routing-profile-service-domain.yaml
```

* Create Customer Credit Rating Service Domain Resource

```shell
kubectl create -f deploy/customer-credit-rating-service-domain.yaml
```

* Create the Reporting services

```shell
kubectl create -f deploy/customer-offer-reporting.yaml
kubectl create -f deploy/party-routing-profile-reporting.yaml
```

###  Customer Offer and Party Routing Profile

1. Initiate a Customer Offer

```shell
$ curl -vH "Content-Type: application/json" `minikube service -n mercury customer-offer-camelk-rest --url=true`/CustomerOffer/Initiate -d '          
{
  "CustomerOfferProcedure": {
    "CustomerReference": "anna"
  }
}'

# Response
{
  "CustomerOfferProcedure": {
    "CustomerOfferProcessingTask": "1", ## This is the Customer Offer Reference
    "CustomerOfferProcessingTaskResult": "processing"
  }
} 
```

2. Check if the Party Routing Profile exists for this Customer Offer Reference

    * For specific Customer Offer Reference status (CUSTOMER_OFFER_REFERENCE)

```shell
$ curl -H "Content-Type: application/json" `minikube service -n mercury party-routing-profile-camelk-rest --url=true`/PartyRoutingProfile/anna/Retrieve
{
  "Status": {
    "CustomerRelationshipStatus": "Processing"
  }
}
```

3. Retrieve a report of all the Customer Offer Procedure References

```shell
$ curl -H "Content-Type: application/json" `minikube service party-routing-profile-reporting --url=true`/party-routing-profile/
[
    {
        "referenceId": "anna",
        "status": "Processing"
    }
]
```

### Customer Credit Rating

The Customer Credit Rating example always provide the same result for any input.

```shell
$ curl -H "Content-Type: application/json" `minikube service example-customer-credit-rating-camelk-rest --url=true`/CustomerCreditRating/anna/Retrieve
{
  "CustomerCreditRatingState": {
    "CreditRatingAssessmentResult": "802"
  }
}
```