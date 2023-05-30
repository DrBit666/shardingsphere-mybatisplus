package com.drbit.shardingsphere.mapper;

import com.drbit.shardingsphere.domain.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 11:06 AM
 */
@Mapper
public interface UserMapper{
    void insertOne(@Param("user") UserPO user);

    UserPO selectById(Long id);
}
