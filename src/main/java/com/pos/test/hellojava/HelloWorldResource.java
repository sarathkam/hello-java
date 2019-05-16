package com.pos.test.hellojava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HelloWorldResource {

    @Value("${message: POS}")
    private String message;

    @GetMapping(path = "/hello-world")
    public ResponseEntity sayHelloToPOS() {
        String returnMsg = "Hello "+message+"! This is Java client";
        return new ResponseEntity(returnMsg, HttpStatus.OK);
    }


}
