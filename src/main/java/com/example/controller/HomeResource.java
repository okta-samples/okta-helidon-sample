package com.example.controller;

import io.helidon.security.SecurityContext;
import io.helidon.security.annotations.Authenticated;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;

@Path("/")
public class HomeResource {

    /**
     * Hello world using security context.
     * @param securityContext context as established during login
     * @return a string with current username
     */
    @Authenticated
    @GET
    public String home(@Context SecurityContext securityContext) {
        return "Hello: " + securityContext.userName();
    }

}
