package com.redhat.mercury.util.schemavalidator;

import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class AbstructJsonSchemaValidator {

    protected Schema schema;

    /**
     * Validate the given json.
     * @param json The json to be validated against the schema
     */
    public void validateJson(String json) {
        JSONObject jsonSubject = new JSONObject(new JSONTokener(json));

        schema.validate(jsonSubject);
    }
}
