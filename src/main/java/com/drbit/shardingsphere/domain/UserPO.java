package com.drbit.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 11:04 AM
 */
@Data
public class UserPO {

    private Long id;
    private Long userId;
    private String userName;
    private Integer age;

}
