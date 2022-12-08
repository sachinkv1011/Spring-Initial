package com.example.studentapp_backend1.controller;

import com.example.studentapp_backend1.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my website";
    }

   @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addStudent(@RequestBody Students s){

        return "Student added successfully";
   }

}
