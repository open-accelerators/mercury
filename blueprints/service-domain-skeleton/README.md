# Creating the first Service Domain

This is a sample project, which can be used to create the stubs for a service domain.

## Setup steps 

1. Download the swagger api json for the Service Domain from https://portal.bian.org/bian/api-catalogue
2. Rename the downloaded api json to api-swagger.json and move it to the resources folder.
3. Execute the maven build using the plugin goal `camel-restdsl-swagger-plugin`. This should generate CamelRoutes.java and CamelRestController.java.
4. Let us delete the CamelRestController.java, since the CamelServlet configuration has already been taken care of.
5. Finally modify the rest configuration on CamelRoutes.java to enable swagger and set the rest binding mode.
```
restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.auto)
                .producerComponent("http4")
                .apiContextPath("/swagger") //swagger endpoint path
                .apiContextRouteId("swagger") //id of route providing the swagger endpoint
                .contextPath("/service")
                .host("localhost:8080")
                .apiProperty("api.title", "Example REST api")
                .apiProperty("api.version", "1.0");
```

Now, Build and run the application, the swagger ui can be found at http://localhost:8080/swagger-ui

## Troubleshooting

For large service domains, with several api methods, the generated camel route can cause StackOverFlow issues with limited JVM requirements.
Consider breaking out the generate route
```
rest()...get()...post()....get() 
```
in to manageable chunks like 
```
rest()...post()..get(); rest()..get();
```