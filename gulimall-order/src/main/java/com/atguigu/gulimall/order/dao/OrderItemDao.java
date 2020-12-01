package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chen
 * @email 15149157257@sina.cn
 * @date 2020-10-06 17:38:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
