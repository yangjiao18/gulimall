package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chen
 * @email 15149157257@sina.cn
 * @date 2020-10-06 17:48:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
