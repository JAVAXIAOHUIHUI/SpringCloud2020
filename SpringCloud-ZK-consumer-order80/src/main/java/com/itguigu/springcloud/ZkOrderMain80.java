package com.itguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @AUTHOR HU
 * @DATE 年04月18日0:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrderMain80.class);
    }
}
