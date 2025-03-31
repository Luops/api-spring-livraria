package com.example.demo.User.Service;

import com.example.demo.User.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel save(UserModel userModel);
    List<UserModel> findAll();
    Optional<UserModel> findById(Long id);
    Optional<UserModel> findByEmail(String email);
    UserModel update(UserModel userModel);
    void deleteById(Long id);
}
