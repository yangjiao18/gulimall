package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author jackCode
 * @date 2020-12-26 11:47 上午
 * @description
 */

@Data
public class SpuBoundsTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
