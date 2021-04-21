package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author jackCode
 * @date 2020-12-27 4:39 下午
 * @description
 */

@Data
public class PurchaseDoneVo {

    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;

}
