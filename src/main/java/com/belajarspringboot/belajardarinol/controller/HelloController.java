package com.belajarspringboot.belajardarinol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public  String hello(@PathVariable("name") String name ){
        return  "Hello World " + name ;
    }
}
