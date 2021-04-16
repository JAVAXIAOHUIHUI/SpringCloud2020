package com.itguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @AUTHOR HU
 * @DATE 年04月16日21:57
 * 创建JSON封装返回类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }

}
