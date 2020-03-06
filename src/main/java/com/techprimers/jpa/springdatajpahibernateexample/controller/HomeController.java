package com.techprimers.jpa.springdatajpahibernateexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/index")
    public String index(){
        // Aula
        return "Hello World";
    }

}
