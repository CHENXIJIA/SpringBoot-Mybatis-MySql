package com.spring.boot.mybatis.qingfeng.service;

import com.spring.boot.mybatis.qingfeng.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> query();
}
