package schemavalidator.internal;

import com.redhat.mercury.util.schemavalidator.api.JsonSchemaValidator;
import com.redhat.mercury.util.schemavalidator.internal.InternalJsonSchemaValidator;
import org.everit.json.schema.SchemaException;
import org.everit.json.schema.ValidationException;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InternalJsonSchemaValidatorTest {

    @Test
    public void testJsonSchemaValidator(){
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

        validator.validateJson("{\"itemId\":\"abcde\",\"quantity\":5}");
        validator.validateJson("{\"itemId\":\"abcde\",\"quantity\":5,\"price\":100}");
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidJson(){
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

        Assertions.assertThrows(ValidationException.class, () -> validator.validateJson("{\"itemId\":\"abcde\",\"quany\":5}"));
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidJsonSchema(){
        Assertions.assertThrows(JSONException.class, () -> new InternalJsonSchemaValidator("invalidSchema"));
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidSchemaURL(){
        Assertions.assertThrows(SchemaException.class, () -> new InternalJsonSchemaValidator("{\n" +
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
    public void testJsonSchemaValidatorWithInvalidTypeTag(){
        Assertions.assertThrows(SchemaException.class, () -> new InternalJsonSchemaValidator("{\n" +
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
