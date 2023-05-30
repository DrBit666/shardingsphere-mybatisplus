package com.drbit.shardingsphere.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.drbit.shardingsphere.domain.OrderPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangzihe@wondersgroup.com
 * @version 1.0
 * @desc
 * @date:2023/5/30 3:32 PM
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderPO> {
}
