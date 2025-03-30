package com.example.demo.User.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.status(HttpStatus.OK).body("Teste OK!");
    }
}
