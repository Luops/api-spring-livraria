package com.example.demo.User.Repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

=======
import com.example.demo.User.Model.UserModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByEmail(String email);
>>>>>>> 10ad52138637d1f353b7115ea21d6d2142015f10
}
