package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author guoxiaolong
 * @email 18240885452@163.com
 * @date 2020-05-16 02:48:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
