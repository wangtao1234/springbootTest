package com.test.service;

import com.test.domain.User;

import java.util.List;

/**
 * Created by admin on 2018/3/28.
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    User getUser();
}
