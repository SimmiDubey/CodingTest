package com.example.TestProjectDemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    public String hello(){
        return "hello";
    }
}
