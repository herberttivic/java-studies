package com.learning._22springauth.controllers;

import com.learning._22springauth.dtos.CreateUserDto;
import com.learning._22springauth.entities.UserEntity;
import com.learning._22springauth.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody CreateUserDto body) throws Exception {
        try {
            return this.userService.save(body);
        }catch (Exception e) {
            throw new Exception("Error creating user: " + e.getMessage());
        }
    }
    @GetMapping
    public List<UserEntity> findAll() throws Exception {
        try {
            return this.userService.findAll();
        }catch (Exception e) {
            throw new Exception("Error creating user: " + e.getMessage());
        }
    }

    @GetMapping("/{email}")
    public UserEntity findByEmail(@PathVariable String email) throws Exception {
        try {
            return this.userService.findByEmail(email);
        }catch (Exception e) {
            throw new Exception("Error creating user: " + e.getMessage());
        }
    }
}
