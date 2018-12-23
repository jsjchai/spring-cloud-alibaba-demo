package com.jsjchai.controller;

import com.jsjchai.entity.User;
import com.jsjchai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ author jsjchai.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/findAll")
    public List<User> findAll(){
        return userService.finadAll();
    }

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "hello Nacos Discovery " + string;
    }

}
