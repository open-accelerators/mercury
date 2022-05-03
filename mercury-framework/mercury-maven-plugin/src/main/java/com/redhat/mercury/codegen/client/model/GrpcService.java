package com.redhat.mercury.codegen.client.model;

import com.redhat.mercury.codegen.client.resources.StringFormatter;

public class GrpcService {

    private final String importName;
    private final String fieldName;
    private final String className;
    private final String clientName;
    private final String getterName;

    public GrpcService(String fullFilename, String sd, String version) {
        String[] fileName = fullFilename.split("_", 2);

        this.fieldName = fileName[0] + StringFormatter.capitalizeWords(fileName[1].replace("_", " "));
        this.className = fileName[0].toUpperCase() + StringFormatter.capitalizeWords(fileName[1].replace("_", " "));
        this.clientName = sd + "-" + fullFilename.replace("_", "-").replace("-service", "");
        this.getterName = "get" + StringFormatter.capitalizeWords(fieldName);
        this.importName = String.format("com.redhat.mercury.%s.%s.api.%s.%s",
                sd.toLowerCase().replace("-", ""), version, this.className.toLowerCase(), this.className);
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getClassName() {
        return className;
    }

    public String getClientName() {
        return clientName;
    }

    public String getGetterName() {
        return getterName;
    }

    public String getImportName() {
        return importName;
    }
}
