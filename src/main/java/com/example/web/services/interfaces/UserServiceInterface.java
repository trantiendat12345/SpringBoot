package com.example.web.services.interfaces;

import com.example.web.models.dto.request.LoginRequest;
import com.example.web.models.dto.response.LoginResponse;

public interface UserServiceInterface {

    LoginResponse login(LoginRequest request);


}
