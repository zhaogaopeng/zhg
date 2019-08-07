package com.example.zhg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @RequestMapping("/index")
    public String index(){

        return "11";
    }
}
