package com.itguigu.springcloud.impl;

import com.itguigu.springcloud.dao.PaymentDao;
import com.itguigu.springcloud.entities.Payment;
import com.itguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @AUTHOR HU
 * @DATE 年04月16日22:06
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
