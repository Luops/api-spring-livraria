package com.example.demo.User.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User.Model.UserModel;
import com.example.demo.User.Model.DTO.UserAuthDTO;
import com.example.demo.User.Model.DTO.UserRegisterDTO;
import com.example.demo.User.Repository.UserRepository;
import com.example.demo.User.Service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getText() {
        return new String("Ok!!!");
    }

    @PostMapping("login")
    public ResponseEntity postMethodName(@RequestBody @Valid UserAuthDTO data) {
        var emailPassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(emailPassword);

        return ResponseEntity.ok().build();
    }

    @PostMapping("register")
    public ResponseEntity postMethodName(@RequestBody @Valid UserRegisterDTO data) {
        if (this.userRepository.findByEmail(data.email()) != null)
            return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        UserModel newUser = new UserModel(data.name(), data.email(), encryptedPassword, data.address());

        this.userRepository.save(newUser);

        return ResponseEntity.ok().build();
    }

}
