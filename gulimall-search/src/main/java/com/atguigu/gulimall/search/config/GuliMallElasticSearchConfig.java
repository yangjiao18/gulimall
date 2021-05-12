package com.atguigu.gulimall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jackCode
 * @date 2021-01-02 11:41 上午
 * @description
 * 1 导入依赖
 * 2 编写配置 给容器中注入一个RestHighLevelClient
 * 3 参API
 */

@Configuration
public class GuliMallElasticSearchConfig {

    public static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        COMMON_OPTIONS = builder.build();
    }

    @Bean
    public RestHighLevelClient esRestClient() {
        RestClientBuilder builder = RestClient.builder(
                new HttpHost("192.168.2.151", 9200, "http")
        );
        RestHighLevelClient client = new RestHighLevelClient(builder);
        return client;
    }
}
