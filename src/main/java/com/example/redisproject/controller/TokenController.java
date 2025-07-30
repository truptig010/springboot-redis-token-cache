package com.example.redisproject.controller;

import com.example.redisproject.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TokenController {

    @Autowired
    TokenService tokenService;
    @GetMapping("/token")
    public ResponseEntity<String> getAccessToken()
    {
        return ResponseEntity.ok(tokenService.getToken());

    }
}
