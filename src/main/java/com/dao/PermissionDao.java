package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entry.Permission;

public interface PermissionDao {
	public List<Permission> getPermissionsByRoleId(@Param("roleId")long roleId);
}
