package com.birthdayevent.mukila.service;

import com.birthdayevent.mukila.dto.request.LoginRequest;
import com.birthdayevent.mukila.dto.request.RegisterRequest;
import com.birthdayevent.mukila.dto.response.LoginResponse;
import com.birthdayevent.mukila.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
