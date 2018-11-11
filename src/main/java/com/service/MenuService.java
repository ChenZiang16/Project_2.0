package com.service;

import java.util.List;

import com.entry.Role;
import com.exception.ServiceException;

public interface MenuService {
	
	public Role getMenusByRole(Role role) throws ServiceException ;
	
	public List<Role> getMenusByRoles(List<Role> roles);
	
	public int deleteMenusByRole(Role role);
	
	public int addRoleMenus(Role role);
	
}
