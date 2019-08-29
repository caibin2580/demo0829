package com.yuanian.demo;

import com.yuanian.bean.UserRole;
import com.yuanian.mapper.UserRoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserRoleMapper userRoleMapper;
	@Test
	public void contextLoads() {
		List<UserRole> ur = userRoleMapper.findUserRole();
		System.out.println(ur.size());
	}

}
