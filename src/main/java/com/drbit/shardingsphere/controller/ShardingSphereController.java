package com.drbit.shardingsphere.controller;

import com.drbit.shardingsphere.domain.OrderPO;
import com.drbit.shardingsphere.domain.UserPO;
import com.drbit.shardingsphere.service.OrderService;
import com.drbit.shardingsphere.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 10:40 AM
 */
@RestController
@RequestMapping("/shardingsphere")
public class ShardingSphereController {

    @Resource
    UserService userService;

    @Resource
    OrderService orderService;

    @PostMapping("/put")
    public String insertUser(@RequestBody UserPO user){
        userService.saveUser(user);
        return "success";
    }

    @GetMapping("/get")
    public UserPO getUser(Long id){
        UserPO user = userService.getUserById(id);
        return user;
    }

    @PostMapping("/putOrder")
    public String insertOrder(@RequestBody OrderPO order){
        orderService.insertOne(order);
        return "success";
    }

    @GetMapping("/getOrder")
    public OrderPO getOrder(Long id){
        return orderService.getById(id);
    }

    @GetMapping("/getByOrderId")
    public List<OrderPO> getOrderByOrderId(Long orderId){
        return orderService.getByOrderId(orderId);
    }

}
