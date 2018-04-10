package by.htp.library.service;

import by.htp.library.domain.User;
import by.htp.library.service.exception.ServiceException;

public interface UserService {
	
	User signin(String login,String password) throws ServiceException;
	

}
