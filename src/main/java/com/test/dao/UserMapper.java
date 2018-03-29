package com.test.dao;

import com.test.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by admin on 2018/3/28.
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}
