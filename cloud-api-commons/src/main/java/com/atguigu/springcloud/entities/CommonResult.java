package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fzzstart
 * @create 2022-05-16 21:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code; //例如404，之类的编码
    private String message; //成功或失败的提示信息
    private T data; //返回的数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
