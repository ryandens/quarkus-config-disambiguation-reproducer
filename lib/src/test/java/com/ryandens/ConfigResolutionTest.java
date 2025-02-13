package com.ryandens;

import com.ryandens.example.ExampleService;
import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusComponentTest
final class ConfigResolutionTest {

    @Inject
    ExampleService exampleService;

    @Test
    void name() {
        assertTrue(exampleService.getExampleConfig().deployments().isEmpty());
    }
}
