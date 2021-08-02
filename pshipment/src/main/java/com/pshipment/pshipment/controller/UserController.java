package com.pshipment.pshipment.controller;

import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.User;
import com.pshipment.pshipment.service.Imp.UserImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserImp userServiceImp;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userServiceImp.add(user);

    }

}