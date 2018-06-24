package com.fengwenyi.learn.java.mybatisenum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fengwenyi.learn.java.mybatisenum.dao")
public class MybatisEnumApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisEnumApplication.class, args);
    }
}
