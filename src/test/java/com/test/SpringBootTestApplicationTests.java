package com.test;

import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {

	@Autowired
	private UserService service;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testAOP(){
		service.getUser();
	}
}
