package com.jsjchai.service.impl;

import com.google.common.base.Optional;
import com.jsjchai.dao.UserDao;
import com.jsjchai.entity.User;
import com.jsjchai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author jsjchai
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> finadAll() {
        return userDao.finaAll();
    }
}
