package com.ryandens.example;

import io.smallrye.config.ConfigMapping;
import java.util.Map;

@ConfigMapping(prefix = "com.ryandens")
public interface ExampleConfig {

    Map<String, String> deployments();
}
