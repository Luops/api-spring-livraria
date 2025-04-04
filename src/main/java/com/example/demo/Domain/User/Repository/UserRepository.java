package com.example.demo.Domain.User.Repository;

import com.example.demo.Domain.User.Model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserDetails findByEmail(String email);
}
