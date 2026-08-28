package com.sap.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Sameer froasdfakjsdf;laksjdfasdfasdfm SAP DevOps Training!";
    }

//    @GetMapping("/{id}")
//    public String lol(@PathVariable Long id ){
//        return id+ " is you";
//    }
}

//https://api.cf.us10-001.hana.ondemand.com
