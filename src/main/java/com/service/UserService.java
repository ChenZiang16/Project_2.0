package com.service;

import com.entry.User;
import com.exception.ServiceException;

public interface UserService {
	public User getUser(User user);
	public User findPersByName(String name) throws ServiceException;
}
