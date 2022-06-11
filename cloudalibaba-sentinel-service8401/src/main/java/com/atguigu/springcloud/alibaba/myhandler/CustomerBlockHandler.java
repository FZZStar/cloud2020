package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author fzzstart
 * @create 2022-06-11 14:15
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException e){
        return new CommonResult(2020,"自定义的限流信息");
    }
    public static CommonResult handleException2(BlockException e){
        return new CommonResult(2020,"自定义的限流信息");
    }
}
