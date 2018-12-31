package com.jsjchai.service;


import com.jsjchai.config.FeignConfiguration;
import com.jsjchai.entity.User;
import com.jsjchai.service.impl.UserCilentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jsjchai.
 */
//@FeignClient(name = "user-provider")
@FeignClient(name = "user-provider",fallback = UserCilentServiceFallback.class,configuration = FeignConfiguration.class)
public interface  UserCilentService {

    @GetMapping("/user/findAll")
    List<User> findAll();
}
