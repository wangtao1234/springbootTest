package com.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.test.dao.UserMapper;
import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/3/28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }

    @Override
    public User getUser() {
        System.out.println("调用AOP测试");
        return null;
    }
}
