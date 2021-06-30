package schemavalidator.internal;

import com.redhat.mercury.util.schemavalidator.internal.InternalJsonSchemaValidator;
import org.junit.jupiter.api.Test;

public class InternalJsonSchemaValidatorTest {

    @Test
    public void testJsonSchemaValidator(){
        InternalJsonSchemaValidator validator = new InternalJsonSchemaValidator();

        validator.validateSchema("{\n" +
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
                "}","{\"itemId\":\"abcde\",\"quantity\":5}");
    }

}
