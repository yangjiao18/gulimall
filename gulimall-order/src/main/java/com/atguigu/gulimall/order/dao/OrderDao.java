package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chen
 * @email 15149157257@sina.cn
 * @date 2020-10-06 17:38:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
