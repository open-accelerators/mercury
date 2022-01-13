# Party Routing Profile Camel REST Integration

To create a Party Routing Profile Camel REST integration use the following `kamel` command:

```bash
kamel run -e MERCURY_BINDING_SERVICE_HOST=party-routing-profile -e MERCURY_BINDING_SERVICE_PORT=9000 --name party-routing-profile-camelk-rest party-routing-profile-direct.yaml ../common-integrations/grpc.yaml
```
