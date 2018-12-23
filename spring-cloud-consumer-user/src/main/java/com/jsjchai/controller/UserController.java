package com.jsjchai.controller;

import com.jsjchai.entity.User;
import com.jsjchai.service.UserCilentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserCilentService userCilentService;


    @GetMapping(value = "/user-rest")
    public List<User> rest() {
        return restTemplate.getForObject("http://user-provider/user/findAll",List.class);
    }

    @GetMapping(value = "/user-feign")
    public List<User> feign() {
        return userCilentService.findAll();
    }
}
