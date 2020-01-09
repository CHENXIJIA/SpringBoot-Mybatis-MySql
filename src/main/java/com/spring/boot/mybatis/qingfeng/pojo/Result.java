package com.spring.boot.mybatis.qingfeng.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Result {

    private String code;
    private String message;
    private Object data;
}
