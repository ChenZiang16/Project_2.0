package com.service;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseCase;
import com.entry.Role;
import com.util.JsonUtil;

public class RoleServiceImplTest extends BaseCase{

	@Autowired
	RoleService roleService;
	
	@Test
	public void testGetRolesByUserId() {
		List<Role> roles = roleService.getRolesByUserId(0);
		System.out.println("---------"+JsonUtil.parse(roles));
	}

}
