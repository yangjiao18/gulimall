package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author guoxiaolong
 * @email 18240885452@163.com
 * @date 2020-05-16 02:48:45
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
    * @author gxl
    * @Description  找到 cateLogid的完整路径；
     * 【父/子/孙】
    * @Date 20:38 2020/5/24
    * @Param 
    * @return
    */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

}

