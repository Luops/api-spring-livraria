package com.example.demo.User.Service;

import com.example.demo.User.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel save(UserModel userModel);
    List<UserModel> findAll();
    Optional<UserModel> findById(Long id);
    UserModel update(UserModel userModel);
    void deleteById(Long id);
    void login(String email, String password);
}