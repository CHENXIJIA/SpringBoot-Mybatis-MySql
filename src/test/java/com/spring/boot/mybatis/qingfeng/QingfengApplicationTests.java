package com.spring.boot.mybatis.qingfeng;

import com.spring.boot.mybatis.qingfeng.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QingfengApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void queryTest() {
		userService.query();
	}

}
