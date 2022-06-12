package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fzzstart
 * @create 2022-06-12 9:50
 */
@Configuration
@MapperScan(basePackages = "com.atguigu.springcloud.alibaba.dao")
public class MyBatisConfig {
}
