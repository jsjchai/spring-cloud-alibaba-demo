package com.jsjchai.config;

import com.jsjchai.service.UserCilentService;
import com.jsjchai.service.impl.UserCilentServiceFallback;
import org.springframework.context.annotation.Bean;

/**
 * @author jsjchai.
 */
public class FeignConfiguration {

    @Bean
    public UserCilentService userCilentService(){
        return new UserCilentServiceFallback();
    }
}
