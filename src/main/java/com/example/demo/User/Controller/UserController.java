package com.example.demo.User.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    
    @GetMapping
    public String getText() {
        return new String("Ok!!!");
    }

    @PostMapping("login")
    public String postMethodName() {
        //TODO: process POST request
        
        return "Login is working!"; 
    }
    
}
