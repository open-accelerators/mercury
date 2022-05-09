package com.redhat.mercury.codegen.model;

import com.redhat.mercury.codegen.utils.NamingUtils;

public class GrpcService {

    private final String importName;
    private final String fieldName;
    private final String className;
    private final String clientName;

    public GrpcService(String serviceName, String sd, String version) {
        this.fieldName = NamingUtils.toFieldName(serviceName);
        this.className = NamingUtils.toGrpcServiceName(serviceName);
        this.clientName = NamingUtils.toGrpcClient(sd, serviceName);
        this.importName = String.format("com.redhat.mercury.%s.%s.api.%s.%s",
                sd.toLowerCase().replace("-", ""), version, NamingUtils.toPackageName(serviceName), this.className);
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

    public String getImportName() {
        return importName;
    }
}
