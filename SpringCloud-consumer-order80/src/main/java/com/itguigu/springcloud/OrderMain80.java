package com.itguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @AUTHOR HU
 * @DATE 年04月16日22:28
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class);
    }
}
