package com.autobot.auth_users.repository;

import com.autobot.auth_users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByName(String email);

}