package com.brunocarvalho.resource;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;

public interface GreetingsControllerRoutes {

    @Get("/{name}")
    public HttpResponse<String>greeting(String name);
}
