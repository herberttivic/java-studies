package com.learning._22springauth.controllers;

import com.learning._22springauth.dtos.AuthLoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthLoginDto body) {

//        LOGICA DE AUTHENTICACAO
        return ResponseEntity.ok().build();
    }

}
