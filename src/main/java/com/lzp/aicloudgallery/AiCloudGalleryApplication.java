package com.lzp.aicloudgallery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.lzp.aicloudgallery.mapper")
// 暴露代理对象
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiCloudGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCloudGalleryApplication.class, args);
    }

}
