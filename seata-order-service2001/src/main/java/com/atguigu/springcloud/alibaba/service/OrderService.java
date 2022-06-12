package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;

/**
 * @author fzzstart
 * @create 2022-06-12 9:34
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
