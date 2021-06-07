package com.example.optimist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 65667
 */
@SpringBootApplication
@MapperScan("com.example.optimist.mapper")
public class SixInchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SixInchApplication.class, args);
    }

}
