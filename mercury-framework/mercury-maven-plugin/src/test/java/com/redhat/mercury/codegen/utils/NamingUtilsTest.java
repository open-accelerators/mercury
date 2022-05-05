package com.redhat.mercury.codegen.utils;

import org.junit.jupiter.api.Test;

import static com.redhat.mercury.codegen.utils.NamingUtils.toCamelCase;
import static com.redhat.mercury.codegen.utils.NamingUtils.toChannelId;
import static com.redhat.mercury.codegen.utils.NamingUtils.toChannelName;
import static com.redhat.mercury.codegen.utils.NamingUtils.toGrpcClient;
import static com.redhat.mercury.codegen.utils.NamingUtils.toGrpcServiceName;
import static com.redhat.mercury.codegen.utils.NamingUtils.toPackageName;
import static com.redhat.mercury.codegen.utils.NamingUtils.toUpperCase;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamingUtilsTest {

    @Test
    void testToPackageName() {
        assertEquals(null, toPackageName(null));
        assertEquals("abc", toPackageName("abc"));
        assertEquals("abcdef", toPackageName("abc_def"));
        assertEquals("abcdef", toPackageName("abc__def"));
        assertEquals("abc", toPackageName("a_b_c"));
        assertEquals("", toPackageName("_"));
        assertEquals("", toPackageName(""));
        assertEquals("abcdef", toPackageName("abc__def_"));
        assertEquals("abcdef", toPackageName("__abc__def"));
        assertEquals("abcdef", toPackageName("__abc__def__"));
    }

    @Test
    void testToCamelCase() {
        assertEquals(null, toCamelCase(null));
        assertEquals("Abc", toCamelCase("abc"));
        assertEquals("AbcDef", toCamelCase("abc_def"));
        assertEquals("AbcDef", toCamelCase("abc__def"));
        assertEquals("ABC", toCamelCase("a_b_c"));
        assertEquals("", toCamelCase("_"));
        assertEquals("", toCamelCase(""));
        assertEquals("AbcDef", toCamelCase("abc__def_"));
        assertEquals("AbcDef", toCamelCase("__abc__def"));
        assertEquals("AbcDef", toCamelCase("__abc__def__"));
    }

    @Test
    void testToGrpcClientName() {
        assertEquals("service-domain-abc", toGrpcClient("service-domain", "abc"));
        assertEquals("service-domain-abc-def", toGrpcClient("service-domain", "abc_def_service"));
    }

    @Test
    void testToGrpcServiceName() {
        assertEquals("SOmeService", toGrpcServiceName("some_service"));
        assertEquals("BQAuditService", toGrpcServiceName("bq_audit_service"));
        assertEquals("CRCustomerOfferProcedureService", toGrpcServiceName("cr_customer_offer_procedure_service"));
    }
    
    @Test
    void testToChannelName() {
        assertEquals("CHANNEL_EXAMPLE", toChannelName("example_service"));
        assertEquals("CHANNEL_OTHER_EXAMPLE", toChannelName("other_example_service"));
    }
    
    @Test
    void testToChannelId() {
        assertEquals("domain1-example", toChannelId("domain-1", "example_service"));
        assertEquals("domain2-otherexample", toChannelId("domain-2", "other_example_service"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("SOME_SERVICE", toUpperCase("some_service"));
        assertEquals("BQ_AUDIT_SERVICE", toUpperCase("bq_audit_service"));
        assertEquals("CR_CUSTOMER_OFFER_PROCEDURE_SERVICE", toUpperCase("cr_customer_offer_procedure_service"));
    }
    
    @Test
    void testToFieldName() {
        assertEquals(null, NamingUtils.toFieldName(null));
        assertEquals("abc", NamingUtils.toFieldName("abc"));
        assertEquals("abcDef", NamingUtils.toFieldName("abc_def"));
        assertEquals("abcDef", NamingUtils.toFieldName("abc__def"));
        assertEquals("aBC", NamingUtils.toFieldName("a_b_c"));
        assertEquals("", NamingUtils.toFieldName("_"));
        assertEquals("", NamingUtils.toFieldName(""));
        assertEquals("abcDef", NamingUtils.toFieldName("abc__def_"));
        assertEquals("abcDef", NamingUtils.toFieldName("__abc__def"));
        assertEquals("abcDef", NamingUtils.toFieldName("__abc__def__"));
    }

}
