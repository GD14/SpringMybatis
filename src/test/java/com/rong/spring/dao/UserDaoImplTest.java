package com.rong.spring.dao;

import com.rong.spring.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/8/24.
 */
public class UserDaoImplTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() throws Exception {
        UserDao userDao=(UserDao) applicationContext.getBean("userDao");
        User user=userDao.getUserById(1);
        System.out.println(user);
    }
}