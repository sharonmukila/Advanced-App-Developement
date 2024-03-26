package com.birthdayevent.mukila.config;

import static com.birthdayevent.mukila.enumerated.Role.ADMIN;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.birthdayevent.mukila.model.User;
import com.birthdayevent.mukila.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@SuppressWarnings("null")
public class UserCLI implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() > 0)
            return;
        var user = User.builder()
                .name("mukila")
                .email("mukila@gmail.com")
                .password(passwordEncoder.encode("mukila123"))
                .role(ADMIN)
                .build();
        userRepository.save(user);

    }

}
