package com.rong.spring.dao;

import com.rong.spring.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by GD14 on 2017/8/23.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User getUserById(int id) throws Exception {
        SqlSession sqlSession=this.getSqlSession();
        User user= sqlSession.selectOne("test.findUserById",1);
        return user;
    }
}
