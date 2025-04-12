package com.example.web.services.impl;

import org.springframework.stereotype.Service;

import com.example.web.models.dto.UserDTO;
import com.example.web.models.dto.request.LoginRequest;
import com.example.web.models.dto.response.LoginResponse;
import com.example.web.services.base.BaseService;
import com.example.web.services.interfaces.UserServiceInterface;

@Service
public class UserService extends BaseService implements UserServiceInterface {

    @Override
    public LoginResponse login(LoginRequest request) {
        try {
            String token = "123445";
            UserDTO user = new UserDTO(1L, "email");

            return new LoginResponse(token, user);
        } catch (Exception e) {
            throw new RuntimeException("CO VAN DE XAY RA");
        }
    }

}
