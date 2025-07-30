package com.example.redisproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class TokenService {

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    public String getToken(){
        String token=redisTemplate.opsForValue().get("access_token");
        if(token==null){
            token=getTokenFromAPI();// Write a logic to get Token ,could be third party api or you creating your own token
            redisTemplate.opsForValue().set("access_token",token,30, TimeUnit.SECONDS);
            System.out.println("Fetched new token and stored in Redis: " + token);
        }
        return token;
    }

    public String getTokenFromAPI(){
        return UUID.randomUUID().toString();
    }
}
