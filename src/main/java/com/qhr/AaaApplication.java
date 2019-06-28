package com.qhr;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qhr.mapper")
public class AaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AaaApplication.class, args);
    }

}
