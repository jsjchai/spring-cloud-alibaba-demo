package com.jsjchai.dao;

import com.jsjchai.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author jsjchai
 */
@Mapper
public interface UserDao {

    List<User> finaAll();
}
