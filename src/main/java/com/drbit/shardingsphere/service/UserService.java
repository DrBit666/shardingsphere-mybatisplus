package com.drbit.shardingsphere.service;

import com.drbit.shardingsphere.domain.UserPO;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 11:07 AM
 */
public interface UserService {
    void saveUser(UserPO user);

    UserPO getUserById(Long id);
}
