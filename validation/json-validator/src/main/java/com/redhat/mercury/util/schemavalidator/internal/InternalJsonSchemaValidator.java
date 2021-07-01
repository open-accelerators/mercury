package com.redhat.mercury.util.schemavalidator.internal;

import com.redhat.mercury.util.schemavalidator.AbstructJsonSchemaValidator;
import com.redhat.mercury.util.schemavalidator.api.SchemaValidator;
import org.apache.commons.lang3.StringUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * A json schema validator.
 * The actual validation is performed internally by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class InternalJsonSchemaValidator extends AbstructJsonSchemaValidator implements SchemaValidator {

    /**
     * The constructor receives schema to validate against
     * @param jsonSchema The schema to validate against
     */
    public InternalJsonSchemaValidator(String jsonSchema) {
        if(StringUtils.isBlank(jsonSchema)){
            throw new IllegalArgumentException("jsonSchema is a mandatory parameter");
        }

        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(jsonSchema));
        this.schema = SchemaLoader.load(jsonSchemaObject);
    }
}
