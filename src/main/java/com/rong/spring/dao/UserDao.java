package com.rong.spring.dao;

import com.rong.spring.pojo.User;

/**
 * Created by GD14 on 2017/8/23.
 */
public interface UserDao {
    public User getUserById(int id) throws Exception;
}
