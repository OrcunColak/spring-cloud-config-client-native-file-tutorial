package com.colak.springtutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")

@RefreshScope
public class HelloController {

    @Value("${eureka.client.serviceUrl.defaultZone: Default Hello}")
    private String message;

    // http://localhost:8080/rest/message
    @GetMapping("/message")
    public String message() {
        return message;
    }
}
