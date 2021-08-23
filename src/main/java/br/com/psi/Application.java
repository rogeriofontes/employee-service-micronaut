package br.com.psi;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "employee-service",
                version = "1.0",
                description = "Employee API",
                contact = @Contact(url = "https://rogeriofontes.inf.br", name = "Rogerio Fontes")))
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
//https://dimitr.im/building-microservices-micronaut