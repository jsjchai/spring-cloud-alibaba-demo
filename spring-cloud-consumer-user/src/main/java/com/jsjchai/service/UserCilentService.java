package com.jsjchai.service;


import com.jsjchai.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jsjchai.
 */
@FeignClient(name = "user-provider")
public interface  UserCilentService {

    @GetMapping("/user/findAll")
    List<User> findAll();
}
