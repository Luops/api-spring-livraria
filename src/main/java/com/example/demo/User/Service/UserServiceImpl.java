package com.example.demo.User.Service;

import com.example.demo.User.Model.UserModel;
import com.example.demo.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
=======
@Service
>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

<<<<<<< HEAD
=======
    @Autowired
    private JwtService jwtService;

>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
    @Override
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel update(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
<<<<<<< HEAD
    public void login(String email, String password) {
        //TODO
    }
}
=======
    public Optional<UserModel> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public String login(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}
>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
