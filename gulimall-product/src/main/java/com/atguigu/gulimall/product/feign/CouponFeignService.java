package com.atguigu.gulimall.product.feign;

import com.atguigu.common.to.SkuReductionTo;
import com.atguigu.common.to.SpuBoundTo;
import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author gxl
 * @date 2020/5/31 - 8:57
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * @return
     * @author gxl
     * @Description 1. CouponFeignService.saveSpuBounds(spuBoundTo)
     * 1)、@REquestBody将这个对象转为json
     * 2）、找到gulimall-coupon服务，给/coupon/spubounds/save 发送请求，将上一届转的json放在请求位置，
     * 发送请求
     * 3）、对方服务收到请求。请求体里有json数据
     * （@RequestBody SpuBoundsEntity spuBounds）;将请求体的json转为SpuBoundsEntity;
     * 只要json数据模型是兼容的，双方服务无需使用同一个to
     * @Date 9:19 2020/5/31
     * @Param spuBoundTo
     */

    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);

}
