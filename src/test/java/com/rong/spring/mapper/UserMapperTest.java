package com.rong.spring.mapper;

import com.rong.spring.dao.UserDao;
import com.rong.spring.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/8/24.
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() throws Exception {
        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
        User user=userMapper.findUserById(4);
        System.out.println(user);
    }
}