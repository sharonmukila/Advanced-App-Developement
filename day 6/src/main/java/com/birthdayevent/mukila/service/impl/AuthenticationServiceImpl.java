package com.birthdayevent.mukila.service.impl;

import static com.birthdayevent.mukila.enumerated.Role.USER;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.birthdayevent.mukila.dto.request.LoginRequest;
import com.birthdayevent.mukila.dto.request.RegisterRequest;
import com.birthdayevent.mukila.dto.response.LoginResponse;
import com.birthdayevent.mukila.dto.response.RegisterResponse;
import com.birthdayevent.mukila.model.User;
import com.birthdayevent.mukila.repository.UserRepository;
import com.birthdayevent.mukila.service.AuthenticationService;
import com.birthdayevent.mukila.utils.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")

public class AuthenticationServiceImpl implements AuthenticationService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public RegisterResponse register(RegisterRequest request){
        Optional<User> isUserExists = userRepository.findByEmail(request.getEmail());
        if(isUserExists.isPresent()){
            return RegisterResponse.builder().message("User with mail id "+ request.getEmail() + " is already exists!").build();
        }
        var user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(USER)
                .build();
        userRepository.save(user);
        return RegisterResponse.builder()
                .message("User created successfully!")
                .build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager
            .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        String token = jwtUtil.generateToken(user);
        // System.out.println("-----------Generated Token: " + token);
        return LoginResponse.builder()
        .message("User logged in successfully!")
        .token(token)
        .build();
    }
}