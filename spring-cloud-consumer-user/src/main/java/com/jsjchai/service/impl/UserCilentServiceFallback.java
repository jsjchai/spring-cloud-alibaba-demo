package com.jsjchai.service.impl;

import com.jsjchai.entity.User;
import com.jsjchai.service.UserCilentService;

import java.util.Collections;
import java.util.List;

/**
 * @author jsjchai.
 */
public class UserCilentServiceFallback implements UserCilentService {

    @Override
    public List<User> findAll() {
        return Collections.emptyList();
    }
}
