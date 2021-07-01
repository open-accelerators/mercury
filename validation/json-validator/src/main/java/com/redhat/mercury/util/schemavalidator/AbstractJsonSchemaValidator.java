package com.redhat.mercury.util.schemavalidator;

import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class AbstractJsonSchemaValidator {

    /**
     * Validate the given json.
     * @param json The json to be validated
     */
    public void validateJson(String json) {
        JSONObject jsonSubject = new JSONObject(new JSONTokener(json));

        getSchema().validate(jsonSubject);
    }

    /**
     * Get the the schema this validator is validating against
     * @return The schema this validator is validating against
     */
    public abstract Schema getSchema();
}
