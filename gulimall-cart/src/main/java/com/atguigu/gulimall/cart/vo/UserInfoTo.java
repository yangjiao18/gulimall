package com.atguigu.gulimall.cart.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author jackCode
 * @date 2021-02-03 3:13 下午
 * @description
 */
@ToString
@Data
public class UserInfoTo {

    private Long userId;
    private String userKey;//一定要有的

    private boolean tempUser = false;
}
