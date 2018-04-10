package by.htp.library.service.impl;

import by.htp.library.domain.User;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class UserServiceImpl implements UserService{


	public User signin(String login,String password) throws ServiceException {

        User user = new User();
        user.setName("Vasya");
		
		return user;
	}

}
