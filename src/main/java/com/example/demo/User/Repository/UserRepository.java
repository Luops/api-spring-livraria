package com.example.demo.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
