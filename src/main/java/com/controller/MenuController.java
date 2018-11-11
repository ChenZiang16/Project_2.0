package com.controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entry.Menu;
import com.entry.Role;
import com.entry.User;
import com.entry.ZtreeMenu;
import com.exception.ServiceException;
import com.service.MenuService;
import com.service.RoleService;
import com.util.JsonUtil;

@Controller
public class MenuController extends BaseController{

	@Autowired
	RoleService roleService;
	@Autowired
	MenuService menuService;
	
	@RequestMapping(value="getMenus",method = RequestMethod.POST)
	@ResponseBody
	public Object getMenus() throws ServiceException{
		
		//使用登录成功后在MyShiroRealm中保存的userId
		long currentUserId = (long)SecurityUtils.getSubject().getSession().getAttribute("currentUserId");

		List<Role> roles = roleService.getRolesByUserId(currentUserId);
		
		if(roles ==null){
			throw new ServiceException("用户缺少权限!");
		}
		
		roles = menuService.getMenusByRoles(roles);
		
		if(roles ==null){
			throw new ServiceException("根据角色获取菜单出错!");
		}
		
		List<Menu> menuResult = new ArrayList<>();
		List<Menu> menuList = new ArrayList<>();
		for(Role role:roles) {
			menuList = role.getMenus();
			for(Menu menu:menuList) {
				boolean noHas = true;
				for(Menu me:menuResult) {
					if(menu.getMenuId() == me.getMenuId()) {
						noHas =false;
					}
				}
				
				if(noHas) {
					menuResult.add(menu);
				}
				
			}
			
		}
		
		List<ZtreeMenu> menuTree = new ArrayList<>();
		
		for(Menu menu:menuResult) {
			ZtreeMenu zMenu = new ZtreeMenu();
			zMenu.setId(menu.getMenuId());
			zMenu.setpId(menu.getParentId());
			zMenu.setName(menu.getMenuName());
			zMenu.setUrl(menu.getLinkUrl());
			zMenu.setIsParent(menu.isParent());
			menuTree.add(zMenu);
		}
		
		return menuTree;
	}
	
}
