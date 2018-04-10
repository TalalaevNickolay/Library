package by.htp.library.dao;

import by.htp.library.dao.impl.SQLUserDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	
	private final SQLUserDAO userDAO = new SQLUserDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}



	public UserDAO getUserDAO() {
		return userDAO;
	}


}
