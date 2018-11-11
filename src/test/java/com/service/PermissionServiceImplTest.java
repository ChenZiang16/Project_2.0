package com.service;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.BaseCase;
import com.entry.Permission;
import com.util.JsonUtil;

public class PermissionServiceImplTest extends BaseCase{

	@Autowired
	PermissionService permissionService;
	
	@Test
	public void testGetPermissionsByRoleId() {
		List<Permission> list = permissionService.getPermissionsByRoleId(2001);
		System.out.println(JsonUtil.parse(list));
	}

}
