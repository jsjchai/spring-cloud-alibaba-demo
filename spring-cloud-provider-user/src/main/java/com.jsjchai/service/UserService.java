package com.jsjchai.service;

import com.jsjchai.entity.User;

import java.util.List;


/**
 * @author jsjchai
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> finadAll();
}
