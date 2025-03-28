package com.example.web.dto;

public class UserDTO {

    private final Long id;
    private final String email;

    public UserDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}

/*
 * lop UserDto nay duoc dung de chua thong tin cua user, bao gom id va email
 */
