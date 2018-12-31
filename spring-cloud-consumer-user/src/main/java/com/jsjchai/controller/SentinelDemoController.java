package com.jsjchai.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Sentinel限流框架 demo
 * @author jsjchai.
 */
@RestController
public class SentinelDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    @SentinelResource("hello")
    public String hello() {
        return "Hello Sentinel";
    }

    @GetMapping(value = "/testException")
    public String client() {
        return restTemplate.getForObject("http://test-provider/test", String.class);
    }

}
