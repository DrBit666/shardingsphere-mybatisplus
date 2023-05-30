package com.drbit.shardingsphere.service;

import com.drbit.shardingsphere.domain.OrderPO;
import com.drbit.shardingsphere.mapper.OrderMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 3:34 PM
 */
public interface OrderService {
    void insertOne(OrderPO order);

    OrderPO getById(Long id);

    List<OrderPO> getByOrderId(Long orderId);
}
