package com.learning._22springauth.controllers;

import com.learning._22springauth.dtos.CreateUserDto;
import com.learning._22springauth.entities.UserEntity;
import com.learning._22springauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody CreateUserDto body) throws Exception {
        try {
            return this.userService.save(body);
        }catch (Exception e) {
            throw new Exception("Error creating user", e);
        }
    }

    @GetMapping
    public String hello() throws Exception {
        return "Hello World";
    }
}
