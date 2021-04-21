package com.atguigu.gulimall.search.service;

import com.atguigu.gulimall.search.vo.SearchParam;
import com.atguigu.gulimall.search.vo.SearchResult;

/**
 * @author jackCode
 * @date 2021-01-14 10:04 上午
 * @description
 */
public interface MallSearchService {

    /**
     * es search
     *
     * @param param
     * @return
     */
    SearchResult search(SearchParam param);
}
