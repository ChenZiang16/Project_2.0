package com.service;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.BaseCase;
import com.entry.Role;
import com.exception.ServiceException;
import com.util.JsonUtil;

public class MenuServiceImplTest extends BaseCase{
	
	@Autowired
	MenuService menuService;

	@Test
	public void testGetMenusByRole() throws ServiceException {
		Role role = new Role();
		role.setRoleId(2001);
		role = menuService.getMenusByRole(role);
		System.out.println("----------------result-----------------");
		System.out.println(JsonUtil.parse(role.getMenus()));
		
	}
	
	@Test
	public void testGetMenusByRoles(){
		
		Role role1 = new Role();
		role1.setRoleId(2001);
		Role role2 = new Role();
		role2.setRoleId(2002);
		List<Role> roles = new ArrayList<>();
		roles.add(role1);
		roles.add(role2);
		List<Role> list = menuService.getMenusByRoles(roles);
		System.out.println(JsonUtil.parse(list));
	}	

}
