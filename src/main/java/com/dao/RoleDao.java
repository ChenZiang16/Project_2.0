package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entry.Role;

public interface RoleDao {
	
	public List<Role> getRolesByUserId(@Param("userId")long userId);
	
	public List<Role> getAllRoles();
	
}
