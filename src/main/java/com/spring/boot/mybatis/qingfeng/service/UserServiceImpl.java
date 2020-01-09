package com.spring.boot.mybatis.qingfeng.service;

import com.spring.boot.mybatis.qingfeng.dao.UserMapper;
import com.spring.boot.mybatis.qingfeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper UserMapper;

    @Override
    public List<User> query() {
        return UserMapper.query();
    }
}
