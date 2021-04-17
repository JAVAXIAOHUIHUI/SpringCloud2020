package com.itguigu.springcloud.service;

import com.itguigu.springcloud.entities.Payment;

/**
 * @AUTHOR HU
 * @DATE 年04月16日22:04
 */
public interface PaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询订单类
     * @param paymentId
     * @return
     */
    public Payment getPaymentById(Long paymentId);
}
