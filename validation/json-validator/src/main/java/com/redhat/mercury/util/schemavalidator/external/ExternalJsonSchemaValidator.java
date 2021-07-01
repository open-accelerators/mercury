package com.redhat.mercury.util.schemavalidator.external;

import com.redhat.mercury.util.schemavalidator.AbstructJsonSchemaValidator;
import com.redhat.mercury.util.schemavalidator.api.SchemaValidator;
import io.apicurio.registry.rest.client.RegistryClient;
import io.apicurio.registry.rest.client.RegistryClientFactory;
import org.apache.commons.lang3.StringUtils;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

/**
 * A json schema validator that uses an external Apicurio registry that contains the schemas to validate against.
 * The actual validation is performed by everit json schema validator @see <a href="https://github.com/everit-org/json-schema">https://github.com/everit-org/json-schema</a>
 */
public class ExternalJsonSchemaValidator extends AbstructJsonSchemaValidator implements SchemaValidator {

    private RegistryClient client;

    /**
     * The constructor receives the Apicurio registry URL to work with.
     * The validator will use the regitry to fetch the appropriate schema to validate the json
     * @param apicurioRegistryUrl The Apicurio registry URL
     * @param groupId The groupId of the schema in Apicurio, can be null.
     * @param artifactId The artifactId of the of the schema in Apicurio
     */
    public ExternalJsonSchemaValidator(String apicurioRegistryUrl, String groupId, String artifactId) {
        if(StringUtils.isBlank(apicurioRegistryUrl)){
            throw new IllegalArgumentException("apicurioRegistryUrl is a mandatory parameter");
        }

        if(StringUtils.isBlank(artifactId)){
            throw new IllegalArgumentException("artifactId is a mandatory parameter");
        }

        client = RegistryClientFactory.create(apicurioRegistryUrl);

        //Get schema from Apicurio
        InputStream schemaData = client.getLatestArtifact(groupId, artifactId);

        JSONObject jsonSchemaObject = new JSONObject(new JSONTokener(schemaData));

        this.schema = SchemaLoader.load(jsonSchemaObject);
    }
}
