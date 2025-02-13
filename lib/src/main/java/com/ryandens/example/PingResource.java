package com.ryandens.example;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/ping")
public class PingResource {

    private final ExampleConfig exampleConfig;

    @Inject
    public PingResource(final ExampleConfig exampleConfig) {
        this.exampleConfig = exampleConfig;
    }

    @GET
    public void ping() {
        System.out.println("Deployment Size: " + exampleConfig.deployments().size());
    }


}
