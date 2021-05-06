package com.brunocarvalho.resource;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

@Controller("/greetings")
public class GreetingsController implements GreetingsControllerRoutes {

    @Value("Hello World")
    private String greeting;

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }


    @Override
    public HttpResponse<String> greeting(String name) {
        return HttpResponse.ok(greeting + ","+ name +"!");
    }
}