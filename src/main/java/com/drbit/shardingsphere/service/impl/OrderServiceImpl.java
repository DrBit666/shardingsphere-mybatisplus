package com.drbit.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.drbit.shardingsphere.domain.OrderPO;
import com.drbit.shardingsphere.mapper.OrderMapper;
import com.drbit.shardingsphere.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 3:34 PM
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;
    @Override
    public void insertOne(OrderPO order) {
        orderMapper.insert(order);
    }

    @Override
    public OrderPO getById(Long id) {
        return orderMapper.selectById(id);
    }

    public List<OrderPO> getByOrderId(Long orderId){
        return orderMapper.selectList(new QueryWrapper<OrderPO>().eq("order_id",orderId));
    }
}
