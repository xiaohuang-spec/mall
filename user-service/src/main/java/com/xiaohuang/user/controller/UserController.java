package com.xiaohuang.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    private String getUser(){
        return "xiaohaung!";
    }
}
