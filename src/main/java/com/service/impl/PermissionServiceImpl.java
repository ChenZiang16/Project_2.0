package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PermissionDao;
import com.entry.Permission;
import com.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	PermissionDao permissionDao;
	
	@Override
	public List<Permission> getPermissionsByRoleId(long roleId) {
		return permissionDao.getPermissionsByRoleId(roleId);
	}

}
