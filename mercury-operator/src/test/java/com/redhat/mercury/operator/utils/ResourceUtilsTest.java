package com.redhat.mercury.operator.utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

class ResourceUtilsTest {

    @ParameterizedTest
    @MethodSource("entriesProvider")
    void testToLowerHyphen(Entry<String, String> entry) {
        assertThat(ResourceUtils.toLowerHyphen(entry.getKey())).isEqualTo(entry.getValue());
    }

    static Stream<Entry<String, String>> entriesProvider() {
        return Map.of("ThisIsATest", "this-is-a-test",
                        "This", "this",
                        "this", "this",
                        "aTest", "a-test",
                        "", "",
                        "a", "a",
                        "A", "a",
                        "this-is-a-test", "this-is-a-test")
                .entrySet().stream();
    }
}
