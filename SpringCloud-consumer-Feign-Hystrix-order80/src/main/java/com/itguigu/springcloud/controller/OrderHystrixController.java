package com.itguigu.springcloud.controller;

import com.itguigu.springcloud.service.HystrixService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @AUTHOR HU
 * @DATE 年04月19日21:22
 */
@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private HystrixService hystrixService;

    @GetMapping("/order/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = hystrixService.paymentInfo_OK(id);
        log.info("order*****result:" + result);
        return result;
    }

    /**
     * 超时访问
     *
     * @param id
     * @return
     */

    @GetMapping("/order/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = hystrixService.paymentInfo_TimeOut(id);
        log.info("order*****result:" + result);
        return result;

    }
}
