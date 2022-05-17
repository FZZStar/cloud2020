package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author fzzstart
 * @create 2022-05-16 15:58
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("******" + "添加成功" + result + "\t 服务端口：" + serverPort + "\t");

        if (result > 0) {
            return new CommonResult<Integer>(200, "插入数据成功,服务端口：" + serverPort, result);
        } else {
            return new CommonResult<Integer>(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果" + "\t" + payment + "\t" + "服务端口：" + serverPort);

        if (payment != null) {
            return new CommonResult(200, "查询成功,服务端口：" + serverPort, payment);
        } else {
            return new CommonResult<Payment>(444, "没有对应记录，查询" + id, null);
        }
    }
}
