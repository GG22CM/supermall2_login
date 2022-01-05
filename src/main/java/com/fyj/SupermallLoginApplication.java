package com.fyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fyj.mapper")
public class SupermallLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermallLoginApplication.class, args);
    }

}
