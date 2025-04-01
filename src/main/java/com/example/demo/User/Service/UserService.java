package com.example.demo.User.Service;

import com.example.demo.User.Model.UserModel;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
=======
import org.springframework.security.core.Authentication;

>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
public interface UserService {

    UserModel save(UserModel userModel);
    List<UserModel> findAll();
    Optional<UserModel> findById(Long id);
<<<<<<< HEAD
    UserModel update(UserModel userModel);
    void deleteById(Long id);
    void login(String email, String password);
}
=======
    Optional<UserModel> findByEmail(String email);
    UserModel update(UserModel userModel);
    void deleteById(Long id);
    String login(Authentication authentication);
}
>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
