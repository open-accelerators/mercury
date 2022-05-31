package com.redhat.mercury.codegen.model;

import com.redhat.mercury.codegen.utils.NamingUtils;

public class GrpcService {

    private final String importName;
    private final String fieldName;
    private final String className;
    private final String clientName;

    public GrpcService(String svc, String pkg, String fileName, String sd) {
        this.fieldName = NamingUtils.toFieldName(svc);
        this.className = svc;
        this.clientName = NamingUtils.toGrpcClient(sd, fileName);
        this.importName = String.format("%s.%s", pkg, this.className);
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
