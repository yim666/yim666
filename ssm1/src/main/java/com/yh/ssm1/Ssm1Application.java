package com.yh.ssm1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yh.ssm1.dao")
public class Ssm1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ssm1Application.class, args);
    }

}
