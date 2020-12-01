package com.atguigu.gulimall.product;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.InputStream;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;



    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("测试");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }


    //阿里云 oss 简单上传图片示例
    @Test
    public void upload() throws Exception {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4G1B2EvoyW4NHj3awAJL";
        String accessKeySecret = "uh0AVj6ZVGlsKSUH41CPMkXMzx00yz";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        InputStream inputStream = new FileInputStream("D:\\dest\\谷粒商城\\资料源码\\docs\\pics\\0d40c24b264aa511.jpg");
        ossClient.putObject("chengulimall", "0d40c24b264aa511.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成...");
    }
}