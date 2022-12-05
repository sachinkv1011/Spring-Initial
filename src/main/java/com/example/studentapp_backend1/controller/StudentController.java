package com.example.studentapp_backend1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my website";
    }

}
