package com.redhat.mercury.util.schemavalidator.internal;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * A json schema validator.
 * The actual validation is performed internally by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class InternalJsonSchemaValidator {

    /**
     * Validate the given json against the provided schema.
     * @param jsonSchema The schema to validate against
     * @param json The json to validate
     */
    public void validateSchema(String jsonSchema, String json) {
        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(jsonSchema));
        JSONObject jsonSubject = new JSONObject(new JSONTokener(json));

        Schema schema = SchemaLoader.load(jsonSchemaObject);
        schema.validate(jsonSubject);
    }
}
