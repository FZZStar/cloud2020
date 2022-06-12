package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fzzstart
 * @create 2022-06-12 12:32
 */
@FeignClient(value = "seata-storage-service")
@Component
public interface StorageService {

    /**
     * 扣减库存
     */
    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
