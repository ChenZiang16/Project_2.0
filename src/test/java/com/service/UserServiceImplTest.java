package com.service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.BaseCase;
import com.entry.User;
import com.exception.ServiceException;
import com.util.JsonUtil;

public class UserServiceImplTest extends BaseCase{

	@Autowired
	UserService userService;
	
	@Test
	public void testGetUser() {

	}

	@Test
	public void testFindPersByName() throws ServiceException{
		User user = userService.findPersByName("xiaoming");
		logger.info("\n------"+JsonUtil.parse(user));
	}

}
