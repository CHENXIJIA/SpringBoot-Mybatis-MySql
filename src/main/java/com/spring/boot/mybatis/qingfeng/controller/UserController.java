package com.spring.boot.mybatis.qingfeng.controller;

import com.spring.boot.mybatis.qingfeng.pojo.Result;
import com.spring.boot.mybatis.qingfeng.pojo.User;
import com.spring.boot.mybatis.qingfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/query")
    @ResponseBody
    public Result query(){
        List<User> query = userService.query();
        Result result = new Result();
        result.setCode("00");
        result.setData(query);
        return result;
    }
}
