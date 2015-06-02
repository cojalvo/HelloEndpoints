package com.cadan.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import javax.inject.Named;

/**
 * Created by cadan on 6/1/15.
 */
@Api(name = "hello", version = "v1")
public class HelloEndpoints {

    @ApiMethod(name = "sayHello",path = "sayHello",httpMethod = ApiMethod.HttpMethod.GET)
    public HelloResponse sayHello(@Named("name") String name)
    {
        HelloResponse response = new HelloResponse();
        response.setResponse("Hello "+name);

        return response;
    }
}
