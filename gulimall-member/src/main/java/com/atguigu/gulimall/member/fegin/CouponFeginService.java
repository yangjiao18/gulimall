package com.atguigu.gulimall.member.fegin;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassDesc:功能描述 远程调用优惠卷服务
 * @author: chen
 * @CreateTime:2020/10/7 10:48
 * @version: 1.0
 * @copyright: 个人项目
 */
@FeignClient("gulimall-coupon")
public interface CouponFeginService {

    @RequestMapping("/coupon/coupon/testOpenFegin")
    public R memberCoupons();
}
