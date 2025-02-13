package com.ryandens.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ExampleService {

    @Inject
    ExampleConfig exampleConfig;

    public ExampleConfig getExampleConfig() {
        return exampleConfig;
    }
}
