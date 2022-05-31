package com.redhat.mercury.codegen.utils;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.redhat.mercury.codegen.model.GrpcService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiFileUtilsTest {
    
    @Test
    void testReadFile() throws IOException {
        GrpcService svc = ApiFileUtils.readApiFile(new File("src/test/resources"),
                "bq_production_performance_assessment_duty_service.proto", "my-sd");
        assertEquals("BQProductionPerformanceAssessmentDutyService", svc.getClassName());
        assertEquals("my-sd-bq-production-performance-assessment-duty", svc.getClientName());
        assertEquals("bQProductionPerformanceAssessmentDutyService", svc.getFieldName());
        assertEquals("com.redhat.mercury.brokeredproduct.v10.api.bqproductionperformanceassessmentdutyservice.BQProductionPerformanceAssessmentDutyService", 
                svc.getImportName());
    }
}
