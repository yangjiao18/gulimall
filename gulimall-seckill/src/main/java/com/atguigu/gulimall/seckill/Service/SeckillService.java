package com.atguigu.gulimall.seckill.Service;

import com.atguigu.gulimall.seckill.to.SeckillSkuRedisTo;

import java.util.List;

/**
 * @author jackCode
 * @date 2021-02-20 11:18 上午
 * @description
 */
public interface SeckillService {

    void uploadSeckillSkuLatest3Days();

    List<SeckillSkuRedisTo> getCurrentSeckillSkus();

    SeckillSkuRedisTo getSkuSeckillInfo(Long skuId);

    String kill(String killId, String key, Integer num);
}
