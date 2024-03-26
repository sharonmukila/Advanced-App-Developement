package com.birthdayevent.mukila.service;

import com.birthdayevent.mukila.dto.response.BasicResponse;
import com.birthdayevent.mukila.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}
