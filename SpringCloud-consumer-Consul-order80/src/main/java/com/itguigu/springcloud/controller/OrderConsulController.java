package com.itguigu.springcloud.controller;

import com.itguigu.springcloud.entities.CommonResult;
import com.itguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @AUTHOR HU
 * @DATE 年04月16日22:34
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 新增订单
     * @return
     */
    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
    }

}

