package com.mall.tiny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: untitled
 * @description: 测试用
 * @author: hxl
 * @create: 2022-10-17 16:32
 **/
//@MapperScan("com.mall.tiny.mbg.mapper")
@SpringBootApplication
public class MallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class,args);
    }
}
