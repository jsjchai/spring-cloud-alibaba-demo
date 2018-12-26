package com.jsjchai.controller;

import com.jsjchai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author jsjchai.
 */
@RestController
@RefreshScope
public class UserConfigController {

    /**
     * jconsole 设置值
     * MBean->org.springframework.cloud.context.environment->操作->设置属性
     */
    //@Autowired
    private User user;


    @GetMapping("/config/getUser")
    public User getUser() {
        return user;
    }


}
