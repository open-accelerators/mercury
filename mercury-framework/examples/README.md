# Examples

The provided set of examples describe the following participants:

* Customer Offer: Management of any type of product offers for customers.
* Party Routing Profile: Data directory containing the Profile information for different parties
* Customer Credit Rating: Provides information about Credit Ratings

## Initiate Customer Offer

1. The Customer Offer Service Domain receives a request to initiate a `CustomerOffer` for a given
customer.
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

1. Create a Minikube cluster with the Mercury Operator and all the dependencies. 
Look at the [Mercury Operator installation instructions](../../mercury-operator/README.md)
2. Create a Service Domain Cluster

   `minikube start -p service-domain`

3. Create the different Service Domains (Customer Offer, Party Routing Profile and Customer
Credit Rating)

   `kubectl apply -f deploy/01_deployment.yaml`

4. Initiate a Customer Offer
   
    ``curl -v -H "Content-Type: application/json" `minikube service customer-offer-camelk-rest --url=true`/customer-offer/${SD_REFERENCE}/customer-offer-procedure/initiation -d '{"procedure": {"customerReference": "${CUSTOMER_REFERENCE}"}}``

5. Check the Party Routing Profile exists for this Customer Reference
    * For specific Customer Reference (CUSTOMER_REFERENCE)
   
      ``curl -v `minikube service party-routing-profile-camelk-rest --url=true`/party-routing-profile/${SD_REFERENCE}/party-state/${CUSTOMER_REFERENCE}/status/${BQ_REFERENCE}``
   
    * For all Customer References
   
      ``curl -v `minikube service party-routing-profile-camelk-rest --url=true`/party-routing-profile/&{SD_REFERENCE}/party-state``    

6. Complete the Customer Offer
7. Confirm the Party Routing Profile has been updated
