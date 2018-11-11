package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MenuDao;
import com.entry.Menu;
import com.entry.Role;
import com.exception.ServiceException;
import com.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuDao menuDao;

	@Override
	public Role getMenusByRole(Role role) throws ServiceException {
		List<Menu> menus = menuDao.getMenusByRole(role);
		if(menus ==null){
			throw new ServiceException("根据角色获取菜单出错！");
		}
		role.setMenus(menus);
		return role;
	}

	@Override
	public int deleteMenusByRole(Role role) {
		return menuDao.deleteMenusByRole(role);
	}

	@Override
	public int addRoleMenus(Role role) {
		return menuDao.addRoleMenus(role);
	}

	@Override
	public List<Role> getMenusByRoles(List<Role> roles) {
		return menuDao.getMenusByRoles(roles);
	}
	
	

}
