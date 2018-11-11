package com.service;

import java.util.List;

import com.entry.Role;

public interface RoleService {

	//获取用户所有角色
	public List<Role> getRolesByUserId(long userId);
	
	public List<Role> getAllRoles();
	
}
