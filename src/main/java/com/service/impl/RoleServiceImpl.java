package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RoleDao;
import com.entry.Role;
import com.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao roleDao;

	@Override
	public List<Role> getRolesByUserId(long userId) {
		return roleDao.getRolesByUserId(userId);
	}

	@Override
	public List<Role> getAllRoles() {
		return null;
	}

}
