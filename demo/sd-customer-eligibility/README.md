
## Customer Eligibility

To provide for persistence for the service domain, we need to set a MySQL instance. The Update Customer Eligibility call persists the product usage information for the customer in a DB.

To setup Mysql

```
oc new-app -e MYSQL_USER=mysqluser -e MYSQL_PASSWORD=mysqlpassword -e MYSQL_DATABASE=mysqldb -eMYSQL_ALLOW_EMPTY_PASSWORD=true mysql:5.6 
```

The Mysql pod needs to have a proper timezone set, for this open up the terminal of Mysql and invoke the command as below. (Alternatively, we could do a oc rsh <mysql_pod>)

```
mysql -u root -h mysql mysqldb
SET GLOBAL time_zone = '+1:00'
```
Now lets deploy the service domain microservice.

```
oc new-app java:8~https://github.com/rh-mercury/mercury-sd-camel --context-dir sd-customer-eligibility --name=sd-customer-eligibility 
--build-env=NEXUSREPO="<nexus-repo-url>" --build-env=AB_JOLOKIA_OFF=true
-eoc.project.path=<path to service>

```
(Loads Shared data types from the nexus repo. Check https://github.com/rh-mercury/mercury-sd-camel/tree/master/bianservicedomainmodels)


```
oc expose svc/sd-customer-eligibility
```

Swagger can be found at: ```{URL}/swagger-ui```

For setting up Fuse console, create a Service which will expose the management port for the service domain.
In this case the management port is 10001.

Once the service is setup, create a route for the service. The fuse console can be accessed at 
<new_management_route>/hawtio

Sample Request for Evaluate Eligibility
```
POST<customer-product-eligibility-url>/customer-product-service-eligibility/CEAEA1234/customer-eligibility-assessment/evaluation
{
      "data": {
        "customerEligibilityAssessmentEvaluateActionRecord": {},
        "customerEligibilityAssessmentInstanceRecord": {
         "customerReference":"CUST5678",
         "productServiceType":"e-Wallet"
        }
      }
    }
```

Sample Request for Update Customer Eligibility(Product usage)

```
PUT http://localhost:8081/customer-product-service-eligibility/SD22323/customer-eligibility-assessment/CR23242/update
{
  "data": {
    "customerEligibilityAssessmentInstanceRecord": {
      
      "customerReference": "CUST789",
      "productServiceType": "e-wallet"
    },
    "customerEligibilityAssessmentInstanceReference": "string",
    "customerEligibilityAssessmentUpdateActionTaskRecord": {},
    "customerProductServiceEligibilityServicingSessionReference": "string",
    "date": "string",
    "updateActionRequest": "string"
  }
}
```

