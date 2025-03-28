package com.example.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("login")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request

        return entity;
    }


}
