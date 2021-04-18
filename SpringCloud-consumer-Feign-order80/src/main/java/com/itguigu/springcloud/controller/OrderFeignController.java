package com.itguigu.springcloud.controller;

import com.itguigu.springcloud.entities.CommonResult;
import com.itguigu.springcloud.entities.Payment;
import com.itguigu.springcloud.service.OrderFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @AUTHOR HU
 * @DATE 年04月18日22:15
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private OrderFeignService orderFeignService;

    @PostMapping(value = "/feign/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
       return orderFeignService.create(payment);
    }

    @GetMapping(value = "/feign/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
       return orderFeignService.getPaymentById(id);
    }
}
