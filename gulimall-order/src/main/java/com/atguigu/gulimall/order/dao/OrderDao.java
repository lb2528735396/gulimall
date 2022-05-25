package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liubin
 * @email 2528735396@qq.com
 * @date 2022-05-07 23:41:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
