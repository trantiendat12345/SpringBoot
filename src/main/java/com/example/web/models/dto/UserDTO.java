package com.example.web.models.dto;

public class UserDTO {

    private final Long id;
    private final String email;

    public UserDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

}
