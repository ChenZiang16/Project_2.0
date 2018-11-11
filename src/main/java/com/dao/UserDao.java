package com.dao;

import java.util.List;

import com.entry.User;

public interface UserDao {
	
	int addUser(User user);
	
	public User getUser(User user);
	
	public List<User> getUserList();
	
	public int countUser();
	
//	public User findPersByName(String name);
}
