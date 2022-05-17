package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fzzstart
 * @create 2022-05-17 10:41
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    
    public Payment getPaymentById(Long id);
}
