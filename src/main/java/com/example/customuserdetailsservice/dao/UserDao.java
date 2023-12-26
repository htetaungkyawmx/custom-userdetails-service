package com.example.customuserdetailsservice.dao;

import com.example.customuserdetailsservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
