package com.ypwk.wz.controller;


import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.User;
import com.ypwk.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
@RequestMapping("/user")
public class UserCtroller {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public JdonResult login(@RequestBody User user){
        return userService.login(user);

    }
}
