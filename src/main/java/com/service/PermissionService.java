package com.service;

import java.util.List;
import com.entry.Permission;

public interface PermissionService {

	public List<Permission> getPermissionsByRoleId(long roleId);
	
}
