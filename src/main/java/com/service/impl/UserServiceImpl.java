package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.UserDao;
import com.entry.Permission;
import com.entry.Role;
import com.entry.User;
import com.exception.ServiceException;
import com.service.PermissionService;
import com.service.RoleService;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Autowired
	RoleService roleService;
	@Autowired
	PermissionService permissionService;
	
	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}

	@Override
	public User findPersByName(String name) throws ServiceException{
		
		User user = new User();
		user.setName(name);
		user = userDao.getUser(user);
		
		if(user==null){
			throw new ServiceException("获取用户权限列表出错！");
		}
		
		List<Role> roles = roleService.getRolesByUserId(user.getUsrId());
		
		if(roles==null){
			throw new ServiceException("获取用户权限列表时查询角色信息出错！");
		}
		
		user.setRoles(roles);
		
		for(Role role:roles){
			List<Permission> pers = permissionService.getPermissionsByRoleId(role.getRoleId());
			if(pers !=null && !pers.isEmpty()){
				role.setPermissions(pers);
			}
		}
		
		
		return user;
	}

}
