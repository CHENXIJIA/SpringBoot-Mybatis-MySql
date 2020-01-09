package com.spring.boot.mybatis.qingfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.boot.mybatis.qingfeng.dao")
public class QingfengApplication {

	public static void main(String[] args) {

		SpringApplication.run(QingfengApplication.class, args);
	}

}
