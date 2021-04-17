package com.itguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @AUTHOR HU
 * @DATE 年04月17日22:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(ZkPaymentMain8004.class);
    }
}
