package com.itguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @AUTHOR HU
 * @DATE 年04月18日22:59
 */
public interface PaymentHystrixService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

}
