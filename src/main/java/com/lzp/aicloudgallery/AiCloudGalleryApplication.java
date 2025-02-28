package com.lzp.aicloudgallery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzp.aicloudgallery.mapper")
public class AiCloudGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCloudGalleryApplication.class, args);
    }

}
