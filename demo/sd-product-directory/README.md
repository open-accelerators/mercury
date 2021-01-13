
```
oc new-app java:8~https://github.com/rh-mercury/mercury-sd-camel --context-dir sd-product-directory --name=sd-product-directory 
--build-env=NEXUSREPO="<nexus-repo-url>" --build-env=AB_JOLOKIA_OFF=true
-eoc.project.path=<path to service>

```
(Loads Shared data types from the nexus repo. Check https://github.com/rh-mercury/mercury-sd-camel/tree/master/bianservicedomainmodels)



```
oc expose svc/sd-product-directory
```

Swagger can be found at: ```{URL}/swagger-ui```

For setting up Fuse console, create a Service which will expose the management port for the service domain.
In this case the management port is 10001.

Once the service is setup, create a route for the service. The fuse console can be accessed at 
<new_management_route>/hawtio

Sample Request for Create Product Deployment
```
GET<product-directory-url>/product-directory/SD22323/product-directory-entry/COSSR738028/salesandmarketing/MARKETING12345

```