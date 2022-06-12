package com.atguigu.springcloud.alibaba.service;

/**
 * @author fzzstart
 * @create 2022-06-12 12:11
 */
public interface StorageService {
    
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
