package com.spring.boot.mybatis.qingfeng.dao;

import com.spring.boot.mybatis.qingfeng.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> query();
}
