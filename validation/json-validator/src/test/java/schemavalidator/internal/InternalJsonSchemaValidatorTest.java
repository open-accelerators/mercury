package schemavalidator.internal;

import com.redhat.mercury.util.schemavalidator.internal.InternalJsonSchemaValidator;
import org.everit.json.schema.SchemaException;
import org.everit.json.schema.ValidationException;
import org.json.JSONException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InternalJsonSchemaValidatorTest {

    @Test
    public void testJsonSchemaValidator(){
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

        validator.validateJson("{\"itemId\":\"abcde\",\"quantity\":5}");
        validator.validateJson("{\"itemId\":\"abcde\",\"quantity\":5,\"price\":100}");
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidJson(){
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

        assertThrows(ValidationException.class, () -> validator.validateJson("{\"itemId\":\"abcde\",\"quany\":5}"));
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidJsonSchema(){
        assertThrows(JSONException.class, () -> new InternalJsonSchemaValidator("invalidSchema"));
    }

    @Test
    public void testJsonSchemaValidatorWithInvalidSchemaURL(){
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
    public void testJsonSchemaValidatorWithInvalidTypeTag(){
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
