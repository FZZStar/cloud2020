package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author fzzstart
 * @create 2022-05-20 8:58
 */
@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
