package com.fusky.example.provider.controller;

import com.husky.example.provider.model.DemoApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "test")
@RequestMapping("/")
@Slf4j
public class DemoController implements DemoApi {

    @GetMapping(path = "/hello")
    public String hello(String name) {
        return "hello: " + name + ", welcome to servicecomb world!";
    }
}

