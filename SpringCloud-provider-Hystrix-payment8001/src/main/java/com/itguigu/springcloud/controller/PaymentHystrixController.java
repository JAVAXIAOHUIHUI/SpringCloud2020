package com.itguigu.springcloud.controller;

import com.itguigu.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @AUTHOR HU
 * @DATE 年04月18日23:02
 */
@RestController
@Slf4j
public class PaymentHystrixController {


        @Resource
        private PaymentHystrixService paymentHystrixService;

        @Value("${server.port}")
        private String servicePort;

        /**
         * 正常访问
         *
         * @param id
         * @return
         */
        @GetMapping("/payment/hystrix/ok/{id}")
        public String paymentInfo_OK(@PathVariable("id") Integer id) {
            String result = paymentHystrixService.paymentInfo_OK(id);
            log.info("*****result:" + result);
            return result;
        }

        /**
         * 超时访问
         *
         * @param id
         * @return
         */
        @GetMapping("/payment/hystrix/timeout/{id}")
        public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
            String result = paymentHystrixService.paymentInfo_TimeOut(id);
            log.info("*****result:" + result);
            return result;

        }


}
