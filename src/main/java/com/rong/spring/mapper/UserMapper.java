package com.rong.spring.mapper;

import com.rong.spring.pojo.User;
import com.rong.spring.pojo.UserCustom;
import com.rong.spring.pojo.UserQueryVo;

import java.util.List;

/**
 * Created by GD14 on 2017/8/23.
 */
public interface UserMapper {
    public User findUserById(int id) throws Exception;
//    public void insertUser(User user) throws Exception;
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
    public User findUserByIdMap(int id) throws Exception;
}
