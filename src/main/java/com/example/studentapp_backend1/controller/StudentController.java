package com.example.studentapp_backend1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String ContactPage(){
        return "welcome to my contact page";
    }

    @GetMapping("/gallery")
    public String Gallery(){
        return "Welcome to my Gallery";
    }

}
