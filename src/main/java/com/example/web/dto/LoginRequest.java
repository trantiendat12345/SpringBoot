package com.example.web.dto;

public class LoginRequest {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

/*
 * lop LoginRequest nay duoc dung de chua thong tin cua request dang nhap, bao gom email va password
 */
