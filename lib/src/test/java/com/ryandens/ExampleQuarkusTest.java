package com.ryandens;

import com.ryandens.example.ExampleService;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
final class ExampleQuarkusTest {


    @Inject
    ExampleService exampleService;


    @Test
    void name() {
        assertTrue(exampleService.getExampleConfig().deployments().isEmpty());
    }
}
