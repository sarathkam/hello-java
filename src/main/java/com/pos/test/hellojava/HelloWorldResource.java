package com.pos.test.hellojava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldResource {

    @Value("${message: POS}")
    private String message;

    @GetMapping(path = "/hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity sayHelloToPOS() {
        String returnMsg = "Hello "+message+"! This is Java client";
        return new ResponseEntity(returnMsg, HttpStatus.OK);
    }

    @GetMapping(path = "/admin/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthStatus() {
        return new ResponseEntity("UP", HttpStatus.OK);
    }

    @GetMapping(path = "/admin/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getInfo() {
        return new ResponseEntity("Hello World client built in Java", HttpStatus.OK);
    }
}
