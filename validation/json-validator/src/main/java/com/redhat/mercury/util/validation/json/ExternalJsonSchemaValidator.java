package com.redhat.mercury.util.validation.json;

import java.io.InputStream;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.apicurio.registry.rest.client.RegistryClient;
import io.apicurio.registry.rest.client.RegistryClientFactory;

/**
 * A json schema validator that uses an external Apicurio registry that contains the schemas to validate against.
 * The actual validation is performed by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class ExternalJsonSchemaValidator extends JsonSchemaValidator {

    private final Schema schema;

    /**
     * The constructor receives the Apicurio registry URL to work with.
     * The validator will use the regitry to fetch the appropriate schema to validate the json
     *
     * @param apicurioRegistryUrl The Apicurio registry URL
     * @param groupId             The groupId of the schema in Apicurio, can be null.
     * @param artifactId          The artifactId of the of the schema in Apicurio
     */
    public ExternalJsonSchemaValidator(String apicurioRegistryUrl, String groupId, String artifactId) {
        if (apicurioRegistryUrl == null || apicurioRegistryUrl.trim().isEmpty()) {
            throw new IllegalArgumentException("apicurioRegistryUrl is a mandatory parameter");
        }

        if (artifactId == null || artifactId.trim().isEmpty()) {
            throw new IllegalArgumentException("artifactId is a mandatory parameter");
        }

        RegistryClient client = RegistryClientFactory.create(apicurioRegistryUrl);

        //Get schema from Apicurio
        InputStream schemaData = client.getLatestArtifact(groupId, artifactId);

        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(schemaData));

        this.schema = SchemaLoader.load(jsonSchemaObject);
    }

    /**
     * Get the the schema this validator is validating against
     *
     * @return The schema this validator is validating against
     */
    @Override
    protected final Schema getSchema() {
        return schema;
    }
}
