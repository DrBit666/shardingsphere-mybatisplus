package com.drbit.shardingsphere.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 10:40 AM
 */
@Data
@TableName("t_order")
public class OrderPO {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private Long orderId;
    private Integer orderAmount;
    private String orderRemark;
    private Long addressId;
}
