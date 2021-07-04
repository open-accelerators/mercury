package com.redhat.mercury.util.validation.json;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * A json schema validator.
 * The actual validation is performed internally by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class InternalJsonSchemaValidator extends JsonSchemaValidator {

    private final Schema schema;

    /**
     * The constructor receives schema to validate against
     * @param jsonSchema The schema to validate against
     */
    public InternalJsonSchemaValidator(String jsonSchema) {
        if(jsonSchema == null || jsonSchema.trim().isEmpty()){
            throw new IllegalArgumentException("jsonSchema is a mandatory parameter");
        }
        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(jsonSchema));
        this.schema = SchemaLoader.load(jsonSchemaObject);
    }

    /**
     * Get the the schema this validator is validating against
     * @return The schema this validator is validating against
     */
    @Override
    protected final Schema getSchema() {
        return schema;
    }
}
