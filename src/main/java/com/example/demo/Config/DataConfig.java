package com.example.demo.Config;

import com.example.demo.User.Model.UserModel;
import com.example.demo.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        UserModel user = new UserModel(null, "teste", "teste@mail.com", "12345678", "Road one, Times Square, NYC");

//        userRepository.save(user);
    }
}
