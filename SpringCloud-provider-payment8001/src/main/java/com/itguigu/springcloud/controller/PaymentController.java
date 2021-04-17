package com.itguigu.springcloud.controller;

import com.itguigu.springcloud.entities.CommonResult;
import com.itguigu.springcloud.entities.Payment;
import com.itguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author hu
 * @create 2020-02-18 10:43
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result + serverPort);

        if(result > 0) {
            return new CommonResult(200,"插入数据库成功,ip ：" + serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败,ip ：" + serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null) {
            return new CommonResult(200,"查询成功,ip ：" + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id +serverPort,null);
        }
    }
}

