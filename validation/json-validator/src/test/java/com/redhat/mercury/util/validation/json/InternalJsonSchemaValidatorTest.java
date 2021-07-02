package com.redhat.mercury.util.validation.json;

import org.everit.json.schema.SchemaException;
import org.everit.json.schema.ValidationException;
import org.json.JSONException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class InternalJsonSchemaValidatorTest {

    @Test
    void testJsonSchemaValidator(){
        JsonSchemaValidator validator = new InternalJsonSchemaValidator("{\n" +
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
        validator.validate("{\"itemId\":\"abcde\",\"quantity\":5,\"price\":100}");
    }

    @Test
    void testJsonSchemaValidatorWithInvalidJson(){
        JsonSchemaValidator validator = new InternalJsonSchemaValidator("{\n" +
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

        assertThrows(ValidationException.class, () -> validator.validate("{\"itemId\":\"abcde\",\"quany\":5}"));
    }

    @Test
    void testJsonSchemaValidatorWithInvalidJsonSchema(){
        assertThrows(JSONException.class, () -> new InternalJsonSchemaValidator("invalidSchema"));
    }

    @Test
    void testJsonSchemaValidatorWithInvalidSchemaURL(){
        assertThrows(SchemaException.class, () -> new InternalJsonSchemaValidator("{\n" +
                "  \"$schema\": \"http://abcdefg.com\",\n" +
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
                "}"));
    }

    @Test
    void testJsonSchemaValidatorWithInvalidTypeTag(){
        assertThrows(SchemaException.class, () -> new InternalJsonSchemaValidator("{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
                "  \"type\": \"monkey\",\n" +
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
                "}"));
    }
}
