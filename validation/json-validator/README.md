# Json Schema Validator

This folder contains json schema validators.

Currently, we are supporting 2 types of schema validators:

* ExternalJsonSchemaValidator - A json schema validator that uses an external Apicurio registry that contains the schemas to validate against.
* InternalJsonSchemaValidator - A json schema validator that validate the json against the given schema.

An example of using the InternalJsonSchemaValidator:
```
InternalJsonSchemaValidator validator = new InternalJsonSchemaValidator("{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
                "  \"type\": \"object\",\n" +
                "  \"properties\": {\n" +
                "    \"itemId\": {\n" +
                "      \"type\": \"string\"\n" +
                "    },\n" +
                "    \"quantity\": {\n" +
                "      \"type\": \"integer\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"required\": [\n" +
                "    \"itemId\",\n" +
                "    \"quantity\"\n" +
                "  ]\n" +
                "}");

validator.validate("{\"itemId\":\"abcde\",\"quantity\":5}");
```

An example of using the ExternalJsonSchemaValidator:
```
ExternalJsonSchemaValidator validator = new ExternalJsonSchemaValidator(registryUrl, null, artifactId);

validator.validate("{\"itemId\":\"abcde\",\"quantity\":5}");
```