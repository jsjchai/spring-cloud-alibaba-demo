package com.jsjchai;


import com.jsjchai.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author jsjchai.
 */
@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class NacosConfigUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigUserApplication.class, args);
    }
}
