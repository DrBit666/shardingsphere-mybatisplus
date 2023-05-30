package com.drbit.shardingsphere.service.impl;

import com.drbit.shardingsphere.domain.UserPO;
import com.drbit.shardingsphere.mapper.UserMapper;
import com.drbit.shardingsphere.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 11:07 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    @Override
    public void saveUser(UserPO user) {
        userMapper.insertOne(user);
    }

    @Override
    public UserPO getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
