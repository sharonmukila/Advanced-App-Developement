package com.birthdayevent.mukila.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.birthdayevent.mukila.dto.response.BasicResponse;
import com.birthdayevent.mukila.dto.response.UserResponse;
import com.birthdayevent.mukila.model.User;
import com.birthdayevent.mukila.repository.UserRepository;
import com.birthdayevent.mukila.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public BasicResponse<UserResponse> getAllUser(){
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponses = users.stream().map(user-> UserResponse.builder()
            .id(user.getId())
            .username(user.getUsername())
            .email(user.getEmail())
            .role(user.getRole())
            .build())
            .collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder()
            .message("User data fetched successfully!!!")
            .data(userResponses)
            .build(); 
    }

}