package com.birthdayevent.mukila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.mukila.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String username);

}
