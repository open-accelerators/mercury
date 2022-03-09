# Examples

The provided set of examples describe the following participants:

* Customer Offer: Management of any type of product offers for customers.
* Party Routing Profile: Data directory containing the Profile information for different parties
* Customer Credit Rating: Provides information about Credit Ratings

## Initiate Customer Offer

1. The Customer Offer Service Domain receives a request to initiate a `CustomerOffer` for a given customer.
2. The `CustomerOfferInitiated` event is emitted
3. The _Party Routing Profile_ receives the `CustomerOfferInitiated` and updates its internal state.
4. The _Party Routing Profile_ can be queried to retrieve the current profile

## Complete Customer Offer

5. The existing Customer Offer is completed for the same customer
6. The `CustomerOfferCompleted` event is emitted
7. The _Party Routing Profile_ receives the event and updates its internal state
8. The _Party Routing Profile_ can be queried to retrieve the current profile

## Retrieve Customer Credit Rating

The customer credit rating service domain always returns the same value for any request.

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
  "initiateCustomerOfferProcedureRequest": {
    "CustomerOfferProcedure": {
      "CustomerReference": "my-customer-reference"
    }
  }
}'

# Response
{
  "CustomerOfferProcedure": {
    "CustomerOfferProcessingTask": "1", ## This is the Customer Offer Reference
    "CustomerOfferProcessingTaskResult": "INITIATED"
  }
} 
```

2. Check if the Party Routing Profile exists for this Customer Offer Reference

    * For specific Customer Offer Reference status (CUSTOMER_OFFER_REFERENCE)

```shell
$ curl -H "Content-Type: application/json" `minikube service -n mercury party-routing-profile-camelk-rest --url=true`/PartyRoutingProfile/1/Retrieve
{
  "Status": {
    "CustomerRelationshipStatus": "0"
  }
}
```

3. Retrieve a report of all the Customer Offer Procedure References

```shell
$ curl -H "Content-Type: application/json" `minikube service party-routing-profile-reporting --url=true`/party-routing-profile/reports/ids
[
   "1",
   "2",
   "3"
]
```

4. Complete the Customer Offer Procedure

```shell
$ curl -XPUT -vH "Content-Type: application/json" `minikube service customer-offer-camelk-rest --url=true`/CustomerOffer/1/Update -d '          
{
  "CustomerOfferProcedure": {
    "CustomerReference": "my-customer-reference"
  }
}'

# Response
{
  "CustomerOfferProcedure": {
    "CustomerOfferProcessingTask": "1",
    "CustomerOfferProcessingTaskResult": "COMPLETED"
  }
} 
```

5. Confirm the Party Routing Profile has been updated

```shell
$ curl -H "Content-Type: application/json" `minikube service party-routing-profile-camelk-rest --url=true`/PartyRoutingProfile/1/Retrieve
{
  "Status": {
    "CustomerRelationshipStatus": "1"
  }
}
```

### Customer Credit Rating

The Customer Credit Rating example always provide the same result for any input.

```shell
$ curl -H "Content-Type: application/json" `minikube service customer-credit-rating-camelk-rest --url=true`/CustomerCreditRating/${customercreditratingId}/Retrieve
{
  "CustomerCreditRatingState": {
    "CreditRatingAssessmentResult": "802"
  }
}
```