package com.redhat.mercury.util.schemavalidator.external;

import io.apicurio.registry.rest.client.RegistryClient;
import io.apicurio.registry.rest.client.RegistryClientFactory;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

/**
 * A json schema validator that uses an external Apicurio registry that contains the schemas to validate against.
 * The actual validation is performed by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class ExternalJsonSchemaValidator {

    private RegistryClient client;

    /**
     * The constructor receives the Apicurio registry URL to work with.
     * The validator will use the regitry to fetch the appropriate schema to validate the json
     * @param apicurioRegistryUrl The Apicurio registry URL
     */
    public ExternalJsonSchemaValidator(String apicurioRegistryUrl) {
        client = RegistryClientFactory.create(apicurioRegistryUrl);
    }

    /**
     * When validating a schema the validator calls the Apicurio regitry to fetch the scheam.
     * @param groupId The groupId of the schema in Apicurio, can be null, when null the default groupId is used.
     * @param artifactId The artifactId of the of the schema in Apicurio
     * @param json The json to be validated against the schema
     */
    public void validateSchema(String groupId, String artifactId, String json) {
        if(groupId == null){
            groupId = "default";
        }

        //Get schema from Apicurio
        InputStream schemaData = client.getLatestArtifact(groupId, artifactId);

        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(schemaData));
        JSONObject jsonSubject = new JSONObject(new JSONTokener(json));

        Schema schema = SchemaLoader.load(jsonSchemaObject);
        schema.validate(jsonSubject);
    }
}
