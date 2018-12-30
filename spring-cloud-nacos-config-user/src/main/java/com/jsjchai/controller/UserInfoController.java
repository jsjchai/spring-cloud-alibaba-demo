package com.jsjchai.controller;


import com.jsjchai.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author jsjchai.
 */
@RestController
@RefreshScope
public class UserInfoController {

    @Value("${user.id}")
    private Long id;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;


    @GetMapping("/config/getUserInfo")
    public String getUserInfo() {
        User user = new User();
        user.setName(name);
        user.setId(id);
        user.setAge(age);
        return user.toString();
    }
}
