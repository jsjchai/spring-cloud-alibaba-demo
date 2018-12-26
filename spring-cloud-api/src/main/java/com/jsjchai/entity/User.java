package com.jsjchai.entity;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

/**
 * @author jsjchai
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "user")
@ToString
public class User {

    private Long id;

    private String name;

    private Integer age;
}
