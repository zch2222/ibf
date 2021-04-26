package com.wbc.word.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @RequestMapping(value = "/put")
    public void put(String key, @RequestParam(required = false, defaultValue = "default") String value){

        stringRedisTemplate.opsForValue().set(key, value);
    }

    @GetMapping(value = "/get")
    public Object get(String key){

        return stringRedisTemplate.opsForValue().get(key);


    }
    @GetMapping(value = "/getstrlist")
    public List<String> getstrlist(String key){

        // List<Object> languageList = redisTemplate.opsForList().range(RedisConstantKey.MY_REDIS_LIST.key, 0, -1);

        List<String> list=stringRedisTemplate.opsForList().range(key,0,-1);
        return list;
    }

    @GetMapping(value = "/getobjlist")
    public List<Object> getobjlist(String key){
       // List<Object> languageList = redisTemplate.opsForList().range(RedisConstantKey.MY_REDIS_LIST.key, 0, -1);

         List<Object> list = redisTemplate.opsForList().range(key, 0, -1);
        System.out.println("sizeeeeee"+list.size());

        return list;
    }



    private void getvues(){

    }


}
