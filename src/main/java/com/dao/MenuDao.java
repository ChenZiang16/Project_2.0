package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entry.Menu;
import com.entry.Role;

public interface MenuDao {
	
	public List<Menu> getMenusByRole(Role role);
	
	public List<Role> getMenusByRoles(@Param("roleList")List<Role> roles);
	
	public int deleteMenusByRole(Role role);
	
	public int addRoleMenus(Role role);

}
