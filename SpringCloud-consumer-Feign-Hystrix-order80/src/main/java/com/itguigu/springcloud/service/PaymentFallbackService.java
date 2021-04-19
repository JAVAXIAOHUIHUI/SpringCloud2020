package com.itguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @AUTHOR HU
 * @DATE 年04月19日21:52
 */
@Component
public class PaymentFallbackService implements HystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService====================paymentInfo_OK==========================";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService====================paymentInfo_TimeOut==========================";
    }
}
