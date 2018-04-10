package by.htp.library.service;

import by.htp.library.service.impl.UserServiceImpl;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	private ServiceFactory(){}
	
	private final UserService userService = new UserServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public UserService getUserService(){
		return userService;
	}
	

}
