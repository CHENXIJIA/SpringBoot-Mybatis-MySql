package com.spring.boot.mybatis.qingfeng.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private int id;
    private String userName;
    private String passWord;
    private char valid;
}
