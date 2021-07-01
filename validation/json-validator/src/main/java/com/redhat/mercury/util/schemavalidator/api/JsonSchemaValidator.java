package com.redhat.mercury.util.schemavalidator.api;

/**
 * This interface represents a json schema validator
 */
public interface JsonSchemaValidator {

    /**
     * Validate the given json.
     * @param json The json to be validated
     */
    void validateJson(String json);
}
