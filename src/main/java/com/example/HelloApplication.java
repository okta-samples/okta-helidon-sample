package com.example;

import com.example.controller.HelloResource;
import com.example.controller.HomeResource;
import org.eclipse.microprofile.auth.LoginConfig;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Application;

import java.util.Set;

@LoginConfig(authMethod = "MP-JWT")
@ApplicationScoped
public class HelloApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(HelloResource.class, HomeResource.class);
    }
}
