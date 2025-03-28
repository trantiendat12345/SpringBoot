package com.example.web.dto;

public class LoginResponse {

    private final String token;
    private final UserDTO user;

    public LoginResponse(String token, UserDTO user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public UserDTO getUser() {
        return user;
    }

}

/*
 * lop LoginResponse nay duoc dung de chua thong tin cua response dang nhap, bao gom token va thong tin cua user
 */
