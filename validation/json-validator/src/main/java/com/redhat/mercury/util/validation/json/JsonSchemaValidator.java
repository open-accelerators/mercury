package com.redhat.mercury.util.validation.json;

import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class JsonSchemaValidator {

    protected abstract Schema getSchema();

    /**
     * Validate the given json.
     *
     * @param json The json to be validated
     */
    public void validate(String json) {
        JSONObject jsonSubject = new JSONObject(new JSONTokener(json));
        getSchema().validate(jsonSubject);
    }

}
